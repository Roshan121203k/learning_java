package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Employee;
import com.example.entity.EmployeeForm;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Controller
@Transactional
public class EmployeeController {
	@Autowired
    private EmployeeRepository repo;

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("listEmployees", service.getAllEmployees());
        return "index";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "form";
    }

   
    	@PostMapping("/save")
    	public String saveEmployee(@ModelAttribute EmployeeForm form) throws Exception {
    		if(repo.findById(form.getId()) != null) {
    			Employee temp = repo.findById(form.getId()).orElseThrow();
    			
    			
        	    temp.setName(form.getName());
        	    temp.setEmail(form.getEmail());
        	    temp.setRole(form.getRole());

        	   
        	    temp.setImage(form.getImage().getBytes());
//        	    service.saveEmployee(temp);
    		}else {
    	    Employee emp = new Employee();
    	    emp.setName(form.getName());
    	    emp.setEmail(form.getEmail());
    	    emp.setRole(form.getRole());

    	   
    	    emp.setImage(form.getImage().getBytes());

    	    service.saveEmployee(emp);
    		}
    	    return "redirect:/";
    	    
    	}
    

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        model.addAttribute("employee", service.getEmployeeById(id));
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "redirect:/";
    }
    
    @GetMapping("/image/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) {

        Employee emp = repo.findById(id).orElse(null);

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG) 
                .body(emp.getImage());
    }
}	
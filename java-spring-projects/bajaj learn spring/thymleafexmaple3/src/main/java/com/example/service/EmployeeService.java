package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public void saveEmployee(Employee emp) {
        repo.save(emp);
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
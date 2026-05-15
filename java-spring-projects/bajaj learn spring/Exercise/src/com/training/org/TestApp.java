package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.*;
import com.training.interfaces.CityDAO;
import com.training.interfaces.StateDAO;

public class MainApp {

    public static void main(String[] args) {

        
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

      
        StateDAO stateDAO = context.getBean(StateDAO.class);
        CityDAO cityDAO = context.getBean(CityDAO.class);

       
        System.out.println("=== STATE OPERATIONS ===");

        State s1 = new State("MH", "Maharashtra", 120000000, "India", "Mumbai");
        stateDAO.save(s1);

        State s2 = new State("KA", "Karnataka", 70000000, "India", "Bangalore");
        stateDAO.save(s2);
        
        
        System.out.println("\n=== CITY OPERATIONS ===");

        City c1 = new City("Pune", "MH", "Pune", 411001,
                18.5204, 73.8567, 7000000);
        cityDAO.saveCity(c1);

        City c2 = new City("Mumbai", "MH", "Mumbai", 400001,
                19.0760, 72.8777, 20000000);
        cityDAO.saveCity(c2);


    }
}
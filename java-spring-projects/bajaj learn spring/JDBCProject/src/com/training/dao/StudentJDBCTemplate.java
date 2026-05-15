package com.training.dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "INSERT INTO Student (name, age) VALUES (?, ?)";
        
     
        jdbcTemplate.update(sql, name, age);
        
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }
}
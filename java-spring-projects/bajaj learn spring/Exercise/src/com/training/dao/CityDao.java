package com.training.dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class CityDao {

    DataSource dataSource;
    JdbcTemplate jdbcTemplate;

    public DataSource getObj() {
        return dataSource;
    }

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

   
    public void createCity(String cityName, int stateId) {
        String query = "INSERT INTO cities(city_name, state_id) VALUES(?, ?)";
        jdbcTemplate.update(query, cityName, stateId);
        System.out.println("City inserted successfully");
    }

    
    public List<String> getAllCities() {
        String query = "SELECT city_name FROM cities";
        return jdbcTemplate.queryForList(query, String.class);
    }

    public List<String> getCitiesWithState() {
        String query = "SELECT c.city_name, s.state_name " +
                       "FROM cities c inner join states s " +
                       "ON c.state_id = s.state_id";

        return jdbcTemplate.query(query, (rs, rowNum) ->
                rs.getString("city_name") + " - " + rs.getString("state_name")
        );
    }
   

  

    
}
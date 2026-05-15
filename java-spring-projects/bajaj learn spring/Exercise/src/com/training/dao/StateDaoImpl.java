
package com.training.DAOImplementation;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.State;
import com.training.interfaces.StateDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
public class StateDAOImpl implements StateDAO {

    private JdbcTemplate jdbcTemplate;

    public StateDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(State state) {
        String sql = "INSERT INTO state (code, name, population, country, capital) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                state.getCode(),
                state.getName(),
                state.getPopulation(),
                state.getCountry(),
                state.getCapital());
    }
}
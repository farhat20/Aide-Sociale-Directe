package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void checkDatabaseConnection() {
        // Simple query to check database connection
        String sql = "SELECT 1";

        // Execute the query
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);

        if (result != null && result == 1) {
            System.out.println("Database connection is successful!");
        } else {
            System.out.println("Database connection failed!");
        }
    }
}

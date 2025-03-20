package com.TeluskoFirst.learning.repository;


import com.TeluskoFirst.learning.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepository {

    JdbcTemplate jdbcTemplate ;

    @Autowired
    public AlienRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Alien alien){
        String querry1= "insert into alien (id,name,tech) values (?,?,?)";
       jdbcTemplate.update(querry1,alien.getId(), alien.getName(), alien.getTech());
        System.out.println("Saved");
    }
    public List<Alien> getAll(){


        return new ArrayList<>();
    }


}

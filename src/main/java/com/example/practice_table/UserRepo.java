package com.example.practice_table;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<Users, Long>{
    

}

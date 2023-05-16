package com.example.practice_table;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/data")
@NoArgsConstructor
public class TableController {
    

    private UserRepo userRepo;

    public TableController(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @PostMapping("/insert")
    public Users insertData(@RequestBody Users user){
        return userRepo.save(user);
    }

    @GetMapping("/get")
    public ArrayList<Users> getData(){
        return (ArrayList<Users>) userRepo.findAll();
    }
}

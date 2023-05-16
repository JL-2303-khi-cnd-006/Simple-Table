package com.example.practice_table;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "simpletable")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    @Column(name = "Name")
    private String uname;

    @Column(name = "Password")
    private String upassword;
    
    @Column(name = "Date")
    private Date date; 

    public Users(){

    }

    public Users(Long id, String name, String password, Date date){
        super();
        this.uid = id;
        this.uname = name;
        this.upassword = password;
        this.date = date;
    }

}

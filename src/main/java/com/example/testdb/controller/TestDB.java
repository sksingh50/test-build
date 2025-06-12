package com.example.testdb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/testDb")
public class TestDB {




@Autowired
Repository repo;


    //http://localhost:8080/api/testDb/get
    @GetMapping("/get")
    public ResponseEntity< List<Messages>> getAll(){


        List<Messages> allMessages = repo.findAll();
        System.out.println(allMessages);


        return new ResponseEntity<>(allMessages, HttpStatus.OK);

    }



    //http://localhost:8080/api/testDb/save
    @PostMapping ("/save")
    public ResponseEntity<Messages> saveMessage(@RequestBody Messages msg){


        Messages msg1 = new Messages();
        msg1.setContent(msg.getContent());

        Messages savedMessage = repo.save(msg1);


        return new ResponseEntity<>(savedMessage, HttpStatus.OK);

    }
}

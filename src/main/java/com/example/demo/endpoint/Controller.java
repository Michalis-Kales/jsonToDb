/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.endpoint;

import com.example.demo.entites.User;
import com.example.demo.entites.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mike
 */
@RestController
public class Controller {
    
    @Autowired
   private UserRepo ur;
    
    
    @RequestMapping("/")
    
    public String someName(){
        return "Hello world";
    }
    
    
    
    @RequestMapping("/mike")
    
    public String someOtherName(@RequestBody User temp){
        ur.save(temp);
        return "ok";
    }
    
    
    @RequestMapping("/all")
    public Iterable<User>all(){
        
        return ur.findAll();
        
    }
    
    
    
}

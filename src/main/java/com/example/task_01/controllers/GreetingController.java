package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//For the first 2 bullet points of the MVP:
// @RestController
//public class GreetingController {
//
//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(value = "name") String name){
//        return "Good afternoon " + name + "!";
//    }

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    Celebration celebration;

    @GetMapping
    public ResponseEntity<Greeting> greeting(String name, @RequestParam String timeOfDay){
       Greeting greeting = new Greeting("Natasha", timeOfDay);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

    @GetMapping("/summer")
    public ResponseEntity<Celebration> celebration(){
        return new ResponseEntity<>(new Celebration("Happy summer solstice!"), HttpStatus.OK);
    }

//    Another method to return the Celebration object with the message "Happy summer solstice!":
//    @GetMapping("/summer")
//    public ResponseEntity<Celebration> celebration(String message){
//        Celebration celebration = new Celebration("Happy summer solstice!");
//        return new ResponseEntity<>(celebration, HttpStatus.OK);
//    }







}

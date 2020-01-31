package com.bikecom.demo.controller;

import com.bikecom.demo.model.Bicycle;
import com.bikecom.demo.model.User;
import com.bikecom.demo.repository.BicycleRepository;
import com.bikecom.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BicycleRepository bicycleRepository;


    @GetMapping("/getUser")
    public ResponseEntity getUser(@RequestParam(name = "facebook_id") Long userId) {
        Optional<User> bicycleUser = userRepository.findById(userId);

        if (bicycleUser.isPresent()) {
            User user = bicycleUser.get();
            return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestParam(name = "user_id")Long id,
                                         @RequestParam(name = "name") String name,
                                         @RequestParam(name = "email") String email){


        User userObj;
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            userObj =  new User(id, name, email);
        }
        else{
            userObj = new User(id, name, email);
            userRepository.save(userObj);

        }

        return new ResponseEntity<>(userObj, HttpStatus.OK);
    }

    @PostMapping("/cancelAssignedBicycle")
    public ResponseEntity cancelAssignedBicycle(@RequestParam(name = "user_id")Long user_id,
                                                @RequestParam(name = "bicycle_id")Long bicycle_id){

        Optional<User> user = userRepository.findById(user_id);
        Optional<Bicycle> bicycle = bicycleRepository.findById(bicycle_id);

        if(user.isPresent() && bicycle.isPresent()){
            bicycle.get().setNumberOfBicycles(bicycle.get().getNumberOfBicycles() + 1);
            userRepository.save(user.get());
        }
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}

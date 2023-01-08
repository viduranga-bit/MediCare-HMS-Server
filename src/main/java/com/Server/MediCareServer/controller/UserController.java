package com.Server.MediCareServer.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Server.MediCareServer.model.DAOUser;
import com.Server.MediCareServer.model.UserDTO;
import com.Server.MediCareServer.service.UserService;

@RestController
@RequestMapping("/api/v1/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{username}") // get user details
    public ResponseEntity<?> getAllUsers(@PathVariable String username) {
        DAOUser user = userService.getUserByUserName(username);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "role/{role}") // get deprtment details
    public ResponseEntity<List<DAOUser>> getDoctorsByRole(@PathVariable String role) {
        return new ResponseEntity<>(userService.getDoctorByRole(role),HttpStatus.OK);
    }

}

package com.ead.authuser.controllers;

import com.ead.authuser.dtos.InstructorRecordDto;
import com.ead.authuser.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instructors")
@RequiredArgsConstructor
public class InstructorController {

    final UserService userService;

    @PostMapping("/subscription")
    public ResponseEntity<Object> saveSubscriptionInstructor(@RequestBody @Valid InstructorRecordDto instructorRecordDto) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.registerInstructor(userService.findById(instructorRecordDto.userId()).get()));
    }
}

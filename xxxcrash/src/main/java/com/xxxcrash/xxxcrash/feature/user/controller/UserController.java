package com.xxxcrash.xxxcrash.feature.user.controller;

import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOReceive;
import com.xxxcrash.xxxcrash.feature.user.dto.UserDTOResponce;
import com.xxxcrash.xxxcrash.feature.user.service.UserSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api/server")
public class UserController {
    private final UserSevice userSevice;

    public UserController(UserSevice userSevice) {
        this.userSevice = userSevice;
    }
    @GetMapping
    UserDTOResponce authUser(@RequestBody UserDTOReceive userDTOReceive) {
        return userSevice.authUser(userDTOReceive);
    }

    @PostMapping
    UserDTOResponce registerUser(@RequestBody UserDTOResponce userDTOResponce) {
        return userSevice.registerUser(userDTOResponce);
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable("id") Long id) {
        return userSevice.deleteUser(id);
    }
}


package cn.toj.druiddemo.controller;

import cn.toj.druiddemo.domain.User;
import cn.toj.druiddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public String addUser(@RequestBody User user) {

        userService.addUser(user);
        return "Insert success.";

    }

    @PostMapping("/select")
    public List<User> geUsersByName(@RequestBody User user ) {
        List<User> users = userService.getUsersByName( user.getUsername() );
        return users;
    }

}

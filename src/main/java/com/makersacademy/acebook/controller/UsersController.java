package com.makersacademy.acebook.controller;

import com.makersacademy.acebook.model.Authority;
import com.makersacademy.acebook.model.User;
import com.makersacademy.acebook.repository.AuthoritiesRepository;
import com.makersacademy.acebook.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@Controller
public class UsersController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AuthoritiesRepository authoritiesRepository;

    @GetMapping("/users/new")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "users/new";
    }

    @PostMapping("/users")
    public RedirectView signup(@ModelAttribute User user,  @RequestParam("file") MultipartFile file) throws IOException {

        User.user = user;
        user.profileimage = file.getBytes();
        userRepository.save(user);        

        Authority authority = new Authority(user.getUsername(), "ROLE_USER");
        authoritiesRepository.save(authority);
        return new RedirectView("/login");
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "users/login";
    }
}

package com.kienvu.bookstore.controller;

import com.kienvu.bookstore.domain.security.PasswordResetToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

/**
 * Created by vukien104 on 22/05/2017.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/myaccount")
    public String myAcount() {
        return "MyAccount";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("classActiveLogin", true);
        return "MyAccount";
    }

    @RequestMapping("/forgetpassword")
    public String forgetPassword(Locale locale, @RequestParam("token") String token, Model model) {
        PasswordResetToken passwordResetToken = userService.getPasswordResetToken(token);
        model.addAttribute("classActiveForgetPassword", true);
        return "MyAccount";
    }

    @RequestMapping("/newuser")
    public String newUser(Model model) {
        model.addAttribute("classActiveNewAccount", true);
        return "MyAccount";
    }
}

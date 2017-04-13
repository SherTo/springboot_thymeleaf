package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.PublicKey;
import java.util.ArrayList;

@SpringBootApplication
@Controller
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String toIndex(ModelMap map) {
        User user = new User(12, "sher", 11);
        User sher = new User(13, "xieheng", 22);
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(sher);
        map.addAttribute("sum", 100);
        map.addAttribute("user", user);
        map.addAttribute("sher", sher);
        map.addAttribute("test", "this is test ");
        map.addAttribute("list", list);
        return "index";
    }

    @RequestMapping("/test")
    public String helloWorld(String id, ModelMap map) {
        System.out.println(id);
        map.addAttribute("id", id);
        return "hello";
    }
    @RequestMapping("/add")
    public String  add(User user){
        System.out.println(user.toString());
        return "hello";
    }
}

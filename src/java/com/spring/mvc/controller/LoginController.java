package com.spring.mvc.controller;
import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String printWelcome(ModelMap model,Principal principal){
            //String name=principal.getName();
            //model.addAttribute("username",name);
            //model.addAttribute("message", "Spring security custom form example");
            return "hello";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String Login(ModelMap model,Principal principal){
            return "login";
    }
    
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String Logout(ModelMap model,Principal principal){
            return "login";
    }
    @RequestMapping(value="/*", method=RequestMethod.GET)
    public String Home(ModelMap model,Principal principal){
            return "home";
    }
}

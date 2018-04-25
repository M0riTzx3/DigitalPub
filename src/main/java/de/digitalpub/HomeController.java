package de.digitalpub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController{


    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model){

        return "home";
    }


    @RequestMapping(value = "home", method = RequestMethod.POST)
    public String homeLogout(Model model){
        System.out.println("logged out");
        return "redirect:/index";
    }


}
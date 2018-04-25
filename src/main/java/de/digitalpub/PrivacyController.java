package de.digitalpub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrivacyController{


    @RequestMapping(value = "privacy", method = RequestMethod.GET)
    public String privacyPage(Model model){

        return "privacy";
    }



}
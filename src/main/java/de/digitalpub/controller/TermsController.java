package de.digitalpub.controller;

import de.digitalpub.controller.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TermsController{


    @RequestMapping(value = "terms", method = RequestMethod.GET)
    public String termsPage(Model model){

        return "terms";
    }



}
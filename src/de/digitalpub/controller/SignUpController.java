package de.digitalpub.controller;

import de.digitalpub.controller.form.SignUpForm;
import de.digitalpub.controller.services.SignUpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SignUpController {

    @RequestMapping(value = "signUp", method = RequestMethod.GET)
    public String signUpPage(Model model){

        return "signUp";
    }


    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public String signUpPagePostForm(@ModelAttribute SignUpForm signUpForm, Model model){
        SignUpService signUpService = new SignUpService();
        signUpService.signUpUser(signUpForm);
        if(signUpService.isUserSignedUp()){
            return "signUpSuccessPage";
        }else{
            return "signUpErrorPage";
        }

    }
}

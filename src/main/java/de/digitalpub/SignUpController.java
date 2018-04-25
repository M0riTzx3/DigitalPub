package de.digitalpub;

import de.digitalpub.form.SignUpForm;
import de.digitalpub.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SignUpController {


    @Autowired
    SignUpService signUpService;


    @RequestMapping(value = "signUp", method = RequestMethod.GET)
    public String signUpPage(Model model){
        return "signUp";
    }


    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public String signUpPagePostForm(SignUpForm signUpForm, Model model){

        signUpService.signUpUser(signUpForm);

        return "redirect:/signUpSuccessPage";
    }
}

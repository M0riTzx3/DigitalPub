package de.digitalpub.controller;

import de.digitalpub.controller.form.SignUpForm;
import de.digitalpub.controller.model.User;
import de.digitalpub.controller.services.SecurityService;
import de.digitalpub.controller.services.SignUpService;
import de.digitalpub.controller.services.UserService;
import de.digitalpub.controller.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;



    @RequestMapping(value = "signUp", method = RequestMethod.GET)
    public String signUpPage(Model model){
        model.addAttribute("userForm", new User());
        return "signUp";
    }


    @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public String signUpPagePostForm(@ModelAttribute("userForm") User userForm, Model model, BindingResult bindingResult){
        userValidator.validate(userForm,bindingResult);

        if(bindingResult.hasErrors()){
            return "signUp";
        }
        userService.save(userForm);
        securityService.autologin(userForm.getUsername(),userForm.getPasswordConfirm());
        return "redirect:/signUpSuccessPage";
    }
}

package de.digitalpub.controller;

import de.digitalpub.controller.form.SignUpForm;
import de.digitalpub.controller.model.User;
import de.digitalpub.controller.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Binding;
import javax.validation.Valid;


@Controller
public class SignUpController {

    @Autowired
    private UserService userService;



   // @RequestMapping(value = "signUp", method = RequestMethod.GET)
    //public String showRegistrationForm(Model model, WebRequest webRequest){
    //    UserDTO userDto = new UserDTO();
    //    model.addAttribute("user", userDto);
    //    return "signUp";
    //}
//
   // @RequestMapping(value = "signUp", method = RequestMethod.POST)
   // public ModelAndView registerUserAccount(@ModelAttribute("user") @Valid UserDTO userDTO, BindingResult result, WebRequest webRequest, Errors errors){

   // }



   // @RequestMapping(value = "signUp", method = RequestMethod.POST)
    public String signUpPagePostForm(@ModelAttribute("userForm") User userForm, Model model, BindingResult bindingResult){
        return "redirect:/signUpSuccessPage";
    }
}

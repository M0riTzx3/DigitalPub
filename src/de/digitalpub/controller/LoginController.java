package de.digitalpub.controller;

import de.digitalpub.controller.form.LoginForm;
import de.digitalpub.controller.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(Model model){

        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPagePost(@ModelAttribute LoginForm form, Model model){
            return "redirect:/home";
    }

}
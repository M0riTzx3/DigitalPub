package de.digitalpub.controller;


import de.digitalpub.controller.form.LoginForm;
import de.digitalpub.controller.services.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController{


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage(Model model){

        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String homePagePost(@ModelAttribute LoginForm form, Model model){
        LoginService loginService = new LoginService();
        loginService.logIn(form);
        if(loginService.isLoginState()){
            return "home";
        }
        return "errorPage";
    }


}

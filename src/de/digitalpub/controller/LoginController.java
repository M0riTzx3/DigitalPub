package de.digitalpub.controller;

import de.digitalpub.controller.form.LoginForm;
import de.digitalpub.controller.model.User;
import de.digitalpub.controller.services.LoginService;
import de.digitalpub.controller.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

    @Autowired

    public UserService userService;



    //@RequestMapping(value = "login", method = RequestMethod.GET)
    //public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response){
    //    ModelAndView mav = new ModelAndView("login");
//
    //    mav.addObject("login", new LoginForm());
//
    //    return mav;
    //}

    //@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
   //public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
   //                                 @ModelAttribute("login") LoginForm login) {

   //    ModelAndView mav = null;

   //    User user = userService.validateUser(login);

   //    if (null != user) {

   //        mav = new ModelAndView("welcome");

   //        mav.addObject("firstname", user.getFirstname());

   //    } else {

   //        mav = new ModelAndView("login");

   //        mav.addObject("message", "Username or Password is wrong!!");

   //    }

   //    return mav;

   //}


    //@RequestMapping(value = {"/", "/home"}, method = RequestMethod.POST)
    public String welcome(Model model){

            return "redirect:/home";
    }

}
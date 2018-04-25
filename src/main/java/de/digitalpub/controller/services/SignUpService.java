package de.digitalpub.controller.services;

import de.digitalpub.controller.dao.UserRepository;
import de.digitalpub.controller.dao.model.UserModel;
import de.digitalpub.controller.form.SignUpForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpService{


    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserModel signUpUser(SignUpForm signUpForm){

        UserModel userModel = new UserModel();

        userModel.setUsername(signUpForm.getEmail());
        userModel.setName(signUpForm.getNickname());
        userModel.setPassword(passwordEncoder.encode(signUpForm.getPassword()));
        userModel.setEnabled(true);

        userRepository.save(userModel);
        return userRepository.findByUsername(userModel.getUsername());

    }

}





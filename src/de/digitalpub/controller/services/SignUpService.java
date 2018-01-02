package de.digitalpub.controller.services;

import de.digitalpub.controller.form.SignUpForm;

import java.io.UnsupportedEncodingException;
import java.util.Base64;


public class SignUpService {
    private boolean passwordAccepted = false;

    public void signUpUser(SignUpForm signUpForm){
        connectToDatabase();

    }

    private void connectToDatabase() {
        DatabaseService databaseService = new DatabaseService();
        databaseService.createDatabase();
        databaseService.createUserTable();
    }

}





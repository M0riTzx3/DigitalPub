package de.digitalpub.controller.services;

import de.digitalpub.controller.data.DatabaseData;
import de.digitalpub.controller.form.LoginForm;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

public class LoginService extends DatabaseData{

    private boolean loginState = false;


    public void logIn(LoginForm loginForm){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConn(DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabase" , getDbUser() , getDbPass()));

            Statement statement = getConn().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM userdatabase.users WHERE email = '" + loginForm.getEmail() + "'");

            String passwordDecoded = Base64.getEncoder().encodeToString(loginForm.getPassword().getBytes("utf-8"));

            while(resultSet.next()){
                if(String.valueOf(resultSet.getString("email")).equals(loginForm.getEmail()) &&
                        resultSet.getString("password").equals(passwordDecoded) ){
                    System.out.println("LOGIN ERFOLGREICH");
                    loginState = true;
                }else {
                    System.out.println("LOGIN FEHLGESCHLAGEN");
                    loginState = false;
                }
            }
        } catch (SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }


    public boolean isLoginState() {
        return loginState;
    }
}

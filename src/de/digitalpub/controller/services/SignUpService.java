package de.digitalpub.controller.services;

import de.digitalpub.controller.data.DatabaseData;
import de.digitalpub.controller.form.SignUpForm;

import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;


public class SignUpService extends DatabaseData{

    private boolean userSignedUp = false;
    private boolean databaseCreated = false;

    public void signUpUser(SignUpForm signUpForm){
        userSignedUp = false;
        connectToDatabase();
        signUp(signUpForm);
    }

    private void connectToDatabase() {
        if(!databaseCreated) {
            DatabaseService databaseService = new DatabaseService();
            databaseService.createDatabase();
            databaseService.createUserTable();
            databaseCreated = true;
        }else{
            System.out.println("Database is already set up");
        }
    }

    private void signUp(SignUpForm signUpForm){
        try {
            //load JDBC
            Class.forName("com.mysql.jdbc.Driver");

            //Strings for Connecting
            setConn(DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabase" , getDbUser() , getDbPass()));
            final String test = "INSERT INTO users(nickname, password, email) " +
                    "VALUES (?,?,?)";
            final String valueCheck = "SELECT count(*) from userdatabase.users WHERE email = ?";

            //Get Rows in Database
            Statement statement = getConn().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM userdatabase.users");

            //encode Password
            String passwordEncoded = Base64.getEncoder().encodeToString(signUpForm.getPassword().getBytes("utf-8"));
            //Fill Database Tables
            PreparedStatement preparedStatement = getConn().prepareStatement(test);

            if(!signUpForm.getNickname().equals("") && !signUpForm.getEmail().equals("") && !signUpForm.getPassword().equals("")){
                preparedStatement.setString(1, signUpForm.getNickname());
                preparedStatement.setString(2, passwordEncoded);
                preparedStatement.setString(3, signUpForm.getEmail());
            }

            preparedStatement.execute();
            System.out.println("*BENUTZER HINZUGEFÜGT*");

            //close connections
            resultSet.close();
            statement.close();
            getConn().close();
            userSignedUp = true;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            userSignedUp = false;
        }
    }

    public boolean isUserSignedUp() {
        return userSignedUp;
    }
}





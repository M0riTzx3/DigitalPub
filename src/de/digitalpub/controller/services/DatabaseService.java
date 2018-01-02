package de.digitalpub.controller.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseService {

    private Connection conn = null;

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Connection getConn() {
        return conn;
    }

    public void createDatabase(){
        try{
            setConn(DriverManager.getConnection("jdbc:mysql://localhost:3306"));

            Statement statement = getConn().createStatement();
            statement.executeUpdate("CREATE DATABASE userdatabase");
            System.out.println("Database successfully created");
            statement.close();
        }catch (Exception e){
            System.out.println("Could not create Database Error: " + e);
        }
    }

    public void createUserTable(){
        try{
            setConn(DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabase"));

            String SQL = "CREATE TABLE `users` (\n" +
                    "  `userID` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `firstName` varchar(45) DEFAULT NULL,\n" +
                    "  `lastName` varchar(45) DEFAULT NULL,\n" +
                    "  `password` varchar(45) DEFAULT NULL,\n" +
                    "  `whichType` varchar(45) DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`userID`)\n" +
                    ") ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;";
            Statement statement = getConn().createStatement();
            statement.executeUpdate(SQL);
            statement.close();
            System.out.println("User table successfully created");
        }catch (Exception e){
            System.out.println("Could not create User Table Error: " + e);
        }
    }
}

package de.digitalpub.data;

import java.sql.Connection;

public class DatabaseData {

    private Connection conn = null;
    private String dbHost = "localhost";                      //Host
    private String dbPort = "3306";                          //Port
    private String dbName = "";                 //Database name
    private String dbUser = "root";                 //Username
    private String dbPass = "";                        //User password

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Connection getConn() {
        return conn;
    }

    public String getDbHost() {
        return dbHost;
    }

    public String getDbPort() {
        return dbPort;
    }

    public String getDbName() {
        return dbName;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbName(String dbName){
        dbName = dbName;
    }


}

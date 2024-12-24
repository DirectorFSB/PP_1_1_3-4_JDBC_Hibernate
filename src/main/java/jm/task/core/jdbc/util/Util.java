package jm.task.core.jdbc.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection getMySQLConnection() throws SQLException , ClassNotFoundException{
        String hostName = "localhost" , dbName = "mytestdb" , userName = "root" , password = "root";
        return getMySQLConnection(hostName,dbName,userName ,password);
    }
    public static Connection getMySQLConnection(String hostName,String dbName,String userName ,String password ) throws SQLException , ClassNotFoundException {
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName ;
        return DriverManager.getConnection(connectionURL,userName, password);
    }

}
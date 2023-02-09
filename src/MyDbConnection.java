/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.sql.*;  //To connect a connection need sql package
public class MyDbConnection {
    public Connection getMyConnection() throws Exception
    {
        String path="jdbc:mysql://localhost:3307/my_doc";
        Connection con=DriverManager.getConnection(path,"root","");
        return con;
    }
    
}

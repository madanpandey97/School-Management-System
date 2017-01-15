/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author madan
 */
public class Dbconnect {
  private Connection con;
  private Statement st;
  private ResultSet ru;
public Dbconnect(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
   
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","");
        st = con.createStatement();
        
    }catch(ClassNotFoundException | SQLException ex){
        System.out.println("Error:"+ ex);
    }
   
}

}

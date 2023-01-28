


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class Retrive2 {
      public List <Geter2> userfList;
    public List <Geter2> getuserinformation(){
    userfList = new ArrayList<>();
   
    
      
    try{
        
           DBConnection dbc = new DBConnection();
            Connection con = dbc.connMethod();
             ResultSet resultset = con.createStatement().executeQuery("select * from USERTBL");
                 while (resultset.next()) {
             
          
                String name = resultset.getString("NAME");                             
               String  email = resultset.getString("EMAIL");
                   String subject = resultset.getString("SUBJECT");
                   String  area= resultset.getString("AREA");
                     
                 
          
              
                userfList.add(new Geter2(name,email,subject,area));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
    
    
    }
    
    return userfList;
    }}
    

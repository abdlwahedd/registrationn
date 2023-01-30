


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class samiye {
      public List <Geter> userfList;
    public List <Geter> getuserinformation(){
    userfList = new ArrayList<>();
   
    
      
    try{
        
           DBConnection dbc = new DBConnection();
            Connection con = dbc.connMethod();
             ResultSet resultset = con.createStatement().executeQuery("select * from DATAA");
                 while (resultset.next()) {
             
          
                String firstName = resultset.getString("FIRST_NAME");                             
               String  lastName = resultset.getString("LAST_NAME");
                   String email = resultset.getString("EMAIL");
                   String  address = resultset.getString("ADDRESS");
                     String  mobile = resultset.getString("MOBILE_NUMBER");
                   String  gender = resultset.getString("GENDER");
                 
          
              
                userfList.add(new Geter(firstName, lastName, email,address, mobile,gender));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
     
    
    }
    
    return userfList;
    }}
    



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped

@ManagedBean

public class Ubdate {

    
      String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 String email;
  String address;
   String mobileNumber;
   String gender;
  String firstName;

    
   
    
   public void ubdatee(){
    try {
         
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String s2= "update DATAA set FIRST_NAME='"+firstName+"',LAST_NAME='"+lastName+"',ADDRESS='"+address+"',MOBILE_NUMBER='"+mobileNumber+"',GENDER='"+gender+"' where EMAIL='"+email+"'";
          Statement ps2=null;
        ps2 = con.createStatement();
        ps2.executeQuery(s2);
            
          
       
            System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    
 
} 
 
 

}

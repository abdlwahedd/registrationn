
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped

@ManagedBean

public class Abdl {
     private String lastName;
private String email;
 private String address;
  private String mobileNumber;
  private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String firstName;
   
    public Abdl(){
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

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
    
   public void registrationn(){
    try {
         
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
          PreparedStatement ps2 = con.prepareStatement( "insert into DATAA(FIRST_NAME,LAST_NAME,EMAIL,ADDRESS,MOBILE_NUMBER,GENDER) values(?,?,?,?,?,?)");
            
            ps2.setString(1, firstName);
            ps2.setString(2, lastName);
             ps2.setString(3,email);
            ps2.setString(4,  address);
            ps2.setString(5, mobileNumber );
             ps2.setString(6, gender );
            ps2.executeUpdate();
       
            System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    
 
} 
    

}

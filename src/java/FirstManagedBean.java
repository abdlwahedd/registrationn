
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FirstManagedBean  {
 
 private String subject;
 private String area;
private String name;
 private String emaill;


  
 

     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }
     
   
   
    
 

   
public void registration(){
    try {
         
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
          
          
            PreparedStatement ps1 = con.prepareStatement( "insert into USERTBL(NAME,EMAILL,SUBJECT,AREA) values(?,?,?,?)");
            ps1.setString(1,name);
            ps1.setString(2, emaill);
            ps1.setString(3, subject);
            ps1.setString(4, area);
            ps1.executeUpdate();
            System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    
 
}
   
   
}

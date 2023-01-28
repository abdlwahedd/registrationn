

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




@ManagedBean
@SessionScoped

public class Delete {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  public void DeleteMethod(){
   
   try{
     DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();

        PreparedStatement ps = con.prepareStatement("Delete from DATAA where EMAIL=?");
        
         ps.setString(1, email);   
      
           ps.executeUpdate();
   }
   catch(Exception e){
   
   System.out.print(e);
   }
   
   }
    
}

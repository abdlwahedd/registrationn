
import java.sql.*;

public class login {

    public static boolean validate(String name, String pass) {
        boolean status = false;
        try {
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            Class.forName("oracle.jdbc.driver.OracleDriver");
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JAVADB202", "1616");
            CallableStatement callobj=con.prepareCall("{call SsELECTUSe(?)}");
            
            
            PreparedStatement ps = con.prepareStatement("select * from USERTBL where USERNAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}


public class Geter {
    private String firstName;
    private String lastName;
private String email; 
private String address;
private String mobile;
private String gender; 

    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getGender() {
        return gender;
    }

   
    public  Geter(String firstName,String lastName,String email,String address,String mobile,String gender){
  this.firstName=firstName;
       this.lastName=lastName;
         this.email=email;
         this. address= address;
          this.mobile=mobile;
          this.gender=gender;
          


}
}

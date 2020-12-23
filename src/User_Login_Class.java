
import java.sql.*;
import javax.swing.JOptionPane;
public class User_Login_Class extends Login_Database{
    
    EstablishConnection con = new  EstablishConnection();
    Connection Con_obj = con.getConnection();
    Statement st= null;
    PreparedStatement pst =null;
    ResultSet RS= null;
    
    @Override
    public boolean UserLogin(String User_Name, String Password){
       String LoginString=" select* from  Login_User where User_Name='"+User_Name+"' and Password='"+Password+"'";
        boolean b;
       
        try{
            pst=Con_obj.prepareStatement(LoginString);
            RS=pst.executeQuery();
            if(RS.next()){
                b=true;
            }
            else{
                b=false;
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            b=false;
        }
        return b;
    }
    
   
    
}

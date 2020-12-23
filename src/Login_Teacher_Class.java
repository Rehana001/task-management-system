
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login_Teacher_Class extends Login_Database {
     EstablishConnection con = new  EstablishConnection();
    Connection Con_obj = con.getConnection();
    Statement st= null;
    PreparedStatement pst =null;
    ResultSet RS= null;
    
    
    @Override
    public boolean UserLogin(String User_Name, String Password){
       String LoginString=" select* from  Login_Teacher where User_Name='"+User_Name+"' and Password='"+Password+"'";
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

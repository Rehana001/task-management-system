
import java.sql.*;
import javax.swing.JOptionPane;


public class EstablishConnection {
     
    public static Connection con=null;
    public static Connection getConnection(){
       
        try{
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con= (Connection) DriverManager.getConnection("jdbc:ucanaccess://D:\\project_DataBase.accdb");
           
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
        }
       return con;
    }

    PreparedStatement prepareStatement(String loginString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

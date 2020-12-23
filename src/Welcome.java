
import javafx.stage.Screen;
import javax.swing.JLabel;


public class Welcome extends javax.swing.JFrame {

   
  
    public Welcome() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        loadingnumber = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText(" Welcome to Task Management System ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 466, 66));
        getContentPane().add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 280, 20));

        loadingnumber.setText("0%");
        getContentPane().add(loadingnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 38, 24));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Java-Splash-Screen-With-Progress-Bar-fig-2.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) throws InterruptedException {
        
     Welcome welcome = new Welcome();
     welcome.setVisible(true);
     try{
         for(int i=0;i<=100;i++){
             Thread.sleep(70);
             welcome.loadingnumber.setText(Integer.toString(i) + "%");
             welcome.loadingbar.setValue(i);
            
         }
     }catch(Exception ex){
         
             
         }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
                new start().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar loadingbar;
    private javax.swing.JLabel loadingnumber;
    // End of variables declaration//GEN-END:variables
}

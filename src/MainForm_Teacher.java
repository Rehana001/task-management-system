
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainForm_Teacher extends javax.swing.JFrame {

    
    Connection Con_obj = EstablishConnection.getConnection();
    
    start start= new start();
     public ArrayList<Task> AllTasks = new ArrayList<Task>();
     
     
    public MainForm_Teacher() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("TASK MANAGER FOR TEACHERS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 1, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Add Task");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 110, 34));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Delete Task ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 140, 130, 35));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Edit Task ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 139, 104, 37));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Task Name", "Group Leader", "Description", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 860, 320));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\blue.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         int ID;
        
         
       if(jTable3.getSelectedRow()!= -1){
          int rowno=  jTable3.getSelectedRow();
          DefaultTableModel dtm = (DefaultTableModel)jTable3.getModel();
          ID = Integer.parseInt(jTable3.getModel().getValueAt(rowno, 0).toString());
          delete(ID);
           dtm.removeRow(rowno);
        }
        else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
                             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //System.exit(0);
        //this.show();
        dispose();
        start.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Add_Teacher add = new Add_Teacher();
        add.IsNewBox=true;
        add.main_teacher=this;
        add.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         String ID;
         String Group_Task;
         String Group_Leader;
         String Description;
         String Start_Date;
         String End_Date;
         
         
       if(jTable3.getSelectedRow()!= -1){
          int rowno=  jTable3.getSelectedRow();
          DefaultTableModel dtm = (DefaultTableModel)jTable3.getModel();
            ID = jTable3.getModel().getValueAt(rowno, 0).toString();
          Group_Task = jTable3.getModel().getValueAt(rowno, 1).toString();
          Group_Leader = jTable3.getModel().getValueAt(rowno, 2).toString();
          Description = jTable3.getModel().getValueAt(rowno, 3).toString();
          Start_Date = jTable3.getModel().getValueAt(rowno, 4).toString();
          End_Date = jTable3.getModel().getValueAt(rowno, 5).toString();
           Add_Teacher add_teacher = new Add_Teacher();
           add_teacher.IsNewBox=false;
           add_teacher.selectedrow=jTable3.getSelectedRow();
          add_teacher.main_teacher = this;
          add_teacher.txtID.setText(ID);
          add_teacher.title.setText(Group_Task);
          add_teacher.groupLeaderField.setText(Group_Leader);
          add_teacher.description.setText(Description);
             try {
                 Date SD = new SimpleDateFormat("MM/dd/yy").parse(Start_Date);
                 Date ED = new SimpleDateFormat("MM/dd/yy").parse(End_Date);
                 add_teacher.SD.setDate(SD);
                 add_teacher.ED.setDate(ED);
             } catch (ParseException ex) {
                 Logger.getLogger(MainForm_Teacher.class.getName()).log(Level.SEVERE, null, ex);
             }

          add_teacher.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
                                           

        
    }//GEN-LAST:event_jButton3ActionPerformed

    
      public void delete(int ID){
        
        try{
        String query =" delete from Add_Data_Teacher where ID=?";
        PreparedStatement pst  =Con_obj.prepareStatement(query);
        pst.setInt(1, ID);
        pst.executeUpdate();
        
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
     }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm_Teacher().setVisible(true);
            }
        });
        
    }
    
     public void populateDataFromAccess(){
         try{
            DefaultTableModel dtm = new DefaultTableModel();
            dtm = (DefaultTableModel) jTable3.getModel();
             String Group_Task,Group_Leader,Description,Start_Date,End_Date;
             int ID;
             String query ="select * from Add_Data_Teacher";
             PreparedStatement  pst = Con_obj.prepareStatement(query);
             ResultSet rs = pst.executeQuery();

            if(rs.next()){

                do{
                    ID= rs.getInt("ID");
                    Group_Task = rs.getString("Group_Task");
                    Group_Leader = rs.getString("Group_Leader");
                    Description = rs.getString("Description");
                    Start_Date = rs.getString("Start_Date");
                    End_Date =rs.getString("End_Date");
                    dtm.addRow(new Object[]{ID,Group_Task,Group_Leader,Description,Start_Date,End_Date});
                }
                while(rs.next());
            }
         }catch(Exception ex){
             System.out.println(""+ex);
         }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}

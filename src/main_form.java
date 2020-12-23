
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class main_form extends javax.swing.JFrame {
    
   Connection Con_obj = EstablishConnection.getConnection();
    
   // public ArrayList<Task> AllTasks = new ArrayList<Task>();
   start start= new start();
   
    
    public main_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("TASK MANAGER FOR STUDENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        AddButton.setText("ADD TASK");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 130, 93, 35));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 571, 102, 34));

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Task Name", "Group Leader", "Description", "Start Date", "End Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, 888, 325));

        jButton2.setText("Delete Task");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 130, 99, 35));

        txtEdit.setText("Edit Task");
        txtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditActionPerformed(evt);
            }
        });
        getContentPane().add(txtEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 130, 96, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\blue.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 910, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
       add addwindow = new add();
         addwindow.IsNewBox=true;
       addwindow.main_obj = this;
        addwindow.setVisible(true);
        
    }//GEN-LAST:event_AddButtonActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //System.exit(0);
        //this.show();
        dispose();
        start.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         int ID;
        
         
       if(jTable1.getSelectedRow()!= -1){
          int rowno=  jTable1.getSelectedRow();
          DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
          ID = Integer.parseInt(jTable1.getModel().getValueAt(rowno, 0).toString());
          delete(ID);
           dtm.removeRow(rowno);
        }
        else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditActionPerformed
    
        String ID;
         String Group_Task;
         String Group_Leader;
         String Description;
         String Start_Date;
         String End_Date;
         
         
       if(jTable1.getSelectedRow()!= -1){
          int rowno=  jTable1.getSelectedRow();
          DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
            ID = jTable1.getModel().getValueAt(rowno, 0).toString();
          Group_Task = jTable1.getModel().getValueAt(rowno, 1).toString();
          Group_Leader = jTable1.getModel().getValueAt(rowno, 2).toString();
          Description = jTable1.getModel().getValueAt(rowno, 3).toString();
          Start_Date = jTable1.getModel().getValueAt(rowno, 4).toString();
          End_Date = jTable1.getModel().getValueAt(rowno, 5).toString();
           add addwindow = new add();
           addwindow.IsNewBox=false;
           addwindow.selectedrow=jTable1.getSelectedRow();
          addwindow.main_obj = this;
          addwindow.txtID.setText(ID);
          addwindow.title.setText(Group_Task);
          addwindow.groupLeaderField.setText(Group_Leader);
          addwindow.description.setText(Description);
             try {
                 Date SD = new SimpleDateFormat("MM/dd/yy").parse(Start_Date);
                 Date ED = new SimpleDateFormat("MM/dd/yy").parse(End_Date);
                 addwindow.SD.setDate(SD);
                 addwindow.ED.setDate(ED);
             } catch (ParseException ex) {
                 Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
             }

          addwindow.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
                                           

        
    }//GEN-LAST:event_txtEditActionPerformed

     public void delete(int ID){
        
        try{
        String query =" delete from Add_Data where ID=?";
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
                main_form mf = new main_form();
                mf.setVisible(true);
               mf.populateDataFromAccess();
              
            }
        });
    }
    

     
     
     public void populateDataFromAccess(){
         try{
            DefaultTableModel dtm = new DefaultTableModel();
            dtm = (DefaultTableModel) jTable1.getModel();
             String Group_Task,Group_Leader,Description,Start_Date,End_Date;
             int ID;
             String query ="select * from Add_Data";
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
    private javax.swing.JButton AddButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton txtEdit;
    // End of variables declaration//GEN-END:variables
}

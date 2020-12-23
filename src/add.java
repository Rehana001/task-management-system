
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class add extends javax.swing.JFrame {
    
  
  PreparedStatement ps;
  public Boolean IsNewBox;
  public int selectedrow; 
   String OldTask;
    main_form main_obj ;
    
   
    public add() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        saveTask = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SD = new com.toedter.calendar.JDateChooser();
        ED = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        groupLeaderField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("User ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Group task");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 121, -1));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 170, 333, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 117, 32));
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 253, 333, 128));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setText("ADD TASK FOR STUDENTS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        saveTask.setText("Save Task ");
        saveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTaskActionPerformed(evt);
            }
        });
        getContentPane().add(saveTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 501, 103, 31));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 501, 81, 31));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Start Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 37));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("End Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 95, 25));

        SD.setDateFormatString("MM/dd/yy");
        getContentPane().add(SD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 170, 30));

        ED.setDateFormatString("MM/dd/yy");
        getContentPane().add(ED, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Group Leader");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, -1, 30));

        groupLeaderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupLeaderFieldActionPerformed(evt);
            }
        });
        getContentPane().add(groupLeaderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 218, 333, 28));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 46, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 125, 316, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\blue 2.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 720, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void saveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTaskActionPerformed

        if(IsNewBox)
        {
            int ID =Integer.parseInt(txtID.getText());
            String Group_Task= title.getText();
            String Group_Leader = groupLeaderField.getText();
            String des = description.getText() ;
            SimpleDateFormat sdf100 = new SimpleDateFormat("MM/dd/yy");

            String Start_Date =sdf100.format(SD.getDate());
            String End_Date =sdf100.format(ED.getDate());

           if(CheckData()){
                try{
              PreparedStatement ps;
              Connection c = EstablishConnection.getConnection();
              ps = c.prepareStatement("insert into Add_Data ( ID,Group_Task,Group_Leader,Description,Start_Date,End_Date) values(?,?,?,?,?,?)");
              ps.setInt(1, ID);
              ps.setString(2, Group_Task);
              ps.setString(3, Group_Leader);
              ps.setString(4, des);
              ps.setString(5, Start_Date);
              ps.setString(6, End_Date);
              int ok = JOptionPane.showConfirmDialog(rootPane, "Confirm to storer?", "Are you sure....", JOptionPane.YES_NO_OPTION);
              if(ok==0){

              ps.execute();
              JOptionPane.showMessageDialog(rootPane, "Data is stored....Successfully", "Done", 1);

                Task task_obj = new Task(ID,Group_Task, des, Group_Leader , Start_Date, End_Date);


               
                DefaultTableModel dtm = (DefaultTableModel) main_obj.jTable1.getModel();
                dtm.addRow(GetTaskVector(task_obj));

              }

             }catch(Exception ex){
                 System.out.println(""+ex);
             }

            dispose();
           }
           else{
               JOptionPane.showMessageDialog(null, "Data is missing");

           }
        }
        else
        {
            if(CheckData()){
             int ID =Integer.parseInt(txtID.getText());
            String Group_Task= title.getText();
            String Group_Leader = groupLeaderField.getText();
            String des = description.getText() ;
            SimpleDateFormat sdf100 = new SimpleDateFormat("MM/dd/yy");
            String Start_Date =sdf100.format(SD.getDate());
            String End_Date =sdf100.format(ED.getDate());
            
            try{
              PreparedStatement ps;
              Connection c = EstablishConnection.getConnection();
              String sql="update Add_Data set ID=?,Group_Task=?,Group_Leader=?, Description=?, Start_Date=? ,End_Date=? where ID="+""+ID+"";
              ps = c.prepareStatement(sql);
              ps.setInt(1, ID);
              ps.setString(2, Group_Task);
              ps.setString(3, Group_Leader);
              ps.setString(4, des);
              ps.setString(5, Start_Date);
              ps.setString(6, End_Date);
              int ok = JOptionPane.showConfirmDialog(rootPane, "Confirm to storer?", "Are you sure....", JOptionPane.YES_NO_OPTION);
              if(ok==0){

              ps.executeUpdate();
              JOptionPane.showMessageDialog(rootPane, "Data is stored....Successfully", "Done", 1);
                 DefaultTableModel dtm = (DefaultTableModel) main_obj.jTable1.getModel();
             dtm.setValueAt(ID, selectedrow, 0);
                 dtm.setValueAt(Group_Task, selectedrow, 1);
             dtm.setValueAt(Group_Leader, selectedrow, 2);
             dtm.setValueAt(des, selectedrow, 3);
             dtm.setValueAt(Start_Date, selectedrow, 4);
             dtm.setValueAt(End_Date,selectedrow, 5);
              }

             }catch(Exception ex){
                 System.out.println(""+ex);
             }

            
             
             dispose();
             
            }
            else{
                JOptionPane.showMessageDialog(null, "Data is missing");
            }
        }
    }//GEN-LAST:event_saveTaskActionPerformed

        
    
    public Vector<String> GetTaskVector(Task t)
    {
        Vector<String> CurrentRow = new Vector<String>();
             CurrentRow.add(Integer.toString(t.ID));
             CurrentRow.add(t.title);
             CurrentRow.add(t.GroupLeader);
             CurrentRow.add(t.description);
             CurrentRow.add(t.StartDate);
             CurrentRow.add(t.EndDate);
             return CurrentRow;
    }
    
    public boolean CheckData(){
         boolean IsDataFilled = false;
         if(title.getText().isEmpty()||  description.getText().isEmpty()|| groupLeaderField.getText().isEmpty()  || DateFormat.getDateInstance().format(ED.getDate()).isEmpty() ||  DateFormat.getDateInstance().format(SD.getDate()).isEmpty()){
             IsDataFilled=false;
         }
         else{
             IsDataFilled=true;
         }
         return IsDataFilled;
    }
    private void groupLeaderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupLeaderFieldActionPerformed
       
    }//GEN-LAST:event_groupLeaderFieldActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               add addwindow= new add();
               addwindow.setVisible(true);

            }
        });
        
    }
    
    public void setmainform(main_form m){
        this.main_obj=m;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser ED;
    public com.toedter.calendar.JDateChooser SD;
    public javax.swing.JTextField description;
    private javax.swing.JButton exit;
    public javax.swing.JTextField groupLeaderField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveTask;
    public javax.swing.JTextField title;
    public javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}

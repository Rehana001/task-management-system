
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Add_Teacher extends javax.swing.JFrame {

    
     PreparedStatement ps;
  public Boolean IsNewBox;
  public int selectedrow; 
   String OldTask;
   MainForm_Teacher main_teacher;
    
    
    public Add_Teacher() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        groupLeaderField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SD = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        ED = new com.toedter.calendar.JDateChooser();
        saveTask = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("ADD TASK FOR TEACHERS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 40, 25));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 149, 278, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Group Task");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 24));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 192, 278, 28));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Group Leader");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, -1, -1));
        getContentPane().add(groupLeaderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 235, 288, 28));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 274, -1, -1));
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 274, 317, 120));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Start Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 402, 107, 25));
        getContentPane().add(SD, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 402, 197, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("End Date ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 443, -1, -1));
        getContentPane().add(ED, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 443, 197, 30));

        saveTask.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        saveTask.setText("Save");
        saveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTaskActionPerformed(evt);
            }
        });
        getContentPane().add(saveTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 502, 100, -1));

        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\blue 2.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 690, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
              ps = c.prepareStatement("insert into Add_Data_Teacher ( ID,Group_Task,Group_Leader,Description,Start_Date,End_Date) values(?,?,?,?,?,?)");
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


                //main_obj.AllTasks.add(task_obj);
                DefaultTableModel dtm = (DefaultTableModel) main_teacher.jTable3.getModel();
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
                 DefaultTableModel dtm = (DefaultTableModel) main_teacher.jTable3.getModel();
             dtm.setValueAt(ID, selectedrow, 0);
                 dtm.setValueAt(Group_Task, selectedrow, 1);
             dtm.setValueAt(Group_Leader, selectedrow, 2);
             dtm.setValueAt(des, selectedrow, 3);
             dtm.setValueAt(Start_Date, selectedrow, 4);
             dtm.setValueAt(End_Date,selectedrow, 5);
              }

             }catch(Exception ex){
                 System.out.println(""+ex);
                 JOptionPane.showMessageDialog(null,"data is missing");
             }

            
             
             dispose();
             
            }
            else{
                JOptionPane.showMessageDialog(null, "Data is missing");
            }
        }
                                            

    }//GEN-LAST:event_saveTaskActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      
         dispose();
    }//GEN-LAST:event_exitActionPerformed

   
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
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Teacher().setVisible(true);
            }
        });
        
    }

     public void setMainForm_Teacher(MainForm_Teacher m){
        this.main_teacher=m;
        
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveTask;
    public javax.swing.JTextField title;
    public javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}

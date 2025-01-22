package dcoms;

import dcoms.Serialization.EmployeeLoginSerializer;
import dcoms.Serialization.EmployeeLogin;
import dcoms.Serialization.EmployeeLoginManager;
import java.rmi.RemoteException;
import java.util.List;
import javax.swing.JOptionPane;

public class manageEmployee extends javax.swing.JFrame {
    private Interface server;
    private adminDash dashboard;
    private String ID;
    private String firstname;
    private String lastname;
    private String IC;
    private String Password;
    private String LeaveBalanceText;
    private int LeaveBalance;
    
    public manageEmployee(Interface Server, adminDash dash) {
        this.dashboard = dash;
        this.server = Server;
        initComponents();
        
         // Add window listener
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                loadEmployeeData();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        manageEmpBack = new javax.swing.JButton();
        manageEmpEdit = new javax.swing.JButton();
        manageEmpAdd = new javax.swing.JButton();
        manageEmpDelete = new javax.swing.JButton();
        manageEmpClear = new javax.swing.JButton();
        empIDField = new javax.swing.JTextField();
        empLastNameField = new javax.swing.JTextField();
        empICField = new javax.swing.JTextField();
        empFirstNameField = new javax.swing.JTextField();
        empLeaveBalanceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        empPasswordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        employeeTable.setBackground(new java.awt.Color(204, 204, 204));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID#", "First Name", "Last Name", "IC", "Leave Balance"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage an Employee");

        manageEmpBack.setText("Back");
        manageEmpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpBackActionPerformed(evt);
            }
        });

        manageEmpEdit.setText("Edit");
        manageEmpEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpEditActionPerformed(evt);
            }
        });

        manageEmpAdd.setText("Add");
        manageEmpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpAddActionPerformed(evt);
            }
        });

        manageEmpDelete.setText("Delete");
        manageEmpDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpDeleteActionPerformed(evt);
            }
        });

        manageEmpClear.setText("Clear");
        manageEmpClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpClearActionPerformed(evt);
            }
        });

        empIDField.setEditable(false);
        empIDField.setBackground(new java.awt.Color(204, 204, 204));
        empIDField.setForeground(new java.awt.Color(0, 0, 0));

        empLastNameField.setBackground(new java.awt.Color(255, 255, 255));
        empLastNameField.setForeground(new java.awt.Color(0, 0, 0));

        empICField.setBackground(new java.awt.Color(255, 255, 255));
        empICField.setForeground(new java.awt.Color(0, 0, 0));

        empFirstNameField.setBackground(new java.awt.Color(255, 255, 255));
        empFirstNameField.setForeground(new java.awt.Color(0, 0, 0));

        empLeaveBalanceField.setBackground(new java.awt.Color(255, 255, 255));
        empLeaveBalanceField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#Employee ID");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("#Employee First Name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("#Employee Last Name");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("#Employee Leave Balance (Days)");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("#Employee IC");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("#Employee Password");

        empPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        empPasswordField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(292, 292, 292)
                        .addComponent(manageEmpBack)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(empIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empICField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manageEmpDelete)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(manageEmpAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manageEmpEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(empLeaveBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageEmpClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(manageEmpBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(manageEmpAdd)
                        .addGap(27, 27, 27)
                        .addComponent(manageEmpEdit)
                        .addGap(18, 18, 18)
                        .addComponent(manageEmpDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(empFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empICField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empLeaveBalanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmpClear))))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void loadEmployeeData() {
        try {
            // Fetch employee data from the server
            List<String[]> employeeData = server.getAllEmployees();

            // Get the table model
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) employeeTable.getModel();

            // Clear existing rows
            model.setRowCount(0);

            // Add rows to the table
            for (String[] employee : employeeData) {
                model.addRow(new Object[]{employee[0], employee[1], employee[2], employee[3], employee[4]});
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load employee data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Method to clear all input fields
    private void clearFields() {
        empIDField.setText("");
        empFirstNameField.setText("");
        empLastNameField.setText("");
        empICField.setText("");
        empPasswordField.setText("");
        empLeaveBalanceField.setText("");
    }
    
    private void manageEmpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpBackActionPerformed
        dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageEmpBackActionPerformed

    private void manageEmpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpAddActionPerformed
        firstname = empFirstNameField.getText();
        lastname =  empLastNameField.getText();
        IC = empICField.getText();
        Password = empPasswordField.getText();
        
        //CHECK IF FIELDS ARE EMPTY
        if (firstname.isEmpty() || lastname.isEmpty() || IC.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields before adding an employee.", "Missing Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            Boolean result = server.addNewEmployee(firstname, lastname, IC);
            if(result == null){
                JOptionPane.showMessageDialog(null, "IC Already Exists, Change IC and Try Again");
            }
            else if(result == false){
                JOptionPane.showMessageDialog(null, "Server Failed or IC Exists, Employee Not Added.");
            }
            else{
                EmployeeLogin data = new EmployeeLogin(IC, Password);
                if(!EmployeeLoginSerializer.saveLogin(data)){
                    JOptionPane.showMessageDialog(null, "Employee Added Successfully To Database. Failed To Add to Serialized File.");
                    clearFields();
                    loadEmployeeData();
                }
                JOptionPane.showMessageDialog(null, "Employee Added Successfully.");
                clearFields();
                loadEmployeeData();
            }
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_manageEmpAddActionPerformed

    private void manageEmpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpDeleteActionPerformed
        ID = empIDField.getText();
        IC = empICField.getText();
        // CHECK IF EMPLOYEE IS SELECTED
        if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select an Employee.");
            return;
        }
        
        try{
            boolean result = server.deleteEmployee(ID);
            if(result){
                if(EmployeeLoginManager.deleteEmployee(IC)){
                    JOptionPane.showMessageDialog(null, "Employee Deleted.");
                    clearFields();
                    loadEmployeeData();
                    return;
                }
                JOptionPane.showMessageDialog(null, "Employee Deleted from DB. Not Deleted From File");
                clearFields();
                loadEmployeeData();
            }
            else{
                JOptionPane.showMessageDialog(null, "Server Failed, Employee Not Deleted.");
            }
        }
        catch(RemoteException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_manageEmpDeleteActionPerformed

    private void manageEmpClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpClearActionPerformed
        clearFields();
    }//GEN-LAST:event_manageEmpClearActionPerformed

    private void manageEmpEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpEditActionPerformed
        ID = empIDField.getText();
        firstname = empFirstNameField.getText();
        lastname =  empLastNameField.getText();
        IC = empICField.getText();
        Password = empPasswordField.getText();
        LeaveBalanceText = empLeaveBalanceField.getText();
        
        // CHECK IF EMPLOYEE IS SELECTED
        if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select an Employee.");
            return;
        }
        
        if(Password.isEmpty()){ // Update without updating the password
            // CHECK IF FIELDS ARE EMPTY
           if(firstname.isEmpty() || lastname.isEmpty() || IC.isEmpty() || LeaveBalanceText.isEmpty()){
               JOptionPane.showMessageDialog(null, "Make Sure that Fields Are Not Empty.", "Missing Fields", JOptionPane.WARNING_MESSAGE);
               return;
           }

           try{
               LeaveBalance = Integer.parseInt(empLeaveBalanceField.getText());
               Boolean result = server.editEmployee(ID, firstname, lastname, IC, LeaveBalance);
               if(result == null){
                   JOptionPane.showMessageDialog(null, "IC Already Exists.");
               }
               else if(result == false){
                   JOptionPane.showMessageDialog(null, "Server Failed, Employee Not Edited.");
               }
               else{
                   JOptionPane.showMessageDialog(null, "Employee Info Updated Successfully.");
                   clearFields();
                   loadEmployeeData();
               }
           }
           catch(RemoteException e){
               e.printStackTrace();
           }
        }
        else{ // Update with updating the password
            if(firstname.isEmpty() || lastname.isEmpty() || IC.isEmpty() || LeaveBalanceText.isEmpty()){
               JOptionPane.showMessageDialog(null, "Make Sure that Fields Are Not Empty.", "Missing Fields", JOptionPane.WARNING_MESSAGE);
               return;
            }
            
            try{
               LeaveBalance = Integer.parseInt(empLeaveBalanceField.getText());
               Boolean result = server.editEmployee(ID, firstname, lastname, IC, LeaveBalance);
               if(result == null){
                   JOptionPane.showMessageDialog(null, "IC Already Exists.");
               }
               else if(result == false){
                   JOptionPane.showMessageDialog(null, "Server Failed, Employee Not Edited.");
               }
               else{
                   if(EmployeeLoginManager.updatePassword(IC, Password))
                   {
                       JOptionPane.showMessageDialog(null, "Employee Info Updated Successfully.");
                       clearFields();
                       loadEmployeeData();
                       return;
                   }
                   JOptionPane.showMessageDialog(null, "Employee Info Updated Successfully in DB. Password did not Update");
                   clearFields();
                   loadEmployeeData();
               }
           }
           catch(RemoteException e){
               e.printStackTrace();
           }
        }
        
       
    }//GEN-LAST:event_manageEmpEditActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // Get the selected row
        int selectedRow = employeeTable.getSelectedRow();
        if (selectedRow >= 0) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) employeeTable.getModel();

            // Get values from the selected row
            empIDField.setText(model.getValueAt(selectedRow, 0).toString());
            empFirstNameField.setText(model.getValueAt(selectedRow, 1).toString());
            empLastNameField.setText(model.getValueAt(selectedRow, 2).toString());
            empICField.setText(model.getValueAt(selectedRow, 3).toString());
            empLeaveBalanceField.setText(model.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_employeeTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empFirstNameField;
    private javax.swing.JTextField empICField;
    private javax.swing.JTextField empIDField;
    private javax.swing.JTextField empLastNameField;
    private javax.swing.JTextField empLeaveBalanceField;
    private javax.swing.JTextField empPasswordField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageEmpAdd;
    private javax.swing.JButton manageEmpBack;
    private javax.swing.JButton manageEmpClear;
    private javax.swing.JButton manageEmpDelete;
    private javax.swing.JButton manageEmpEdit;
    // End of variables declaration//GEN-END:variables
}

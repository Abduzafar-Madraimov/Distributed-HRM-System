package GUI;

import dcoms.Interface;
import dcoms.Serialization.EmployeeLoginManager;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

public class empUpdate extends javax.swing.JFrame {
    private Interface server;
    private empPage page;
    private String ID;
    private String FN;
    private String LN;
    private String IC;
    private String LeaveBalance;
    public empUpdate(Interface Server, empPage page, String ID, String FirstName, String LastName, String IC, String leaveBalance) {
        this.server = Server;
        this.page = page;
        this.ID = ID;
        this.FN = FirstName;
        this.LN = LastName;
        this.IC = IC;
        this.LeaveBalance = leaveBalance;
        initComponents();
        
        // Add window listener
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                loadData();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        empUpdateBackBtn = new javax.swing.JButton();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        ICField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empUpdateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Details");

        empUpdateBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        empUpdateBackBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        empUpdateBackBtn.setForeground(new java.awt.Color(0, 102, 153));
        empUpdateBackBtn.setText("Back");
        empUpdateBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empUpdateBackBtnActionPerformed(evt);
            }
        });

        FirstName.setBackground(new java.awt.Color(255, 255, 255));
        FirstName.setForeground(new java.awt.Color(0, 0, 0));

        LastName.setBackground(new java.awt.Color(255, 255, 255));
        LastName.setForeground(new java.awt.Color(0, 0, 0));

        ICField.setBackground(new java.awt.Color(255, 255, 255));
        ICField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("I/C Number");

        empUpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        empUpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        empUpdateBtn.setForeground(new java.awt.Color(0, 102, 153));
        empUpdateBtn.setText("Update");
        empUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empUpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(516, Short.MAX_VALUE)
                .addComponent(empUpdateBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ICField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(empUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(empUpdateBtn)
                .addGap(49, 49, 49)
                .addComponent(empUpdateBackBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData()
    {
        FirstName.setText(FN);
        LastName.setText(LN);
        ICField.setText(IC);
    }
    
    private void empUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empUpdateBtnActionPerformed
        try {
            String newIC = ICField.getText(); // Get the new IC entered by the user

            if (newIC.equals(IC)) { 
                // IC has NOT been changed, just update other details in the database
                Boolean result = server.editEmployee(ID, FirstName.getText(), LastName.getText(), IC, newIC, Integer.parseInt(LeaveBalance));

                if (result) {
                    JOptionPane.showMessageDialog(this, "Employee details updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update employee details.");
                }
            } else {
                // IC has CHANGED, update in both database and serialized file
                Boolean dbUpdate  = server.editEmployee(ID, FirstName.getText(), LastName.getText(), IC, newIC, Integer.parseInt(LeaveBalance));       
                boolean icUpdate = EmployeeLoginManager.updateIC(IC, newIC); // Update in serialized file

                if (dbUpdate && icUpdate) {
                    JOptionPane.showMessageDialog(this, "Employee details and IC updated successfully.");
                    IC = newIC; // Update the stored IC to the new one
                } else if (!dbUpdate) {
                    JOptionPane.showMessageDialog(this, "Failed to update employee details in the database.");
                } else {
                    JOptionPane.showMessageDialog(this, "Employee details updated, but failed to update IC in serialized file.");
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_empUpdateBtnActionPerformed

    private void empUpdateBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empUpdateBackBtnActionPerformed
        page.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empUpdateBackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField ICField;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton empUpdateBackBtn;
    private javax.swing.JButton empUpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

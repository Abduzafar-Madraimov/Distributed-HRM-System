package GUI;

import dcoms.Interface;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

public class empPage extends javax.swing.JFrame {
    private Interface server;
    private String IC;
    private String LeaveBalance;
    private String ID;
    private String[] employeeData;
    public empPage(Interface Server, String IC) {
        this.server = Server;
        this.IC = IC;
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
        empPagePaneW = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        empName = new javax.swing.JLabel();
        empUpdateBtn = new javax.swing.JButton();
        empApplyLeaveBtn = new javax.swing.JButton();
        empCheckStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Welcome");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        empName.setBackground(new java.awt.Color(0, 102, 153));
        empName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        empName.setForeground(new java.awt.Color(0, 102, 153));
        empName.setText("EmpName");

        javax.swing.GroupLayout empPagePaneWLayout = new javax.swing.GroupLayout(empPagePaneW);
        empPagePaneW.setLayout(empPagePaneWLayout);
        empPagePaneWLayout.setHorizontalGroup(
            empPagePaneWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empPagePaneWLayout.createSequentialGroup()
                .addGroup(empPagePaneWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empPagePaneWLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(empPagePaneWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empPagePaneWLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(empName)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        empPagePaneWLayout.setVerticalGroup(
            empPagePaneWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empPagePaneWLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(empName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        empUpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        empUpdateBtn.setForeground(new java.awt.Color(0, 0, 0));
        empUpdateBtn.setText("Update my details");
        empUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empUpdateBtnActionPerformed(evt);
            }
        });

        empApplyLeaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        empApplyLeaveBtn.setForeground(new java.awt.Color(0, 0, 0));
        empApplyLeaveBtn.setText("Apply for leave");
        empApplyLeaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empApplyLeaveBtnActionPerformed(evt);
            }
        });

        empCheckStatus.setBackground(new java.awt.Color(255, 255, 255));
        empCheckStatus.setForeground(new java.awt.Color(0, 0, 0));
        empCheckStatus.setText("Check Leave Request Status");
        empCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empCheckStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(empPagePaneW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empApplyLeaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empPagePaneW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(empUpdateBtn)
                .addGap(54, 54, 54)
                .addComponent(empApplyLeaveBtn)
                .addGap(65, 65, 65)
                .addComponent(empCheckStatus)
                .addContainerGap(200, Short.MAX_VALUE))
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

    
    private void loadEmployeeData() {
    try {
        // Call server to fetch employee data by IC
        employeeData = server.getEmployeeDetailsByIC(IC);

        if (employeeData != null) {
            // Map first name and last name to the label
            empName.setText(employeeData[1] + " " + employeeData[2]); // First Name + Last Name
            ID = employeeData[0]; // Store Employee ID for further use
            LeaveBalance = employeeData[3]; // Store Leave Balance for further use
        } else {
            JOptionPane.showMessageDialog(this, "Employee data not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (RemoteException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to load employee data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    private void empApplyLeaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empApplyLeaveBtnActionPerformed
        applyLeave apply = new applyLeave(server, this, LeaveBalance, ID);
        apply.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empApplyLeaveBtnActionPerformed

    private void empUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empUpdateBtnActionPerformed
        empUpdate up = new empUpdate(server, this, ID, employeeData[1], employeeData[2], IC, LeaveBalance);
        up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empUpdateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empCheckStatusActionPerformed
        checkLeaveStatus status = new checkLeaveStatus(server, this, LeaveBalance, IC, ID);
        status.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empCheckStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empApplyLeaveBtn;
    private javax.swing.JButton empCheckStatus;
    private javax.swing.JLabel empName;
    private javax.swing.JPanel empPagePaneW;
    private javax.swing.JButton empUpdateBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

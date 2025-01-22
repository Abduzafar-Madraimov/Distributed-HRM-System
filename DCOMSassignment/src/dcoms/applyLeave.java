package dcoms;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class applyLeave extends javax.swing.JFrame {
    private Interface server;
    private empPage page;
    private String LeaveBalance;
    private String ID;
    public applyLeave(Interface Server, empPage page, String LeaveBalance, String ID) {
        this.server = Server;
        this.page = page;
        this.LeaveBalance = LeaveBalance;
        this.ID = ID;
        initComponents();
        // Add window listener
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                leaveAMT.setText(LeaveBalance);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DateField = new javax.swing.JTextField();
        AMTdays = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empLeaveApplyBtn = new javax.swing.JButton();
        empLeaveBackBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        leaveAMT = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apply for Leave");

        DateField.setBackground(new java.awt.Color(255, 255, 255));
        DateField.setForeground(new java.awt.Color(0, 0, 0));

        AMTdays.setBackground(new java.awt.Color(255, 255, 255));
        AMTdays.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Number of Days:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Commencement: ");

        empLeaveApplyBtn.setBackground(new java.awt.Color(255, 255, 255));
        empLeaveApplyBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        empLeaveApplyBtn.setForeground(new java.awt.Color(0, 102, 153));
        empLeaveApplyBtn.setText("Apply");
        empLeaveApplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLeaveApplyBtnActionPerformed(evt);
            }
        });

        empLeaveBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        empLeaveBackBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        empLeaveBackBtn.setForeground(new java.awt.Color(0, 102, 153));
        empLeaveBackBtn.setText("Back");
        empLeaveBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLeaveBackBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Leaves in balance:");

        leaveAMT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        leaveAMT.setForeground(new java.awt.Color(255, 255, 255));
        leaveAMT.setText("amt");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(yyyy-mm-dd)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empLeaveBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empLeaveApplyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AMTdays, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(leaveAMT))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jLabel1)))
                        .addGap(0, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(leaveAMT))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AMTdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(empLeaveApplyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(empLeaveBackBtn)
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("Leaves balance:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean isValidDate(String dateInput) {
        // Regex for yyyy-mm-dd format
        String dateRegex = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
        if (!Pattern.matches(dateRegex, dateInput)) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false; // Invalid format
        }

        // Parse the input date
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate inputDate = LocalDate.parse(dateInput, formatter);

            // Get the current date
            LocalDate currentDate = LocalDate.now();
            
            // Validate the year is not less than the current year
            if (inputDate.getYear() < currentDate.getYear()) {
                JOptionPane.showMessageDialog(this, "Enter Valid Year", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Validate the month and day
            if (inputDate.isBefore(currentDate) && inputDate.getYear() == currentDate.getYear()) {
                JOptionPane.showMessageDialog(this, "Enter Valid Month or Day", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return false; // The date is in the past within the current year
            }
            
            return true; // Passed all validations
        } catch (DateTimeParseException e) {
            return false; // Invalid date (e.g., Feb 30)
        }
    }
    
    private boolean isValidAMT(){
        int LeaveBalance1 = Integer.parseInt(LeaveBalance);
        int Days  = Integer.parseInt(AMTdays.getText());
        return Days <= LeaveBalance1;
    }
    
    private void goBack(){
        page.setVisible(true);
        this.setVisible(false);
    }
    
    
    private void empLeaveBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLeaveBackBtnActionPerformed
        goBack();
    }//GEN-LAST:event_empLeaveBackBtnActionPerformed

    private void empLeaveApplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLeaveApplyBtnActionPerformed
        // Validate the date format
        if (!isValidDate(DateField.getText())) {
            return;
        }

        // Validate leave balance
        if (!isValidAMT()) {
            JOptionPane.showMessageDialog(this, "Not enough leave balance.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Fetch form data
            String empID = ID;
            String commencementDate = DateField.getText().trim();
            String amountOfDays = AMTdays.getText();

            // Call the server to apply for leave
            boolean result = server.applyLeaveRequest(empID, commencementDate, amountOfDays);

            if (result) {
                JOptionPane.showMessageDialog(this, "Leave applied successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                goBack(); // Return to the previous page
            } else {
                JOptionPane.showMessageDialog(this, "Failed to apply for leave.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while applying for leave.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_empLeaveApplyBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMTdays;
    private javax.swing.JTextField DateField;
    private javax.swing.JButton empLeaveApplyBtn;
    private javax.swing.JButton empLeaveBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leaveAMT;
    // End of variables declaration//GEN-END:variables
}

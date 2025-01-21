package dcoms;

import java.util.List;
import javax.swing.JOptionPane;

public class checkLeaveStatus extends javax.swing.JFrame {
    private Interface server;
    private empPage page;
    private String LeaveBalance;
    private String IC;
    public checkLeaveStatus(Interface Server, empPage page, String LeaveBalance, String IC) {
        this.server = Server;
        this.page = page;
        this.LeaveBalance = LeaveBalance;
        this.IC = IC;
        initComponents();
        
        // Add window listener
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                getLeaveRequestsByIC();
                leaveAMT.setText(LeaveBalance);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        empLeaveStatBackBtn = new javax.swing.JButton();
        leaveAMT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        leaveHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check Leave Status");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Requested Leave Date", "Number of Days Requested", "Application Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        empLeaveStatBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        empLeaveStatBackBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        empLeaveStatBackBtn.setForeground(new java.awt.Color(0, 102, 153));
        empLeaveStatBackBtn.setText("Back");
        empLeaveStatBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empLeaveStatBackBtnActionPerformed(evt);
            }
        });

        leaveAMT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        leaveAMT.setForeground(new java.awt.Color(255, 255, 255));
        leaveAMT.setText("amt");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Leave Balance: ");

        leaveHistory.setBackground(new java.awt.Color(255, 255, 255));
        leaveHistory.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        leaveHistory.setForeground(new java.awt.Color(0, 102, 153));
        leaveHistory.setText("Generate Leave Request History");
        leaveHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(empLeaveStatBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1)
                        .addGap(0, 358, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leaveAMT)))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(leaveHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveAMT)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(leaveHistory)
                .addGap(11, 11, 11)
                .addComponent(empLeaveStatBackBtn)
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

    
     private void getLeaveRequestsByIC() {
        if (IC.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid IC.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Call server to fetch leave requests by IC
            List<String[]> leaveRequests = server.getLeaveRequestsByIC(IC);

            // Get the table model
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();

            // Clear existing rows
            model.setRowCount(0);

            // Add rows to the table
            for (String[] request : leaveRequests) {
                model.addRow(new Object[]{request[3], request[4], request[6], request[5]});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching leave requests.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void empLeaveStatBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empLeaveStatBackBtnActionPerformed
        page.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empLeaveStatBackBtnActionPerformed

    private void leaveHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empLeaveStatBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel leaveAMT;
    private javax.swing.JButton leaveHistory;
    // End of variables declaration//GEN-END:variables
}

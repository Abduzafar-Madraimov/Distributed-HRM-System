package GUI;

import com.itextpdf.layout.Document;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import dcoms.Interface;
import java.util.List;
import javax.swing.JOptionPane;

public class generateLeave extends javax.swing.JFrame {
    private Interface server;
    private adminDash dashboard;
    public generateLeave(Interface Server, adminDash dash) {
        this.server = Server;
        this.dashboard = dash;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ICField = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        generateLeaveAllBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        generateLeaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Employee I/C To Generate Leave Report:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OR");

        ICField.setBackground(new java.awt.Color(255, 255, 255));
        ICField.setForeground(new java.awt.Color(0, 0, 0));
        ICField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICFieldActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        generateLeaveAllBtn.setText("Generate Leave Report For All Employees");
        generateLeaveAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateLeaveAllBtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generate Leave Report");

        generateLeaveBtn.setText("Generate Leave");
        generateLeaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateLeaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateLeaveAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ICField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(generateLeaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ICField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generateLeaveBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(generateLeaveAllBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatePDF() {
        try {
            // Fetch all leave requests
            List<String[]> leaveRequests = server.getAllLeaveRequests();

            if (leaveRequests == null || leaveRequests.isEmpty()) {
                JOptionPane.showMessageDialog(this, "There are no Leave Requests");
                return;
            }

            // Define the PDF file path
            String pdfFilePath = "C:/Users/abduz/NetBeansProjects/DCOMSAssignment/DCOMS/LeaveRequests.pdf";

            // Create a PDF writer
            PdfWriter writer = new PdfWriter(pdfFilePath);

            // Create a PDF document
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Add a title
            document.add(new Paragraph("Leave Requests").setBold().setFontSize(18));

            // Define the table with 7 columns
            Table table = new Table(7);
            table.addHeaderCell("Emp ID");
            table.addHeaderCell("First Name");
            table.addHeaderCell("Last Name");
            table.addHeaderCell("Commencement Date");
            table.addHeaderCell("Leave Days");
            table.addHeaderCell("Status");
            table.addHeaderCell("Creation Date");

            // Populate the table with data using the correct indices
            for (String[] request : leaveRequests) {
                table.addCell(request[7]); // Employee ID
                table.addCell(request[1]); // First Name
                table.addCell(request[2]); // Last Name
                table.addCell(request[3]); // Commencement Date
                table.addCell(request[4]); // Leave Days
                table.addCell(request[5]); // Status
                table.addCell(request[6]); // Creation Date
            }

            // Add the table to the document
            document.add(table);

            // Close the document
            document.close();

            JOptionPane.showMessageDialog(this, "PDF generated successfully: " + pdfFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private void generatePDFbyIC(String IC) {
        try {
            // Fetch all leave requests
            List<String[]> leaveRequests = server.getLeaveRequestsByIC(IC);

            if (leaveRequests == null || leaveRequests.isEmpty()) {
                JOptionPane.showMessageDialog(this, "There are no Leave Requests");
                return;
            }

            // Define the PDF file path
            String pdfFilePath = "C:/Users/abduz/NetBeansProjects/DCOMSAssignment/DCOMS/LeaveRequests.pdf";

            // Create a PDF writer
            PdfWriter writer = new PdfWriter(pdfFilePath);

            // Create a PDF document
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Add a title
            document.add(new Paragraph("Leave Requests").setBold().setFontSize(18));

            // Define the table with 7 columns
            Table table = new Table(7);
            table.addHeaderCell("Emp ID");
            table.addHeaderCell("First Name");
            table.addHeaderCell("Last Name");
            table.addHeaderCell("Commencement Date");
            table.addHeaderCell("Leave Days");
            table.addHeaderCell("Status");
            table.addHeaderCell("Creation Date");

            // Populate the table with data using the correct indices
            for (String[] request : leaveRequests) {
                table.addCell(request[7]); // Employee ID
                table.addCell(request[1]); // First Name
                table.addCell(request[2]); // Last Name
                table.addCell(request[3]); // Commencement Date
                table.addCell(request[4]); // Leave Days
                table.addCell(request[5]); // Status
                table.addCell(request[6]); // Creation Date
            }

            // Add the table to the document
            document.add(table);

            // Close the document
            document.close();

            JOptionPane.showMessageDialog(this, "PDF generated successfully: " + pdfFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void ICFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ICFieldActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void generateLeaveAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateLeaveAllBtnActionPerformed
        generatePDF();
    }//GEN-LAST:event_generateLeaveAllBtnActionPerformed

    private void generateLeaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateLeaveBtnActionPerformed
        if(ICField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Employee IC cant be empty");
            return;
        }
        generatePDFbyIC(ICField.getText());
    }//GEN-LAST:event_generateLeaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ICField;
    private javax.swing.JButton back;
    private javax.swing.JButton generateLeaveAllBtn;
    private javax.swing.JButton generateLeaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

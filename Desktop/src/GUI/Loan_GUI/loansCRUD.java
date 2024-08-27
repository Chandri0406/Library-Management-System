package GUI.Loan_GUI;

import GUI.DatabaseConnection;
import GUI.maindashboard;
import desktop.models.Loan;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class loansCRUD extends javax.swing.JFrame {

    public loansCRUD() {
        initComponents();
        addHoverEffect(add_btn);
        addHoverEffect(search_btn);
        addHoverEffect(delete_btn);
        addHoverEffect(edit_btn);
    }
    
     public static DatabaseConnection db = new DatabaseConnection();
    
    ArrayList<Loan> loans = new ArrayList<Loan>();
    int rowIndex = -1;
    
    public void RefreshTable()
    {
        try {
            db.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loansCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        loans = db.Loanview();
        DefaultTableModel model = (DefaultTableModel) loan_tbl.getModel();
        model.setRowCount(0);
        for(Loan loan : loans){
            model.addRow(new Object[]{loan.getLoanID(), loan.getBookID(), loan.getStartDate(), loan.getEndDate(), loan.getLibraryCardID()});
        }
    }
    
    private void addHoverEffect(javax.swing.JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(new Color(100, 80, 60));  // Hover color
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                button.setBackground(new Color(78, 66, 52));  // Original color
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edit_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        loan_tbl = new javax.swing.JTable();
        add_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        delete_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Authors");
        setLocation(new java.awt.Point(300, 150));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(38, 39, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        edit_btn.setBackground(new java.awt.Color(78, 66, 52));
        edit_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Edit");
        edit_btn.setAlignmentX(0.5F);
        edit_btn.setBorderPainted(false);
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.setFocusPainted(false);
        edit_btn.setFocusable(false);
        edit_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        edit_btn.setMaximumSize(new java.awt.Dimension(141, 27));
        edit_btn.setMinimumSize(new java.awt.Dimension(141, 27));
        edit_btn.setName("edit_btn"); // NOI18N
        edit_btn.setPreferredSize(new java.awt.Dimension(152, 27));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        back_btn.setBackground(new java.awt.Color(159, 105, 50));
        back_btn.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("<");
        back_btn.setBorderPainted(false);
        back_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back_btn.setIconTextGap(1);
        back_btn.setMargin(new java.awt.Insets(1, 5, 1, 5));
        back_btn.setPreferredSize(new java.awt.Dimension(40, 30));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        search_txt.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setText("Search by ");
        search_txt.setPreferredSize(new java.awt.Dimension(188, 27));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 280));

        loan_tbl.setBackground(new java.awt.Color(183, 172, 162));
        loan_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        loan_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loan_tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(loan_tbl);

        add_btn.setBackground(new java.awt.Color(78, 66, 52));
        add_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add");
        add_btn.setAlignmentX(0.5F);
        add_btn.setBorderPainted(false);
        add_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_btn.setFocusPainted(false);
        add_btn.setFocusable(false);
        add_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_btn.setMaximumSize(new java.awt.Dimension(141, 27));
        add_btn.setMinimumSize(new java.awt.Dimension(141, 27));
        add_btn.setName("add_btn"); // NOI18N
        add_btn.setPreferredSize(new java.awt.Dimension(152, 27));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTextPane1.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane1.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane1.setText("MANAGE LOANS");
        jTextPane1.setToolTipText("");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane1.setViewportView(jTextPane1);

        delete_btn.setBackground(new java.awt.Color(78, 66, 52));
        delete_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.setToolTipText("");
        delete_btn.setAlignmentY(0.0F);
        delete_btn.setBorderPainted(false);
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.setFocusPainted(false);
        delete_btn.setFocusable(false);
        delete_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete_btn.setName("delete_btn"); // NOI18N
        delete_btn.setPreferredSize(new java.awt.Dimension(152, 27));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        search_btn.setBackground(new java.awt.Color(78, 66, 52));
        search_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        search_btn.setForeground(new java.awt.Color(255, 255, 255));
        search_btn.setText("Search");
        search_btn.setAlignmentX(0.5F);
        search_btn.setBorderPainted(false);
        search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_btn.setFocusPainted(false);
        search_btn.setFocusable(false);
        search_btn.setMaximumSize(new java.awt.Dimension(141, 27));
        search_btn.setMinimumSize(new java.awt.Dimension(141, 27));
        search_btn.setName("search_btn"); // NOI18N
        search_btn.setPreferredSize(new java.awt.Dimension(152, 27));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        this.dispose();
        new loanEdit().setVisible(true);
    }//GEN-LAST:event_edit_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        new maindashboard().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        this.dispose();
        new loanAdd().setVisible(true);
    }//GEN-LAST:event_add_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // ADD delete
        if(rowIndex != -1){
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you wish to delete '" +
                    loans.get(rowIndex).getLoanID()+ " " + loans.get(rowIndex).getLibraryCardID()+ "'?", "Confirmation", JOptionPane.YES_NO_OPTION);
                   if(option == JOptionPane.YES_OPTION)
                   {
                       String selectedID = loans.get(rowIndex).getLoanID();
                       db.DeleteBorrower(selectedID);
                       RefreshTable();
                   }
        }
        else{JOptionPane.showMessageDialog(this, "Please select borrower you wish to delete", "Delete Error", JOptionPane.ERROR_MESSAGE);
    }  
    }//GEN-LAST:event_delete_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        RefreshTable();
    }//GEN-LAST:event_formWindowOpened

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
         if(search_txt.getText() == " "){
            JOptionPane.showMessageDialog(this, "Please enter the Borrower's name to search for", "Search Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String loanid = search_txt.getText();
            loans = db.searchLoan(loanid);
            
            DefaultTableModel model = (DefaultTableModel) loan_tbl.getModel();
            model.setRowCount(0);
            for(Loan loan: loans)
            {
                model.addRow(new Object[]{loan.getLoanID(), loan.getBookID(), loan.getStartDate(), loan.getEndDate(), loan.getLibraryCardID()});
            }
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void loan_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loan_tblMouseClicked
        // TODO add your handling code here:
        rowIndex = loan_tbl.getSelectedRow();
    }//GEN-LAST:event_loan_tblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loansCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loansCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loansCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loansCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loansCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable loan_tbl;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables
}

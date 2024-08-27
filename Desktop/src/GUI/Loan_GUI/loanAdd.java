package GUI.Loan_GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loanAdd extends javax.swing.JFrame {

    public loanAdd() {
        initComponents();
        addHoverEffect(submit_btn);
    }
    
    private void addHoverEffect(javax.swing.JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(new Color(100, 80, 60));  // Hover color
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                button.setBackground(new Color(159,105,50));  // Original color
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

        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        back_btn4 = new javax.swing.JButton();
        borrower_lbl4 = new javax.swing.JLabel();
        book_lbl = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        book_ComboBox = new javax.swing.JComboBox<>();
        borrower_ComboBox = new javax.swing.JComboBox<>();
        startDate_lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));

        jPanel6.setBackground(new java.awt.Color(38, 39, 43));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(620, 490));

        jScrollPane5.setBorder(null);

        jTextPane5.setEditable(false);
        jTextPane5.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane5.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane5.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane5.setText("LOAN");
        jTextPane5.setAutoscrolls(false);
        jTextPane5.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane5.setViewportView(jTextPane5);

        back_btn4.setBackground(new java.awt.Color(159, 105, 50));
        back_btn4.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        back_btn4.setForeground(new java.awt.Color(255, 255, 255));
        back_btn4.setText("<");
        back_btn4.setBorderPainted(false);
        back_btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back_btn4.setIconTextGap(1);
        back_btn4.setMargin(new java.awt.Insets(1, 5, 1, 5));
        back_btn4.setPreferredSize(new java.awt.Dimension(40, 30));
        back_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn4ActionPerformed(evt);
            }
        });

        borrower_lbl4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        borrower_lbl4.setForeground(new java.awt.Color(255, 255, 255));
        borrower_lbl4.setText("Borrower :");

        book_lbl.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        book_lbl.setForeground(new java.awt.Color(255, 255, 255));
        book_lbl.setText("Book :");

        submit_btn.setBackground(new java.awt.Color(159, 105, 50));
        submit_btn.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("SUBMIT");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        book_ComboBox.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        book_ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        book_ComboBox.setEnabled(false);

        borrower_ComboBox.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        borrower_ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        borrower_ComboBox.setEnabled(false);

        startDate_lbl2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        startDate_lbl2.setForeground(new java.awt.Color(255, 255, 255));
        startDate_lbl2.setText("Start Date:");
        startDate_lbl2.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book_lbl)
                            .addComponent(borrower_lbl4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(startDate_lbl2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrower_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(back_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(submit_btn)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(book_lbl))
                            .addComponent(book_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borrower_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrower_lbl4)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(back_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(startDate_lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(submit_btn)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn4ActionPerformed
        this.dispose();
        new loansCRUD().setVisible(true);
    }//GEN-LAST:event_back_btn4ActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // Adds to the loan to the database
    }//GEN-LAST:event_submit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(loanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loanAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn4;
    private javax.swing.JComboBox<String> book_ComboBox;
    private javax.swing.JLabel book_lbl;
    private javax.swing.JComboBox<String> borrower_ComboBox;
    private javax.swing.JLabel borrower_lbl4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JLabel startDate_lbl2;
    private javax.swing.JButton submit_btn;
    // End of variables declaration//GEN-END:variables
}

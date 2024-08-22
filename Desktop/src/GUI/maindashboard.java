package GUI;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class maindashboard extends javax.swing.JFrame {
    public maindashboard() {
        initComponents();
        addHoverEffect(manageBooks);
        addHoverEffect(manageBorrowers);
        addHoverEffect(manageLoans);
        addHoverEffect(manageAuthors);
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        manageBooks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        manageBorrowers = new javax.swing.JButton();
        manageLoans = new javax.swing.JButton();
        manageAuthors = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainDashboard");
        setBackground(new java.awt.Color(102, 0, 255));
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setLocation(new java.awt.Point(500, 500));
        setName("dash"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(38, 39, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 420));

        manageBooks.setBackground(new java.awt.Color(78, 66, 52));
        manageBooks.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        manageBooks.setForeground(new java.awt.Color(255, 255, 255));
        manageBooks.setText("Manage Books");
        manageBooks.setAlignmentX(0.5F);
        manageBooks.setBorderPainted(false);
        manageBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBooks.setFocusPainted(false);
        manageBooks.setMargin(new java.awt.Insets(2, 14, 2, 14));
        manageBooks.setName("manageBooks"); // NOI18N
        manageBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBooksActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTextPane1.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane1.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane1.setText("LIBRARY MANAGEMENT SYSTEM");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane1.setViewportView(jTextPane1);

        manageBorrowers.setBackground(new java.awt.Color(78, 66, 52));
        manageBorrowers.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        manageBorrowers.setForeground(new java.awt.Color(255, 255, 255));
        manageBorrowers.setText("Manage Borrowers");
        manageBorrowers.setAlignmentY(0.0F);
        manageBorrowers.setBorderPainted(false);
        manageBorrowers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBorrowers.setFocusPainted(false);
        manageBorrowers.setMargin(new java.awt.Insets(2, 14, 2, 14));
        manageBorrowers.setName("manageBorrowers"); // NOI18N
        manageBorrowers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBorrowersActionPerformed(evt);
            }
        });

        manageLoans.setBackground(new java.awt.Color(78, 66, 52));
        manageLoans.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        manageLoans.setForeground(new java.awt.Color(255, 255, 255));
        manageLoans.setText("Manage Loans");
        manageLoans.setAlignmentX(0.5F);
        manageLoans.setBorderPainted(false);
        manageLoans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageLoans.setFocusPainted(false);
        manageLoans.setMargin(new java.awt.Insets(2, 14, 2, 14));
        manageLoans.setName("manageLoans"); // NOI18N
        manageLoans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLoansActionPerformed(evt);
            }
        });

        manageAuthors.setBackground(new java.awt.Color(78, 66, 52));
        manageAuthors.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        manageAuthors.setForeground(new java.awt.Color(255, 255, 255));
        manageAuthors.setText("Manage Authors");
        manageAuthors.setAlignmentX(0.5F);
        manageAuthors.setBorderPainted(false);
        manageAuthors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageAuthors.setFocusPainted(false);
        manageAuthors.setMargin(new java.awt.Insets(2, 14, 2, 14));
        manageAuthors.setName("manageAuthors"); // NOI18N
        manageAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAuthorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageBorrowers, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageAuthors, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(manageLoans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageBorrowers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageLoans, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBooksActionPerformed
        this.dispose();
        new booksCRUD().setVisible(true);
    }//GEN-LAST:event_manageBooksActionPerformed

    private void manageAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAuthorsActionPerformed
        this.dispose();
        new authorCRUD().setVisible(true);
    }//GEN-LAST:event_manageAuthorsActionPerformed

    private void manageBorrowersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBorrowersActionPerformed
        this.dispose();
        new borrowersCRUD().setVisible(true);
    }//GEN-LAST:event_manageBorrowersActionPerformed

    private void manageLoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLoansActionPerformed
        this.dispose();
        new loansCRUD().setVisible(true);
    }//GEN-LAST:event_manageLoansActionPerformed

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
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maindashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton manageAuthors;
    private javax.swing.JButton manageBooks;
    private javax.swing.JButton manageBorrowers;
    private javax.swing.JButton manageLoans;
    // End of variables declaration//GEN-END:variables
}

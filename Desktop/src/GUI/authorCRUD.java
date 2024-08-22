package GUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class authorCRUD extends javax.swing.JFrame {

    public authorCRUD() {
        initComponents();
        addHoverEffect(addAuthor);
        addHoverEffect(viewAuthors);
        addHoverEffect(deleteAuthor);
        addHoverEffect(editAuthor);
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
        addAuthor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        deleteAuthor = new javax.swing.JButton();
        viewAuthors = new javax.swing.JButton();
        editAuthor = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Authors");
        setLocation(new java.awt.Point(500, 500));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(38, 39, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 420));

        addAuthor.setBackground(new java.awt.Color(78, 66, 52));
        addAuthor.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        addAuthor.setForeground(new java.awt.Color(255, 255, 255));
        addAuthor.setText("Add Author");
        addAuthor.setAlignmentX(0.5F);
        addAuthor.setBorderPainted(false);
        addAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addAuthor.setFocusPainted(false);
        addAuthor.setFocusable(false);
        addAuthor.setMargin(new java.awt.Insets(2, 14, 2, 14));
        addAuthor.setName("addAuthor"); // NOI18N
        addAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTextPane1.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane1.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane1.setText("MANAGE AUTHORS");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane1.setViewportView(jTextPane1);

        deleteAuthor.setBackground(new java.awt.Color(78, 66, 52));
        deleteAuthor.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        deleteAuthor.setForeground(new java.awt.Color(255, 255, 255));
        deleteAuthor.setText("Delete Author");
        deleteAuthor.setAlignmentY(0.0F);
        deleteAuthor.setBorderPainted(false);
        deleteAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAuthor.setFocusPainted(false);
        deleteAuthor.setFocusable(false);
        deleteAuthor.setMargin(new java.awt.Insets(2, 14, 2, 14));
        deleteAuthor.setName("deleteAuthor"); // NOI18N
        deleteAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAuthorActionPerformed(evt);
            }
        });

        viewAuthors.setBackground(new java.awt.Color(78, 66, 52));
        viewAuthors.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        viewAuthors.setForeground(new java.awt.Color(255, 255, 255));
        viewAuthors.setText("View Authors");
        viewAuthors.setAlignmentX(0.5F);
        viewAuthors.setBorderPainted(false);
        viewAuthors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewAuthors.setFocusPainted(false);
        viewAuthors.setFocusable(false);
        viewAuthors.setMargin(new java.awt.Insets(2, 14, 2, 14));
        viewAuthors.setName("viewAuthors"); // NOI18N
        viewAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAuthorsActionPerformed(evt);
            }
        });

        editAuthor.setBackground(new java.awt.Color(78, 66, 52));
        editAuthor.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        editAuthor.setForeground(new java.awt.Color(255, 255, 255));
        editAuthor.setText("Edit Author");
        editAuthor.setAlignmentX(0.5F);
        editAuthor.setBorderPainted(false);
        editAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editAuthor.setFocusPainted(false);
        editAuthor.setFocusable(false);
        editAuthor.setMargin(new java.awt.Insets(2, 14, 2, 14));
        editAuthor.setName("editAuthor"); // NOI18N
        editAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAuthorActionPerformed(evt);
            }
        });

        Backbtn.setBackground(new java.awt.Color(159, 105, 50));
        Backbtn.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        Backbtn.setForeground(new java.awt.Color(255, 255, 255));
        Backbtn.setText("<");
        Backbtn.setBorderPainted(false);
        Backbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Backbtn.setIconTextGap(1);
        Backbtn.setMargin(new java.awt.Insets(1, 5, 1, 5));
        Backbtn.setPreferredSize(new java.awt.Dimension(40, 30));
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(viewAuthors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
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

    private void addAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorActionPerformed
        // ADD add 
    }//GEN-LAST:event_addAuthorActionPerformed

    private void editAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAuthorActionPerformed
        // ADD edit 
    }//GEN-LAST:event_editAuthorActionPerformed

    private void deleteAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAuthorActionPerformed
        // ADD delete 
    }//GEN-LAST:event_deleteAuthorActionPerformed

    private void viewAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAuthorsActionPerformed
        // ADD view 
    }//GEN-LAST:event_viewAuthorsActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        this.dispose();
        new maindashboard().setVisible(true);
    }//GEN-LAST:event_BackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(authorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(authorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(authorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(authorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new authorCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton addAuthor;
    private javax.swing.JButton deleteAuthor;
    private javax.swing.JButton editAuthor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton viewAuthors;
    // End of variables declaration//GEN-END:variables
}

package GUI.Author_GUI;

import GUI.DatabaseConnection;
import desktop.models.Author;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class authorEdit extends javax.swing.JFrame {

    public authorEdit() {
        initComponents();
        addHoverEffect(edited_btn);
    }
    DatabaseConnection db = new DatabaseConnection();
    Author selectedAuthor = new Author();
    
    public void SetAuthor(Author author){
        selectedAuthor = author;
        name_txt.setText(author.getFirstName());
        surname_txt.setText(author.getLastName());
        publisher_txt.setText(author.getPublisher());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        back_btn = new javax.swing.JButton();
        name_lbl = new javax.swing.JLabel();
        surname_lbl = new javax.swing.JLabel();
        publisher_lbl = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        surname_txt = new javax.swing.JTextField();
        publisher_txt = new javax.swing.JTextField();
        edited_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(38, 39, 43));

        jPanel2.setBackground(new java.awt.Color(38, 39, 43));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 350));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 350));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 350));

        jScrollPane1.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane1.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane1.setText("AUTHOR");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane1.setViewportView(jTextPane1);

        back_btn.setBackground(new java.awt.Color(159, 105, 50));
        back_btn.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("<");
        back_btn.setBorderPainted(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back_btn.setIconTextGap(1);
        back_btn.setMargin(new java.awt.Insets(1, 5, 1, 5));
        back_btn.setPreferredSize(new java.awt.Dimension(40, 30));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        name_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        name_lbl.setForeground(new java.awt.Color(255, 255, 255));
        name_lbl.setText(" Name :");
        name_lbl.setToolTipText("");

        surname_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        surname_lbl.setForeground(new java.awt.Color(255, 255, 255));
        surname_lbl.setText("Last Name :");

        publisher_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        publisher_lbl.setForeground(new java.awt.Color(255, 255, 255));
        publisher_lbl.setText("Publisher :");

        name_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        name_txt.setForeground(new java.awt.Color(255, 255, 255));
        name_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        surname_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        surname_txt.setForeground(new java.awt.Color(255, 255, 255));
        surname_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        publisher_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        publisher_txt.setForeground(new java.awt.Color(255, 255, 255));
        publisher_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        edited_btn.setBackground(new java.awt.Color(159, 105, 50));
        edited_btn.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        edited_btn.setForeground(new java.awt.Color(255, 255, 255));
        edited_btn.setText("EDIT");
        edited_btn.setAlignmentX(0.5F);
        edited_btn.setBorderPainted(false);
        edited_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edited_btn.setFocusPainted(false);
        edited_btn.setFocusable(false);
        edited_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        edited_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edited_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(edited_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name_lbl)
                                    .addComponent(surname_lbl)
                                    .addComponent(publisher_lbl))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(name_txt)
                                .addComponent(surname_txt)
                                .addComponent(publisher_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_lbl))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname_lbl)
                    .addComponent(surname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(publisher_lbl)
                    .addComponent(publisher_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(edited_btn)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        new authorCRUD().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void edited_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edited_btnActionPerformed
        if(name_txt.getText().equals("") || surname_txt.getText().equals("") || publisher_txt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill in all the fields to update author", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            selectedAuthor.setFirstName(name_txt.getText());
            selectedAuthor.setLastName(surname_txt.getText());
            selectedAuthor.setPublisher(publisher_txt.getText());
            
            
            try {
                db.connect();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(authorAdd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            db.UpdateAuthor(selectedAuthor);
            
            this.dispose();
            new authorCRUD().setVisible(true);
        }
    }//GEN-LAST:event_edited_btnActionPerformed

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
            java.util.logging.Logger.getLogger(authorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(authorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(authorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(authorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new authorAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton edited_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel publisher_lbl;
    private javax.swing.JTextField publisher_txt;
    private javax.swing.JLabel surname_lbl;
    private javax.swing.JTextField surname_txt;
    // End of variables declaration//GEN-END:variables
}

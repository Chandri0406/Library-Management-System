package GUI.Borrower_GUI;

import GUI.DatabaseConnection;
import desktop.models.Borrower;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class borrowersAdd extends javax.swing.JFrame {

    public borrowersAdd() {
        initComponents();
        addHoverEffect(submit_btn);
    }
    DatabaseConnection db = new DatabaseConnection();
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        back_btn = new javax.swing.JButton();
        name_lbl = new javax.swing.JLabel();
        surname_lbl = new javax.swing.JLabel();
        phone_lbl = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        surname_txt = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        address_lbl1 = new javax.swing.JLabel();
        address_txt1 = new javax.swing.JTextField();
        email_lbl2 = new javax.swing.JLabel();
        email_txt2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));

        jPanel2.setBackground(new java.awt.Color(38, 39, 43));
        jPanel2.setMaximumSize(new java.awt.Dimension(620, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(620, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 400));

        jScrollPane1.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane1.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane1.setText("BORROWER");
        jTextPane1.setToolTipText("");
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
        name_lbl.setText("Name :");
        name_lbl.setToolTipText("");
        name_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        name_lbl.setPreferredSize(new java.awt.Dimension(58, 23));

        surname_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        surname_lbl.setForeground(new java.awt.Color(255, 255, 255));
        surname_lbl.setText("Last Name :");
        surname_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        phone_lbl.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        phone_lbl.setForeground(new java.awt.Color(255, 255, 255));
        phone_lbl.setText("Phone :");
        phone_lbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        phone_lbl.setPreferredSize(new java.awt.Dimension(61, 23));

        name_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        name_txt.setForeground(new java.awt.Color(255, 255, 255));
        name_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name_txt.setPreferredSize(new java.awt.Dimension(225, 25));

        surname_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        surname_txt.setForeground(new java.awt.Color(255, 255, 255));
        surname_txt.setPreferredSize(new java.awt.Dimension(225, 25));

        phone_txt.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        phone_txt.setForeground(new java.awt.Color(255, 255, 255));
        phone_txt.setPreferredSize(new java.awt.Dimension(225, 25));

        submit_btn.setBackground(new java.awt.Color(159, 105, 50));
        submit_btn.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("SUBMIT");
        submit_btn.setBorderPainted(false);
        submit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_btn.setFocusPainted(false);
        submit_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        address_lbl1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        address_lbl1.setForeground(new java.awt.Color(255, 255, 255));
        address_lbl1.setText("Address :");
        address_lbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        address_txt1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        address_txt1.setForeground(new java.awt.Color(255, 255, 255));
        address_txt1.setPreferredSize(new java.awt.Dimension(225, 25));

        email_lbl2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        email_lbl2.setForeground(new java.awt.Color(255, 255, 255));
        email_lbl2.setText("Email :");
        email_lbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        email_lbl2.setPreferredSize(new java.awt.Dimension(59, 23));

        email_txt2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        email_txt2.setForeground(new java.awt.Color(255, 255, 255));
        email_txt2.setPreferredSize(new java.awt.Dimension(225, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(address_lbl1)
                                        .addGap(22, 22, 22))
                                    .addComponent(surname_lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(phone_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(phone_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(email_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submit_btn)
                                    .addComponent(email_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surname_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surname_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_lbl1)
                    .addComponent(address_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit_btn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        new borrowersCRUD().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
        if(name_txt.getText().equals("") || surname_txt.getText().equals("") || address_txt1.getText().equals("") || phone_txt.getText().equals("") || email_txt2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields to add a new borrower", "Error", JOptionPane.ERROR_MESSAGE);
                    
        }
        else{
            String name = name_txt.getText();
            String surname = surname_txt.getText();
            String address = address_txt1.getText();
            String phone = phone_txt.getText();
            String email = email_txt2.getText();
            Borrower borrower = new Borrower(name, surname, address, phone, email);
            
            try{
                db.connect();
            }
            catch(ClassNotFoundException ex)
            {
                Logger.getLogger(borrowersAdd.class.getName()).log(Level.SEVERE, null, ex);
            }
            db.addBorrower(borrower);
            name_txt.setText("");
            surname_txt.setText("");
            address_txt1.setText("");
            phone_txt.setText("");
            email_txt2.setText("");
        }
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
            java.util.logging.Logger.getLogger(borrowersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrowersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrowersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrowersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrowersAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_lbl1;
    private javax.swing.JTextField address_txt1;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel email_lbl2;
    private javax.swing.JTextField email_txt2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel phone_lbl;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel surname_lbl;
    private javax.swing.JTextField surname_txt;
    // End of variables declaration//GEN-END:variables
}

package GUI.Borrower_GUI;

import GUI.DatabaseConnection;
import GUI.maindashboard;
import desktop.models.Borrower;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class borrowersCRUD extends javax.swing.JFrame {
    public static DatabaseConnection db = new DatabaseConnection();
    
    public borrowersCRUD() {
        initComponents();
        addHoverEffect(add_btn);
        addHoverEffect(search_btn);
        addHoverEffect(delete_btn);
        addHoverEffect(edit_btn);
    }
    
    ArrayList<Borrower> borrowers = new ArrayList<Borrower>();
    int rowIndex = -1;
    
    public void RefreshTable(){
        try {
            db.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(borrowersCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        borrowers = db.Borrowerview();
        DefaultTableModel model = (DefaultTableModel) borrowers_tbl.getModel();
        model.setRowCount(0);
        for(Borrower borrower : borrowers){
            model.addRow(new Object[]{borrower.getLibraryCardID(), borrower.getName(), borrower.getSurname(), borrower.getAddress(), borrower.getPhone(), borrower.getEmail()});
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        borrowerBody = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        delete_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        borrowers_tbl = new javax.swing.JTable();
        refresh_btn = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Borrowers");
        setLocation(new java.awt.Point(300, 150));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        borrowerBody.setBackground(new java.awt.Color(38, 39, 43));
        borrowerBody.setMaximumSize(new java.awt.Dimension(900, 500));
        borrowerBody.setPreferredSize(new java.awt.Dimension(900, 500));

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
        add_btn.setName("add_btn"); // NOI18N
        add_btn.setPreferredSize(new java.awt.Dimension(130, 30));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane1.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane1.setText("MANAGE BORROWERS");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane1.setViewportView(jTextPane1);

        delete_btn.setBackground(new java.awt.Color(78, 66, 52));
        delete_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.setAlignmentX(0.5F);
        delete_btn.setBorderPainted(false);
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.setFocusPainted(false);
        delete_btn.setFocusable(false);
        delete_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete_btn.setName("delete_btn"); // NOI18N
        delete_btn.setPreferredSize(new java.awt.Dimension(130, 30));
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
        search_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        search_btn.setMaximumSize(new java.awt.Dimension(66, 31));
        search_btn.setMinimumSize(new java.awt.Dimension(66, 31));
        search_btn.setName("search_btn"); // NOI18N
        search_btn.setPreferredSize(new java.awt.Dimension(130, 30));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

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
        edit_btn.setName("edit_btn"); // NOI18N
        edit_btn.setPreferredSize(new java.awt.Dimension(130, 30));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
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
        Backbtn.setMaximumSize(new java.awt.Dimension(40, 30));
        Backbtn.setMinimumSize(new java.awt.Dimension(40, 30));
        Backbtn.setPreferredSize(new java.awt.Dimension(40, 30));
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        search_txt.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setText("Search by Name");
        search_txt.setMaximumSize(new java.awt.Dimension(188, 30));
        search_txt.setMinimumSize(new java.awt.Dimension(188, 30));
        search_txt.setPreferredSize(new java.awt.Dimension(188, 30));
        search_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_txtFocusLost(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(200, 195, 174));
        jScrollPane2.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane2.setMinimumSize(new java.awt.Dimension(880, 340));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(880, 340));

        borrowers_tbl.setBackground(new java.awt.Color(183, 172, 162));
        borrowers_tbl.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        borrowers_tbl.setForeground(new java.awt.Color(0, 0, 0));
        borrowers_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LibraryCardID", "Name", "Surname", "Address", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        borrowers_tbl.setMaximumSize(new java.awt.Dimension(300, 80));
        borrowers_tbl.getTableHeader().setReorderingAllowed(false);
        borrowers_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowers_tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(borrowers_tbl);

        refresh_btn.setBackground(new java.awt.Color(78, 66, 52));
        refresh_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        refresh_btn.setForeground(new java.awt.Color(255, 255, 255));
        refresh_btn.setAlignmentX(0.5F);
        refresh_btn.setBorderPainted(false);
        refresh_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh_btn.setFocusPainted(false);
        refresh_btn.setFocusable(false);
        refresh_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refresh_btn.setMaximumSize(new java.awt.Dimension(50, 30));
        refresh_btn.setMinimumSize(new java.awt.Dimension(50, 30));
        refresh_btn.setName("search_btn"); // NOI18N
        refresh_btn.setPreferredSize(new java.awt.Dimension(50, 30));
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borrowerBodyLayout = new javax.swing.GroupLayout(borrowerBody);
        borrowerBody.setLayout(borrowerBodyLayout);
        borrowerBodyLayout.setHorizontalGroup(
            borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowerBodyLayout.createSequentialGroup()
                .addGroup(borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrowerBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borrowerBodyLayout.createSequentialGroup()
                        .addGroup(borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(borrowerBodyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, borrowerBodyLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        borrowerBodyLayout.setVerticalGroup(
            borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowerBodyLayout.createSequentialGroup()
                .addGroup(borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrowerBodyLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowerBodyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(borrowerBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowerBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowerBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        this.dispose();
        new borrowersAdd().setVisible(true);
    }//GEN-LAST:event_add_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        if(rowIndex != -1){
        borrowersEdit editDialog = new borrowersEdit();
        editDialog.SetBorrower(borrowers.get(rowIndex));
        editDialog.setVisible(true);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select an borrower you wish to edit", "Update Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if(rowIndex != -1){
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you wish to delete '" +
                    borrowers.get(rowIndex).getName() + " " + borrowers.get(rowIndex).getSurname() + "'?", "Confirmation", JOptionPane.YES_NO_OPTION);
                   if(option == JOptionPane.YES_OPTION)
                   {
                       String selectedID = borrowers.get(rowIndex).getLibraryCardID();
                       db.DeleteBorrower(selectedID);
                       RefreshTable();
                   }
        }
        else{JOptionPane.showMessageDialog(this, "Please select borrower you wish to delete", "Delete Error", JOptionPane.ERROR_MESSAGE);
    }  
    }//GEN-LAST:event_delete_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        if(search_txt.getText() == " "){
            JOptionPane.showMessageDialog(this, "Please enter the Borrower's name to search for", "Search Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String name = search_txt.getText();
            borrowers = db.searchBorrower(name);
            
            DefaultTableModel model = (DefaultTableModel) borrowers_tbl.getModel();
            model.setRowCount(0);
            for(Borrower borrower: borrowers)
            {
                model.addRow(new Object[]{borrower.getLibraryCardID(), borrower.getName(), borrower.getSurname(), borrower.getAddress(), borrower.getPhone(), borrower.getEmail()});
            }
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        this.dispose();
        new maindashboard().setVisible(true);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         RefreshTable();
    }//GEN-LAST:event_formWindowOpened

    private void borrowers_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowers_tblMouseClicked
         rowIndex = borrowers_tbl.getSelectedRow();
    }//GEN-LAST:event_borrowers_tblMouseClicked

    private void search_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_txtFocusGained
        if (search_txt.getText().equals("Search by Name")) 
        {
            search_txt.setText("");
        }
    }//GEN-LAST:event_search_txtFocusGained

    private void search_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_txtFocusLost
        if (search_txt.getText().isEmpty()) 
        {
            search_txt.setText("Search by Name");
        }
    }//GEN-LAST:event_search_txtFocusLost

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        RefreshTable();
    }//GEN-LAST:event_refresh_btnActionPerformed

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
            java.util.logging.Logger.getLogger(borrowersCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrowersCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrowersCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrowersCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrowersCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton add_btn;
    private javax.swing.JPanel borrowerBody;
    private javax.swing.JTable borrowers_tbl;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables
}

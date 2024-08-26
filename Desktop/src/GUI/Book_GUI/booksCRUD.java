package GUI.Book_GUI;

import GUI.Author_GUI.authorCRUD;
import GUI.DatabaseConnection;
import GUI.maindashboard;
import desktop.models.Author;
import desktop.models.Book;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class booksCRUD extends javax.swing.JFrame {
    
    public booksCRUD() {
        initComponents();
        addHoverEffect(add_btn);
        addHoverEffect(search_btn);
        addHoverEffect(delete_btn);
        addHoverEffect(edit_btn);
    }
    DatabaseConnection db = new DatabaseConnection();
    ArrayList<Book> books = new ArrayList<>();
    int rowIndex = -1;
    
    public void RefreshTable(){
        try {
            db.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(authorCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        books = db.Bookview();
        
        DefaultTableModel model = (DefaultTableModel) books_tbl.getModel();
        model.setRowCount(0);
        
        for(Book book : books){
            Author author = db.findAuthorOfBook(book.getAuthorID());
            model.addRow(new Object[]{book.getBookID(), book.getTitle(), book.getGenre(), book.getYearOfPublication(), book.getStatus(), author.getFirstName() + " " + author.getLastName()});
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

        bookBody = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        delete_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        books_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Books");
        setLocation(new java.awt.Point(500, 500));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bookBody.setBackground(new java.awt.Color(38, 39, 43));
        bookBody.setPreferredSize(new java.awt.Dimension(900, 500));
        bookBody.setRequestFocusEnabled(false);

        add_btn.setBackground(new java.awt.Color(78, 66, 52));
        add_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("Add Book");
        add_btn.setAlignmentX(0.5F);
        add_btn.setBorderPainted(false);
        add_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_btn.setFocusPainted(false);
        add_btn.setFocusable(false);
        add_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_btn.setMargin(new java.awt.Insets(2, 14, 2, 14));
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
        jTextPane1.setText("MANAGE BOOKS");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTextPane1.setSelectedTextColor(new java.awt.Color(159, 105, 50));
        jScrollPane1.setViewportView(jTextPane1);

        delete_btn.setBackground(new java.awt.Color(78, 66, 52));
        delete_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete Book");
        delete_btn.setAlignmentY(0.0F);
        delete_btn.setBorderPainted(false);
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.setFocusPainted(false);
        delete_btn.setFocusable(false);
        delete_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete_btn.setMargin(new java.awt.Insets(2, 14, 2, 14));
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
        search_btn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        search_btn.setName("search_btn"); // NOI18N
        search_btn.setPreferredSize(new java.awt.Dimension(152, 27));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(78, 66, 52));
        edit_btn.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("Edit Book");
        edit_btn.setAlignmentX(0.5F);
        edit_btn.setBorderPainted(false);
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.setFocusPainted(false);
        edit_btn.setFocusable(false);
        edit_btn.setMargin(new java.awt.Insets(2, 14, 2, 14));
        edit_btn.setName("edit_btn"); // NOI18N
        edit_btn.setPreferredSize(new java.awt.Dimension(152, 27));
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
        Backbtn.setPreferredSize(new java.awt.Dimension(40, 30));
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        search_txt.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setText("Search by Title");

        jScrollPane2.setBackground(new java.awt.Color(200, 195, 174));
        jScrollPane2.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 280));

        books_tbl.setBackground(new java.awt.Color(183, 172, 162));
        books_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Title", "Genre", "YearOfPublication", "Status", "Author"
            }
        ));
        books_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                books_tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(books_tbl);

        javax.swing.GroupLayout bookBodyLayout = new javax.swing.GroupLayout(bookBody);
        bookBody.setLayout(bookBodyLayout);
        bookBodyLayout.setHorizontalGroup(
            bookBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookBodyLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookBodyLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bookBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookBodyLayout.createSequentialGroup()
                                .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bookBodyLayout.createSequentialGroup()
                                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        bookBodyLayout.setVerticalGroup(
            bookBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookBodyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(bookBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookBodyLayout.createSequentialGroup()
                        .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(bookBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        this.dispose();
        new bookAdd().setVisible(true);
    }//GEN-LAST:event_add_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        if(rowIndex != -1){
            bookEdit editDialog = new bookEdit();
            editDialog.SetBook(books.get(rowIndex));
            editDialog.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a book you wish to edit", "Update Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if(rowIndex != -1){
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you wish to delete '" + books.get(rowIndex).getTitle() + "'?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION){
                String selectedID = books.get(rowIndex).getBookID();
                db.DeleteBook(selectedID);
            
            RefreshTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a book you wish to delete", "Delete Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_btnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        this.dispose();
        new maindashboard().setVisible(true);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RefreshTable();
    }//GEN-LAST:event_formWindowOpened

    private void books_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_books_tblMouseClicked
        rowIndex = books_tbl.getSelectedRow();
    }//GEN-LAST:event_books_tblMouseClicked

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
            java.util.logging.Logger.getLogger(booksCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booksCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booksCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booksCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booksCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton add_btn;
    private javax.swing.JPanel bookBody;
    private javax.swing.JTable books_tbl;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables
}

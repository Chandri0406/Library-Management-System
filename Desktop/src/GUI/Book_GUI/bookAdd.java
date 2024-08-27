/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Book_GUI;

import GUI.DatabaseConnection;
import desktop.models.Author;
import desktop.models.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chanb
 */
public class bookAdd extends javax.swing.JFrame {

    /**
     * Creates new form bookAdd
     */
    public bookAdd() {
        initComponents();
        GenreOptions = new ArrayList<>(Arrays.asList("Romance", "Fantasy", "Science", "Fiction", "Paranormal", "Mystery", "Horror", "Thriller/Suspense", "Action Adventure", "Historical Fiction", "Contemporary Fiction", "Young Adult"));
    }
    DatabaseConnection db = new DatabaseConnection();
    ArrayList<Author> authors = new ArrayList<>();
    ArrayList<String> GenreOptions;

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
        title_lbl4 = new javax.swing.JLabel();
        genre_lbl4 = new javax.swing.JLabel();
        author_lbl = new javax.swing.JLabel();
        title_txt4 = new javax.swing.JTextField();
        yearpub_txt4 = new javax.swing.JTextField();
        submit_btn4 = new javax.swing.JButton();
        yearpub_lbl1 = new javax.swing.JLabel();
        author_ComboBox = new javax.swing.JComboBox<>();
        genre_ComboBox = new javax.swing.JComboBox<>();
        status_btn = new javax.swing.JToggleButton();
        status_lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setLocationByPlatform(true);
        setMaximumSize(getMaximumSize());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(38, 39, 43));
        jPanel6.setMaximumSize(new java.awt.Dimension(620, 490));
        jPanel6.setMinimumSize(new java.awt.Dimension(620, 490));
        jPanel6.setPreferredSize(new java.awt.Dimension(620, 490));

        jScrollPane5.setBorder(null);

        jTextPane5.setEditable(false);
        jTextPane5.setBackground(new java.awt.Color(38, 39, 43));
        jTextPane5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTextPane5.setFont(new java.awt.Font("Sitka Heading", 1, 48)); // NOI18N
        jTextPane5.setForeground(new java.awt.Color(159, 105, 50));
        jTextPane5.setText("BOOK");
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

        title_lbl4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        title_lbl4.setForeground(new java.awt.Color(255, 255, 255));
        title_lbl4.setText("Title :");
        title_lbl4.setToolTipText("");

        genre_lbl4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        genre_lbl4.setForeground(new java.awt.Color(255, 255, 255));
        genre_lbl4.setText("Genre :");

        author_lbl.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        author_lbl.setForeground(new java.awt.Color(255, 255, 255));
        author_lbl.setText("Author :");

        title_txt4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        title_txt4.setForeground(new java.awt.Color(255, 255, 255));
        title_txt4.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        yearpub_txt4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        yearpub_txt4.setForeground(new java.awt.Color(255, 255, 255));
        yearpub_txt4.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        submit_btn4.setBackground(new java.awt.Color(159, 105, 50));
        submit_btn4.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        submit_btn4.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn4.setText("SUBMIT");
        submit_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btn4ActionPerformed(evt);
            }
        });

        yearpub_lbl1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        yearpub_lbl1.setForeground(new java.awt.Color(255, 255, 255));
        yearpub_lbl1.setText("Year of publication :");
        yearpub_lbl1.setToolTipText("");

        author_ComboBox.setBackground(new java.awt.Color(40, 40, 40));
        author_ComboBox.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        author_ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        author_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        genre_ComboBox.setBackground(new java.awt.Color(40, 40, 40));
        genre_ComboBox.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        genre_ComboBox.setForeground(new java.awt.Color(255, 255, 255));
        genre_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        status_btn.setBackground(new java.awt.Color(78, 66, 52));
        status_btn.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        status_btn.setForeground(new java.awt.Color(255, 255, 255));
        status_btn.setSelected(true);
        status_btn.setText("Available");
        status_btn.setToolTipText("");
        status_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        status_lbl2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        status_lbl2.setForeground(new java.awt.Color(255, 255, 255));
        status_lbl2.setText("Status :");
        status_lbl2.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(genre_lbl4)
                                .addComponent(status_lbl2))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(title_lbl4)
                                    .addComponent(author_lbl))
                                .addGap(5, 5, 5)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(author_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title_txt4)
                                .addComponent(genre_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yearpub_lbl1)
                            .addComponent(back_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(yearpub_txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(submit_btn4)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(back_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(title_txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title_lbl4))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(author_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(author_lbl))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genre_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genre_lbl4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(status_lbl2)
                            .addComponent(status_btn))
                        .addGap(28, 28, 28)
                        .addComponent(yearpub_txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(yearpub_lbl1))
                .addGap(39, 39, 39)
                .addComponent(submit_btn4)
                .addContainerGap(25, Short.MAX_VALUE))
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
        new booksCRUD().setVisible(true);
    }//GEN-LAST:event_back_btn4ActionPerformed

    private void submit_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btn4ActionPerformed
        if(title_txt4.getText() == " " || author_ComboBox.getSelectedIndex() == 0 || genre_ComboBox.getSelectedIndex() == 0 || yearpub_txt4.getText() == " "){
            JOptionPane.showMessageDialog(this, "Please fill in all fields and choose an author and a genre please");
        }
        else{
            String title = title_txt4.getText();
            int authorIndex = author_ComboBox.getSelectedIndex() - 1;
            Author author = authors.get(authorIndex);
            int genreIndex = genre_ComboBox.getSelectedIndex() - 1;
            String genre = GenreOptions.get(genreIndex);
            String status = "";
            if(status_btn.isSelected()){
                status = "Available";
            }
            else{
                status = "Unavailable";
            }
            int yearOfPublication = Integer.parseInt(yearpub_txt4.getText());
            Book book = new Book(title, genre, yearOfPublication, status, author.getAuthorID());
            db.addBook(book);
            
            title_txt4.setText("");
            author_ComboBox.setSelectedIndex(0);
            genre_ComboBox.setSelectedIndex(0);
            status_btn.setSelected(true);
            yearpub_txt4.setText("");
        }
    }//GEN-LAST:event_submit_btn4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        author_ComboBox.removeAllItems();
        author_ComboBox.addItem("Select Author");
        
        try {
            db.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        authors = db.Authorview();
        for(Author auth : authors){
            author_ComboBox.addItem(auth.getFirstName() + " " + auth.getLastName());
        }
        
        genre_ComboBox.removeAllItems();
        genre_ComboBox.addItem("Select Genre");
        for(String genre : GenreOptions){
            genre_ComboBox.addItem(genre);
        }
    }//GEN-LAST:event_formWindowOpened
    
    
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
            java.util.logging.Logger.getLogger(bookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> author_ComboBox;
    private javax.swing.JLabel author_lbl;
    private javax.swing.JButton back_btn4;
    private javax.swing.JComboBox<String> genre_ComboBox;
    private javax.swing.JLabel genre_lbl4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JToggleButton status_btn;
    private javax.swing.JLabel status_lbl2;
    private javax.swing.JButton submit_btn4;
    private javax.swing.JLabel title_lbl4;
    private javax.swing.JTextField title_txt4;
    private javax.swing.JLabel yearpub_lbl1;
    private javax.swing.JTextField yearpub_txt4;
    // End of variables declaration//GEN-END:variables
}

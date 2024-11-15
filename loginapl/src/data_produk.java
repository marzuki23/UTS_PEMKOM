import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class data_produk extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private Object rs;
    private Object stmt;
    private String keyword;
    private Object userTable;
    private Object produkTable;

    /**
     * Creates new form edit_user
     */


    public data_produk() {
    initComponents();

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
        beranda = new javax.swing.JButton();
        Produk = new javax.swing.JButton();
        profil = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        user = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPencarian = new javax.swing.JTextField();
        hapus_produk = new javax.swing.JButton();
        tambahproduk = new javax.swing.JButton();
        editproduk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproduk = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        beranda.setText("Beranda");
        beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berandaActionPerformed(evt);
            }
        });

        Produk.setBackground(new java.awt.Color(51, 255, 255));
        Produk.setText("Produk");
        Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukActionPerformed(evt);
            }
        });

        profil.setText("profil");
        profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilActionPerformed(evt);
            }
        });

        jButton4.setText("laporan keuangan");

        jButton5.setText("settings");

        user.setText("users");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Produk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(beranda)
                .addGap(40, 40, 40)
                .addComponent(Produk)
                .addGap(45, 45, 45)
                .addComponent(profil)
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addGap(45, 45, 45)
                .addComponent(jButton5)
                .addGap(48, 48, 48)
                .addComponent(user)
                .addGap(55, 55, 55)
                .addComponent(logout)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1145, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("PRODUK");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Produk");

        txtPencarian.setText("                                          Pencarian");
        txtPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianActionPerformed(evt);
            }
        });

        hapus_produk.setBackground(new java.awt.Color(255, 0, 0));
        hapus_produk.setText("Hapus Produk");
        hapus_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_produkActionPerformed(evt);
            }
        });

        tambahproduk.setText("Tambah Produk");
        tambahproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahprodukActionPerformed(evt);
            }
        });

        editproduk.setText("Edit Produk");
        editproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprodukActionPerformed(evt);
            }
        });

        tableproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdProduk", "Nama Produk", "Kategori", "Stok", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tableproduk);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(112, 112, 112)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(hapus_produk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tambahproduk)
                                .addGap(18, 18, 18)
                                .addComponent(editproduk)))
                        .addContainerGap())
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapus_produk)
                            .addComponent(tambahproduk)
                            .addComponent(editproduk)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
                this.setVisible(false);
                new dataUser().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
try (Connection conn = config.configDB()) {
            String sql = "SELECT Username, first_name, last_name, tanggal_daftar FROM akun";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) stmt.executeQuery();

            tableModel.setRowCount(0); // Bersihkan tabel sebelum memuat data baru
            while (rs.next()) {
                String username = rs.getString("Username");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String tanggalDaftar = rs.getString("tanggal_daftar");

                tableModel.addRow(new Object[]{username, firstName, lastName, tanggalDaftar});
            }
            rs.close();
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Data Berhasil diProses.", "Sukses", JOptionPane.ERROR_MESSAGE);
        }


            String sql = "SELECT Username, first_name, last_name, tanggal_daftar FROM akun " +
                         "WHERE Username LIKE ? OR first_name LIKE ? OR last_name LIKE ?";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            String searchKeyword = "%" + keyword + "%";
        try {
            stmt.setString(1, searchKeyword);
        } catch (Exception ex) {
            Logger.getLogger(data_produk.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setString(2, searchKeyword);
        } catch (Exception ex) {
            Logger.getLogger(data_produk.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.setString(3, searchKeyword);
        } catch (Exception ex) {
            Logger.getLogger(data_produk.class.getName()).log(Level.SEVERE, null, ex);
        }

            ResultSet rs = null;
        try {
            rs = (ResultSet) stmt.executeQuery();
        } catch (Exception ex) {
            Logger.getLogger(data_produk.class.getName()).log(Level.SEVERE, null, ex);
        }
            tableModel.setRowCount(0); // Bersihkan tabel sebelum menampilkan hasil pencarian
            while (rs.next()) {
                String username = rs.getString("Username");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String tanggalDaftar = rs.getString("tanggal_daftar");

                tableModel.addRow(new Object[]{username, firstName, lastName, tanggalDaftar});
            }
            rs.close();
        try {
            stmt.close();
        } catch (Exception ex) {
            Logger.getLogger(data_produk.class.getName()).log(Level.SEVERE, null, ex);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianActionPerformed

    private void hapus_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_produkActionPerformed
    int selectedRow = tableproduk.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Produk berhasil terhapus.", "sukses", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String username = tableModel.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus akun dengan Username: " + username + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = config.configDB()) {
                String sql = "DELETE FROM akun WHERE Username = ?";
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                stmt.setString(1, username);
                
                int rowsAffected = data_produk.pst.executeUpdate();
                if (rowsAffected > 0) {
                    tableModel.removeRow(selectedRow); // Hapus baris dari tabel GUI
                    JOptionPane.showMessageDialog(this, "Akun berhasil dihapus.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus akun.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                stmt.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saat menghapus akun: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_hapus_produkActionPerformed

    private void tambahprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahprodukActionPerformed
this.setVisible(false);
                new tambah_produk().setVisible(true);            // TODO add your handling code here:
    }//GEN-LAST:event_tambahprodukActionPerformed

    private void editprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprodukActionPerformed
                this.setVisible(false);
        edit_Produk.setVisible setVisible = new edit_Produk.setVisible(true);    
                new edit_Produk.setVisible(true);        }//GEN-LAST:event_editprodukActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
                this.setVisible(false);
                new Beranada().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_berandaActionPerformed

    private void ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukActionPerformed
                                  
    // Set up JTable and table model
    tableproduk = new JTable();
    tableModel = new DefaultTableModel(new String[]{ "Nama Produk", "Kategori", "Stok", "Harga"}, 0);
    tableproduk.setModel(tableModel);

    // Add JTable to JScrollPane
    JScrollPane scrollPane = new JScrollPane(tableproduk);
    add(scrollPane); // Add the scrollPane directly to the JFrame

    // Load data from the database
    loadDataFromDatabase();
}

private void loadDataFromDatabase() {
    try {
        Connection conn = config.configDB(); // Adjust your config as needed
        if (conn != null) {
            System.out.println("Koneksi berhasil.");
            Statement stmt = conn.createStatement();

            // SQL query to fetch data from the 'produk' table
            String sql = "SELECT IdProduk, nama_produk, kategori, stok, harga FROM produk";
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);

            // Populate data into JTable
            while (rs.next()) {
                int idProduk = rs.getInt("IdProduk");
                String namaProduk = rs.getString("nama_produk");
                String kategori = rs.getString("kategori");
                int stok = rs.getInt("stok");
                double harga = rs.getDouble("harga");

                // Add each row to the table model
                tableModel.addRow(new Object[]{idProduk, namaProduk, kategori, stok, harga});
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } else {
            System.out.println("Koneksi gagal.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_ProdukActionPerformed

    private void profilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilActionPerformed
                this.setVisible(false);
                new Profil().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_profilActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
                this.setVisible(false);
                new login_apl().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(data_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_produk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Produk;
    private javax.swing.JButton beranda;
    private javax.swing.JButton editproduk;
    private javax.swing.JButton hapus_produk;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JButton profil;
    private javax.swing.JTable tableproduk;
    private javax.swing.JButton tambahproduk;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables

    private static class pst {

        private static int executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public pst() {
        }
    }
}

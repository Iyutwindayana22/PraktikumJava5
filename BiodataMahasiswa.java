
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melinda
 */
public class BiodataMahasiswa extends javax.swing.JFrame {
    
    ResultSet result;
    Statement statement;
    Connection koneksi;
    Boolean isEdit = false, isInsert = false;

    /**
     * Creates new form BiodataMahasiswa
     */
    public BiodataMahasiswa() {
        initComponents();
        doConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        txtAlamat = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtFakultas = new javax.swing.JTextField();
        txtJurusan = new javax.swing.JTextField();
        txtAngkatan = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Biodata Mahasiswa");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");
        jLabel3.setToolTipText("");

        jLabel4.setText("Jenis Kelamin");
        jLabel4.setToolTipText("");

        jLabel5.setText("Tanggal Lahir");
        jLabel5.setToolTipText("");

        jLabel7.setText("Alamat");
        jLabel7.setToolTipText("");

        jLabel6.setText("Fakultas");
        jLabel6.setToolTipText("");

        jLabel8.setText("Jurusan");
        jLabel8.setToolTipText("");

        jLabel9.setText("Angkatan");
        jLabel9.setToolTipText("");

        buttonGroup1.add(rbLaki);
        rbLaki.setText("Laki - Laki");

        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSimpan)
                                .addGap(8, 8, 8)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClose))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(68, 68, 68)
                                            .addComponent(txtAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbLaki)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtJurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtFakultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(rbPerempuan)))))))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbLaki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbPerempuan)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnClose)
                    .addComponent(btnSimpan)
                    .addComponent(btnTambah))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        try {
            if (!result.isFirst()) {
                result.previous();
                tampilData();
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            if (!result.isLast()) {
                result.next();
                tampilData();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://localhost:3306/latihan_db";
            String username = "root";
            String password = "";
            koneksi = DriverManager.getConnection(host, username, password);
            statement = koneksi.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM biodata_mhs";
            result = statement.executeQuery(sql);
            
            while (result.next()){
                result.updateString("nim", txtNim.getText());
                result.updateString("nama", txtNama.getText());
                
                String kelamin=null;
                if (rbLaki.isSelected())
                    kelamin = "Laki - Laki";
                else if (rbPerempuan.isSelected())
                    kelamin = "Perempuan";
                result.updateString("jenis_kelamin", kelamin);
                
                SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    java.util.Date date = formater.parse(txtTanggal.getText());
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    result.updateDate("tanggal_lahir", (java.sql.Date) sqlDate);
                }
                catch (ParseException e) {
                }
        
                result.updateString("alamat", txtAlamat.getText());
                result.updateString("fakultas", txtFakultas.getText());
                result.updateString("jurusan", txtJurusan.getText());
                result.updateString("angkatan", txtAngkatan.getText());
        
                result.updateRow();
                
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                
            }
            result.close();
            statement.close();
        } catch (final SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          doConnect();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://localhost:3306/latihan_db";
            String username = "root";
            String password = "";
            koneksi = DriverManager.getConnection(host, username, password);
            statement = koneksi.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM biodata_mhs";
            result = statement.executeQuery(sql);
            
            while (result.first()){
                result.updateString("nim", txtNim.getText());
                result.updateString("nama", txtNama.getText());
                
                String kelamin=null;
                if (rbLaki.isSelected())
                    kelamin = "Laki - Laki";
                else if (rbPerempuan.isSelected())
                    kelamin = "Perempuan";
                result.updateString("jenis_kelamin", kelamin);
                
                SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    java.util.Date date = formater.parse(txtTanggal.getText());
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    result.updateDate("tanggal_lahir", (java.sql.Date) sqlDate);
                }
                catch (ParseException e) {
                }
        
                result.updateString("alamat", txtAlamat.getText());
                result.updateString("fakultas", txtFakultas.getText());
                result.updateString("jurusan", txtJurusan.getText());
                result.updateString("angkatan", txtAngkatan.getText());
        
                result.deleteRow();
                
                JOptionPane.showConfirmDialog(null, "Yakin akan menghapus data?", 
                "Program keluar", JOptionPane.YES_NO_OPTION);
            }
        } catch (final SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          doConnect();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://localhost:3306/latihan_db";
            String username = "root";
            String password = "";
            koneksi = DriverManager.getConnection(host, username, password);
            statement = koneksi.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM biodata_mhs";
            result = statement.executeQuery(sql);
            
            while (result.next()){
                result.moveToInsertRow();
                result.updateString("nim", txtNim.getText());
                result.updateString("nama", txtNama.getText());
                
                String kelamin=null;
                if (rbLaki.isSelected())
                    kelamin = "Laki - Laki";
                else if (rbPerempuan.isSelected())
                    kelamin = "Perempuan";
                result.updateString("jenis_kelamin", kelamin);
                
                SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    java.util.Date date = formater.parse(txtTanggal.getText());
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    result.updateDate("tanggal_lahir", (java.sql.Date) sqlDate);
                }
                catch (ParseException e) {
                }
        
                result.updateString("alamat", txtAlamat.getText());
                result.updateString("fakultas", txtFakultas.getText());
                result.updateString("jurusan", txtJurusan.getText());
                result.updateString("angkatan", txtAngkatan.getText());
        
                result.insertRow();
                
                JOptionPane.showMessageDialog(null, "Data berhasil ditambah");
            }
        } catch (final SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          doConnect();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(BiodataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiodataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiodataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiodataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiodataMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAngkatan;
    private javax.swing.JTextField txtFakultas;
    private javax.swing.JTextField txtJurusan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables

    private void doConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String host = "jdbc:mysql://localhost:3306/latihan_db";
            String username = "root";
            String password = "";
            koneksi = DriverManager.getConnection(host, username, password);
            
            statement = koneksi.createStatement();
            String sql = "SELECT * FROM biodata_mhs";
            result = statement.executeQuery(sql);
            
            // pindahkan kursor pada record pertama
            result.first();
            tampilData();
        }
        catch (IllegalAccessException | ClassNotFoundException
                | InstantiationException | SQLException ex) {
            Logger.getLogger(BiodataMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void tampilData() throws SQLException {
        txtNim.setText(result.getString("nim"));
        txtNama.setText(result.getString("nama"));
        
        String kelamin = result.getString("jenis_kelamin");
        switch (kelamin) {
            case "Laki - Laki":
                rbLaki.setSelected(true);
                break;
            case "Perempuan":
                rbPerempuan.setSelected(true);
                break;
        }
        txtTanggal.setText(result.getString("tanggal_lahir"));
        txtAlamat.setText(result.getString("alamat"));
        txtFakultas.setText(result.getString("fakultas"));
        txtJurusan.setText(result.getString("jurusan"));
        txtAngkatan.setText(result.getString("angkatan"));
    }
    private void reset(){
        txtNim.setText("");
        txtNama.setText("");
        rbLaki.setText("Laki - Laki");
        rbPerempuan.setText("Perempuan");
        txtTanggal.setText("");
        txtAlamat.setText("");
        txtFakultas.setText("");
        txtJurusan.setText("");
        txtAngkatan.setText("");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ujianlabor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author altec
 */
public class konsultasi extends javax.swing.JFrame {
    private String sql;
    private Statement st;
    private DefaultTableModel dtm;
    private ResultSet rs;
    /**
     * Creates new form konsultasi
     */
    public konsultasi() {
        initComponents();
        tampil_combo();
        tampil_tabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnoreg = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        txtnamapasien = new javax.swing.JTextField();
        cmbkdpasien = new javax.swing.JComboBox();
        txtdiagnosa = new javax.swing.JTextField();
        txtpenanganan = new javax.swing.JTextField();
        txtketerangan = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_konsul = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("KLINIK MULIA TERPADU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jLabel3.setText("no registrasi");

        jLabel4.setText("tanggal konsultasi");

        jLabel5.setText("kode pasien");

        jLabel6.setText("nama pasien");

        jLabel7.setText("diagnosis");

        jLabel8.setText("penanganan");

        jLabel9.setText("keterangan");

        cmbkdpasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkdpasienActionPerformed(evt);
            }
        });

        btn_save.setText("Save data konsul");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        tabel_konsul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_konsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_konsulMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_konsul);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnoreg)
                            .addComponent(txttanggal)
                            .addComponent(cmbkdpasien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnamapasien)
                            .addComponent(txtdiagnosa)
                            .addComponent(txtpenanganan)
                            .addComponent(txtketerangan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnoreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbkdpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnamapasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtdiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpenanganan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtketerangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_save)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void tampil_combo()
    {
        
        
        try {
        Connection con = koneksiDB.getkoneksi();
        Statement st = con.createStatement();
        String sql = "select kd_pasien from pasien order by kd_pasien asc";      // disini saya menampilkan NIM, anda dapat menampilkan
        ResultSet res = st.executeQuery(sql);                                // yang anda ingin kan
               
        while(res.next()){
            Object[] ob = new Object[3];
            ob[0] = res.getString(1);
            
            cmbkdpasien.addItem(ob[0]);                                      // fungsi ini bertugas menampung isi dari database
        }
        res.close(); st.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public void tampil()
    {
        
        try {
        Connection con = koneksiDB.getkoneksi();
        Statement stt = con.createStatement();
        String sql = "select nm_pasien from pasien where kd_pasien='"+cmbkdpasien.getSelectedItem()+"'";  
        ResultSet res = stt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[1];
            ob[0]=  res.getString(1);
            
            txtnamapasien.setText((String) ob[0]);
        }
        res.close(); st.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
    public void tampil_tabel ()
{
    try {
        Object [] rows = {"NO REGISTRASI", "TANGGAL KONSUL", "KODE PASIEN", "NAMA PASIEN", "PENANGANAN", "KETERANGAN"};
        dtm = new DefaultTableModel(null, rows);
        tabel_konsul.setModel(dtm);
        
        String no_registrasi="", tgl_konsul="", kd_pasien="", nm_pasien="", diagnosis="", penanganan="", keterangan="";
        try {
            Connection c = koneksiDB.getkoneksi();
            sql = "Select * from  transaksi order by no_registrasi asc";
            st = c.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                no_registrasi = rs.getString("no_registrasi");
                tgl_konsul = rs.getString("tgl_konsul");
                kd_pasien = rs.getString("kd_pasien");
                nm_pasien = rs.getString("nm_pasien");
                diagnosis = rs.getString("diagnosis");
                penanganan = rs.getString("penanganan");
                keterangan = rs.getString("keterangan");

                
                String [] tampil = {no_registrasi, tgl_konsul, kd_pasien, nm_pasien, diagnosis, penanganan, keterangan};
                dtm.addRow(tampil);
            }           
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Query Salah"+e.getMessage());
        }
        
    } catch (Exception e) {}
  
}
    private void tabel_konsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_konsulMouseClicked
        txtnoreg.setText(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),0).toString());
        txttanggal.setText(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),1).toString());
        cmbkdpasien.setActionCommand(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),2).toString());
        txtnamapasien.setText(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),3).toString());
        txtdiagnosa.setText(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),4).toString());
        txtpenanganan.setText(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),5).toString());
        txtketerangan.setText(tabel_konsul.getValueAt(tabel_konsul.getSelectedRow(),6).toString());// TODO add your handling code here:
    }//GEN-LAST:event_tabel_konsulMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void cmbkdpasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkdpasienActionPerformed
        tampil();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbkdpasienActionPerformed

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
            java.util.logging.Logger.getLogger(konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konsultasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cmbkdpasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tabel_konsul;
    private javax.swing.JTextField txtdiagnosa;
    private javax.swing.JTextField txtketerangan;
    private javax.swing.JTextField txtnamapasien;
    private javax.swing.JTextField txtnoreg;
    private javax.swing.JTextField txtpenanganan;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables
}

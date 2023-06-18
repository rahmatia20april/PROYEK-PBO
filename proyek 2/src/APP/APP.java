package App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class APP extends javax.swing.JFrame {
    
    
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql = "";

    
    private void KoneksiDatabase(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/natalia_database","root","");
           JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
       }catch(Exception e) {
           System.out.println("Koneksi Gagal" + e.getMessage());
       }
   }


    public void clear(){
            tfnama.setText("");
            tfharga.setText("");
            tfjumlah.setText("");
            tfnama.requestFocus();
        }
    public  void insertData(){
            DefaultTableModel model = (DefaultTableModel) bank.getModel();
            int row = bank.getRowCount();
            model.addRow(new Object[]{
                row += 1,
                tfnama.getText(),
                tfharga.getText(),
                tfjumlah.getText()
            });
        }
    public double hitungTotal(){
             DefaultTableModel model = (DefaultTableModel) bank.getModel();
//        int[] selectedRows = TblBarang.getSelectedRows();
        int rowCount = model.getRowCount();
        double total = 0.0;

        
//        double total = 0.0;
//        for(int row : selectedRows){
//            double harga = Double.parseDouble(model.getValueAt(row, 2).toString());
//            int jumlah = Integer.parseInt(model.getValueAt(row, 3).toString());
//            total += harga*jumlah;
//        }

        for(int i = 0; i < rowCount; i++){
            double harga = Double.parseDouble(model.getValueAt(i, 2).toString());
            int jumlah = Integer.parseInt(model.getValueAt(i, 3).toString());
            total += harga*jumlah;
        }
        return total;
        
    }
    
    
    public APP() {
     initComponents();
     KoneksiDatabase();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        tfharga = new javax.swing.JTextField();
        tfjumlah = new javax.swing.JTextField();
        BTNTAMBAH = new javax.swing.JButton();
        BTNEDIT = new javax.swing.JButton();
        BTNDELETE = new javax.swing.JButton();
        BTNCLEAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bank = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbltotal = new javax.swing.JLabel();
        tftotal = new javax.swing.JTextField();
        lbltunai = new javax.swing.JLabel();
        tftunai = new javax.swing.JTextField();
        lblkembalian = new javax.swing.JLabel();
        tfkembalian = new javax.swing.JTextField();
        BTNHITUNG = new javax.swing.JButton();
        BTNSIMPAN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        garcon = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GARESTIA  SHOP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(313, 313, 313))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));

        tfnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamaActionPerformed(evt);
            }
        });

        tfharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhargaActionPerformed(evt);
            }
        });

        tfjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfjumlahActionPerformed(evt);
            }
        });

        BTNTAMBAH.setBackground(new java.awt.Color(0, 204, 204));
        BTNTAMBAH.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        BTNTAMBAH.setForeground(new java.awt.Color(255, 255, 255));
        BTNTAMBAH.setText("Tambah");
        BTNTAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNTAMBAHActionPerformed(evt);
            }
        });

        BTNEDIT.setBackground(new java.awt.Color(255, 0, 153));
        BTNEDIT.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        BTNEDIT.setForeground(new java.awt.Color(255, 255, 255));
        BTNEDIT.setText("Edit");
        BTNEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEDITActionPerformed(evt);
            }
        });

        BTNDELETE.setBackground(new java.awt.Color(51, 0, 204));
        BTNDELETE.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        BTNDELETE.setForeground(new java.awt.Color(255, 255, 255));
        BTNDELETE.setText("Delete");
        BTNDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDELETEActionPerformed(evt);
            }
        });

        BTNCLEAR.setBackground(new java.awt.Color(0, 204, 0));
        BTNCLEAR.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        BTNCLEAR.setForeground(new java.awt.Color(255, 255, 255));
        BTNCLEAR.setText("Clear");
        BTNCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCLEARActionPerformed(evt);
            }
        });

        bank.setBackground(new java.awt.Color(255, 204, 0));
        bank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(bank);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setForeground(new java.awt.Color(204, 255, 255));

        lbltotal.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(204, 255, 255));
        lbltotal.setText("Total");

        tftotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftotalActionPerformed(evt);
            }
        });

        lbltunai.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lbltunai.setForeground(new java.awt.Color(204, 255, 255));
        lbltunai.setText("Tunai");

        tftunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftunaiActionPerformed(evt);
            }
        });

        lblkembalian.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        lblkembalian.setForeground(new java.awt.Color(204, 255, 255));
        lblkembalian.setText("Kembalian");

        tfkembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfkembalianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tftunai, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotal)
                            .addComponent(lbltunai)
                            .addComponent(lblkembalian))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotal)
                    .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltunai)
                    .addComponent(tftunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkembalian)
                    .addComponent(tfkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        BTNHITUNG.setBackground(new java.awt.Color(153, 153, 153));
        BTNHITUNG.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BTNHITUNG.setForeground(new java.awt.Color(51, 51, 51));
        BTNHITUNG.setText("Hitung");
        BTNHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHITUNGActionPerformed(evt);
            }
        });

        BTNSIMPAN.setBackground(new java.awt.Color(204, 204, 255));
        BTNSIMPAN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BTNSIMPAN.setForeground(new java.awt.Color(51, 0, 51));
        BTNSIMPAN.setText("Simpan");
        BTNSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSIMPANActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));

        garcon.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        garcon.setForeground(new java.awt.Color(255, 255, 255));
        garcon.setText("NAMA");

        money.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        money.setForeground(new java.awt.Color(255, 255, 255));
        money.setText("HARGA");

        total.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("JUMLAH");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total)
                    .addComponent(money)
                    .addComponent(garcon))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(garcon)
                .addGap(18, 18, 18)
                .addComponent(money)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BTNHITUNG, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNSIMPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNTAMBAH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNEDIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(BTNDELETE)
                                .addGap(66, 66, 66)
                                .addComponent(BTNCLEAR))
                            .addComponent(tfharga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfjumlah, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfnama, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNTAMBAH)
                            .addComponent(BTNEDIT)
                            .addComponent(BTNDELETE)
                            .addComponent(BTNCLEAR))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNHITUNG)
                            .addComponent(BTNSIMPAN))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamaActionPerformed

    private void tfhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhargaActionPerformed

    private void tftotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftotalActionPerformed

    private void tftunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftunaiActionPerformed

    private void tfkembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfkembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfkembalianActionPerformed

    private void BTNTAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNTAMBAHActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(tfnama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama Barang Belum di Masukan");
        }else if(tfharga.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Harga Barang Belum di Masukan");
        }else if(tfjumlah.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Jumlah Barang Belum di Masukan");
        }else{
            insertData();
            clear();
        }
    }//GEN-LAST:event_BTNTAMBAHActionPerformed

    private void tfjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfjumlahActionPerformed

    private void BTNCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCLEARActionPerformed
        // TODO add your handling code here:
//        TFNamabarang.setText("");
//        TFHargabarang.setText("");
//        TFJumlahbarang.setText("");
        clear();

    }//GEN-LAST:event_BTNCLEARActionPerformed

    private void BTNEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEDITActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bank.getModel();
        int rowSelect = bank.getSelectedRow();
        
        if(BTNEDIT.getText()=="Edit"){
            BTNTAMBAH.setEnabled(false);
            BTNDELETE.setEnabled(false);
            BTNEDIT.setText("Update");
            tfnama.setText(model.getValueAt(rowSelect, 1).toString());
            tfharga.setText(model.getValueAt(rowSelect, 2).toString());
            tfjumlah.setText(model.getValueAt(rowSelect, 3).toString());
        }else {
            BTNTAMBAH.setEnabled(true);
            BTNDELETE.setEnabled(true);
            BTNEDIT.setText("Edit");
            
            String namabarang = tfnama.getText();
            String hargabarang = tfharga.getText();
            String jumlahbarang = tfjumlah.getText();
            
            model.setValueAt(namabarang, rowSelect, 1);
            model.setValueAt(hargabarang, rowSelect, 2);
            model.setValueAt(jumlahbarang, rowSelect, 3);
        clear();
        }
        
    }//GEN-LAST:event_BTNEDITActionPerformed

    private void BTNDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDELETEActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) bank.getModel();
        int rowSelect = bank.getSelectedRow();
        
        if(rowSelect == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
          int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin menghapus data ini?", 
                  "Konfirmasi Pengahapusan Data",JOptionPane.YES_NO_OPTION);
          if(confirm == JOptionPane.YES_OPTION){
              model.removeRow(rowSelect);
          }
        }
    }//GEN-LAST:event_BTNDELETEActionPerformed

    private void BTNHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHITUNGActionPerformed
          // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            double total = hitungTotal();
            tftotal.setText("Rp." + String.valueOf(total));

            String totalText = tftotal.getText().substring(3);
            double total1 = Double.parseDouble(totalText);
            double bayar = Double.parseDouble(tftunai.getText());
            double kembali = bayar - total1;
            tfkembalian.setText("Rp." + String.valueOf(kembali));
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Input tidak Valid");
        }


    }//GEN-LAST:event_BTNHITUNGActionPerformed

    private void BTNSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSIMPANActionPerformed
        // TODO add your handling code here:
          try{
           Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dt_produk","root","");
           
           int rowCount = bank.getRowCount();
           for(int i = 0; i < rowCount; i++){
               String Column1 = bank.getValueAt(i, 1).toString();
               String Column2 = bank.getValueAt(i, 2).toString();
               String Column3 = bank.getValueAt(i, 3).toString();
                        String sql = "INSERT INTO tb_produk (NAMA, HARGA, JUMLAH) VALUES (?,?,?)";
               PreparedStatement statement = Con.prepareStatement(sql);
               
               statement.setString(1, Column1);
               statement.setString(2, Column2);
               statement.setString(3, Column3);
               
               statement.executeUpdate();
           }   
           
           JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke database.");
           Con.close();
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data ke database.");
        }

    }//GEN-LAST:event_BTNSIMPANActionPerformed

     public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new APP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCLEAR;
    private javax.swing.JButton BTNDELETE;
    private javax.swing.JButton BTNEDIT;
    private javax.swing.JButton BTNHITUNG;
    private javax.swing.JButton BTNSIMPAN;
    private javax.swing.JButton BTNTAMBAH;
    private javax.swing.JTable bank;
    private javax.swing.JLabel garcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblkembalian;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltunai;
    private javax.swing.JLabel money;
    private javax.swing.JTextField tfharga;
    private javax.swing.JTextField tfjumlah;
    private javax.swing.JTextField tfkembalian;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tftotal;
    private javax.swing.JTextField tftunai;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}


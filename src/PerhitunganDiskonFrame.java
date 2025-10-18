import javax.swing.JOptionPane;

public class PerhitunganDiskonFrame extends javax.swing.JFrame {
    private final java.util.List<String> daftarRiwayat = new java.util.ArrayList<>();
    
    public PerhitunganDiskonFrame() {
        initComponents();
        pack();           
        setLocationRelativeTo(null); 
        
    // Pengaturan awal slider diskon
    sliderDiskon.setMinimum(0);
    sliderDiskon.setMaximum(50);
    sliderDiskon.setMajorTickSpacing(5);
    sliderDiskon.setPaintTicks(true);
    sliderDiskon.setPaintLabels(true);
    sliderDiskon.setSnapToTicks(true);
    sliderDiskon.setValue(0);
    
    //Set default ComboBox agar selaras dengan slider
    cmbDiskon.setSelectedIndex(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHargaAsli = new javax.swing.JTextField();
        txtKupon = new javax.swing.JTextField();
        cmbDiskon = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHargaAsliOutput = new javax.swing.JTextField();
        txtPenghematan = new javax.swing.JTextField();
        txtHargaAkhir = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayat = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        sliderDiskon = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 645));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 231, 255));
        jPanel2.setForeground(new java.awt.Color(161, 161, 161));

        jLabel1.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel1.setText("Aplikasi Perhitungan Diskon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 260, 30));

        jLabel2.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel2.setText("Harga Asli");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel3.setText("Diskon");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel4.setText("Kode Kupon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtHargaAsli.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jPanel1.add(txtHargaAsli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, -1));

        txtKupon.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jPanel1.add(txtKupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, -1));

        cmbDiskon.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        cmbDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%", "30%", "40%", "50%", " ", " " }));
        cmbDiskon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDiskonItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, -1));

        jButton1.setBackground(new java.awt.Color(229, 229, 229));
        jButton1.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jButton2.setBackground(new java.awt.Color(229, 229, 229));
        jButton2.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 214, 214));

        jLabel6.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel6.setText("Penghematan :");

        jLabel5.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel5.setText("Harga Akhir :");

        jLabel7.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel7.setText("Harga Asli  :");

        jLabel8.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Hasil Perhitungan ");

        txtHargaAsliOutput.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N

        txtPenghematan.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N

        txtHargaAkhir.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHargaAsliOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtPenghematan)
                    .addComponent(txtHargaAkhir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaAsliOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenghematan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHargaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 310, 150));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel10.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(115, 115, 115));
        jLabel10.setText(" Riwayat");

        txtRiwayat.setColumns(20);
        txtRiwayat.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        txtRiwayat.setRows(5);
        jScrollPane1.setViewportView(txtRiwayat);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 670, 350));

        jButton3.setBackground(new java.awt.Color(227, 227, 227));
        jButton3.setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N
        jButton3.setText("Riwayat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        sliderDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderDiskonStateChanged(evt);
            }
        });
        jPanel1.add(sliderDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 10));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.text.NumberFormat nf = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("id", "ID"));

        
        try {
        double hargaAsli = Double.parseDouble(txtHargaAsli.getText());
        String diskonStr = cmbDiskon.getSelectedItem().toString().replace("%", "");
        double diskonPersen = Double.parseDouble(diskonStr);
        String kodeKupon = txtKupon.getText();

    double diskonKupon = PerhitunganDiskonHelper.cekKupon(kodeKupon);
    double penghematan = PerhitunganDiskonHelper.hitungPenghematan(hargaAsli, diskonPersen, diskonKupon);
    double hargaAkhir = PerhitunganDiskonHelper.hitungHargaAkhir(hargaAsli, diskonPersen, diskonKupon);


    //Tampilkan hasil ke text field
    txtHargaAsliOutput.setText(nf.format(hargaAsli));
    txtPenghematan.setText(nf.format(penghematan));
    txtHargaAkhir.setText(nf.format(hargaAkhir));
        // Tambahkan ke area riwayat
         java.time.LocalDateTime now = java.time.LocalDateTime.now();
        String waktu = now.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy, HH.mm.ss"));
        


        // ✨ Format teks card
        String card = String.format("""
                                    \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500
                                    %s
                                    Harga   : %s
                                    Diskon  : %.0f%%
                                    Kupon   : %s
                                    Hemat   : %s
                                    Total   : %s
                                    \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500
                                    
                                    """,
            waktu,
            nf.format(hargaAsli),
            diskonPersen,
            (kodeKupon.isEmpty() ? "-" : kodeKupon),
            nf.format(penghematan),
            nf.format(hargaAkhir)
        );

        //txtRiwayat.append(card);
        
        
       // Simpan data ke daftarRiwayat
    String dataRiwayat = String.format(
    "%s\n%-8s: %s\n%-8s: %.0f%%\n%-8s: %s\n%-8s: %s\n%-8s: %s\n----------------------------------------\n",
    waktu,
    "Harga", nf.format(hargaAsli),
    "Diskon", diskonPersen,
    "Kupon", (kodeKupon.isEmpty() ? "-" : kodeKupon),
    "Hemat", nf.format(penghematan),
    "Total", nf.format(hargaAkhir)
);


    daftarRiwayat.add(dataRiwayat);
 

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan harga asli dengan benar!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtHargaAsli.setText("");
        txtKupon.setText("");
        if (cmbDiskon.getItemCount() > 0) {
        cmbDiskon.setSelectedIndex(0);
    }
        txtHargaAsliOutput.setText("");
        txtPenghematan.setText("");
        txtHargaAkhir.setText("");
        txtRiwayat.setText("");
        txtHargaAsli.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (daftarRiwayat.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Belum ada riwayat perhitungan.", "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Bersihkan area riwayat sebelum menampilkan
    txtRiwayat.setText("");

    // Gabungkan semua data dari daftarRiwayat
    StringBuilder semuaRiwayat = new StringBuilder();
    semuaRiwayat.append("");

    for (String data : daftarRiwayat) {
        semuaRiwayat.append(data).append("\n");
    }

    txtRiwayat.setText(semuaRiwayat.toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sliderDiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderDiskonStateChanged
          int value = sliderDiskon.getValue();
    if (value == 0) {
        cmbDiskon.setSelectedIndex(0); 
    } else {
        cmbDiskon.setSelectedItem(value + "%");
    }
    }//GEN-LAST:event_sliderDiskonStateChanged

    private void cmbDiskonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDiskonItemStateChanged
         if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selected = evt.getItem().toString().replace("%", "").trim();
            if (!selected.equals("......") && !selected.isEmpty()) {
                try {
                    int val = Integer.parseInt(selected);
                    sliderDiskon.setValue(val);
                } catch (NumberFormatException e) {
                    sliderDiskon.setValue(0);
                }
            } else {
                sliderDiskon.setValue(0);
            }
        }
    }//GEN-LAST:event_cmbDiskonItemStateChanged

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
            java.util.logging.Logger.getLogger(PerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganDiskonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDiskon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sliderDiskon;
    private javax.swing.JTextField txtHargaAkhir;
    private javax.swing.JTextField txtHargaAsli;
    private javax.swing.JTextField txtHargaAsliOutput;
    private javax.swing.JTextField txtKupon;
    private javax.swing.JTextField txtPenghematan;
    private javax.swing.JTextArea txtRiwayat;
    // End of variables declaration//GEN-END:variables
}

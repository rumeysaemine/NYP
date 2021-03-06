package nyp_proje;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    
    DefaultTableModel model1;
    
    ArrayList<Musteri> customerList = new ArrayList<>();
    
    /**
     * Creates new form NewJFrame
     */
    NewJFrame() {
        initComponents();
        setSize(970,560);
        model1 = (DefaultTableModel) jTable1.getModel();
        
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banka Uygulamas??");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(457, 136));

        jTable1.setForeground(new java.awt.Color(0, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad", "Soyad", "Mail Adresi", "Tel No", "Musteri No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(140);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(300);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(300);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Musteri Bilgileri");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(375, 408));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Adi:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Soyadi:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Mail Adresi:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Tel No:");

        jButton2.setText("Musteri Bilgileri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Musteri Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Hesap Bilgileri");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Kredi Bilgileri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Musteri bilgilerini giriniz.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 136));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Hesap Bilgileri");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 136));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Kredi Bilgileri");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 153));
        jLabel15.setText("Ogrenci Ad Soyad: RUMEYSA EMINE SAHIN");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 153));
        jLabel16.setText("Ogrenci Numara: 19360859002");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Butona tiklandiginda musteri sinifindan nesne olusturuyor.
        Musteri musteri = new Musteri();
        
        //Metin alanlarinin dolu olup olmadigini kontrol ettim.
        if(jTextField1.getText().isEmpty() | jTextField2.getText().isEmpty() | jTextField3.getText().isEmpty() | jTextField4.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Musteri bilgilerini eksiksiz giriniz!" ,"Hata!",JOptionPane.ERROR_MESSAGE);
        }
      
        else{
            
            //Kullanicinin metin alanina girdigi degerlere gore musteri bilgilerini ayarladim.
            musteri.setAd(jTextField1.getText());
            musteri.setSoyad(jTextField2.getText());
            musteri.setEmail(jTextField3.getText());
            musteri.setTelefonNumarasi(Long.valueOf(jTextField4.getText()));

            //Musteri numarasini ayarladim.
            int customerNumber = ThreadLocalRandom.current().nextInt(10000000, 100000000);
            musteri.setMusteriNumarasi(customerNumber);

            //Olusturulan musteriyi musteri listesine ekledim.
            customerList.add(musteri);

            //Musteri icin bir kredi karti olusturdum.
            KrediKarti krediKarti = new KrediKarti(2000, 150);
            long creditCardNumber = ThreadLocalRandom.current().nextLong(1000000000000000L ,10000000000000000L);
            krediKarti.setKartNumarasi(creditCardNumber);
            krediKarti.setKullanilabilirLimit(krediKarti.getLimit()-krediKarti.getGuncelBorc());

            ArrayList<KrediKarti> creditCardList = new ArrayList<>();
            creditCardList.add(krediKarti);
            musteri.setKrediKartlari(creditCardList);

            //Musteri icin bir hesap olusturdum.
            VadesizHesap hesap = new VadesizHesap(3000);
            long iban = ThreadLocalRandom.current().nextLong(100000000000000000L ,1000000000000000000L);
            hesap.setIban(iban);
            hesap.setHesapTuru("Vadesiz Hesap");

            ArrayList<BankaHesabi> bankAccounts = new ArrayList<>();
            bankAccounts.add(hesap);
            musteri.setHesaplar(bankAccounts);

            //Musteri eklendikten sonra metin alanlarini guncelledim.
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
        jPanel1.setVisible(true);  //Butona tiklandiginda panel gorunur oluyor.
        model1.setRowCount(customerList.size());  //Tablonun satir sayisini ayarladim.
        jTable1.setRowHeight(20);  //Tablonun satir yuksekligini ayarladim.
        
        //Musteri listesine eklenen musterilerin bilgilerini tabloda gosterdim. 
        for(int i=0;i<customerList.size();i++){
                jTable1.setValueAt(customerList.get(i).getAd(),i, 0);
                jTable1.setValueAt(customerList.get(i).getSoyad(),i, 1);
                jTable1.setValueAt(customerList.get(i).getEmail(),i, 2);
                jTable1.setValueAt(customerList.get(i).getTelefonNumarasi(),i, 3);
                jTable1.setValueAt(customerList.get(i).getMusteriNumarasi(),i, 4);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
        int index = jTable1.getSelectedRow();  //Tabloda secilen satirin indeksini bir degiskene atadim.
        jPanel4.setVisible(true);  //Butona tiklandiginda panel gorunur oluyor.
        
        if(index!=-1){
            jLabel11.setText(String.valueOf("Kart Numarasi: "+customerList.get(index).getKrediKartlari().get(0).getKartNumarasi()));
            jLabel12.setText(String.valueOf("Kart Limiti: "+customerList.get(index).getKrediKartlari().get(0).getLimit()));
            jLabel13.setText(String.valueOf("Guncel Borc: "+customerList.get(index).getKrediKartlari().get(0).getGuncelBorc()));
            jLabel14.setText(String.valueOf("Kullanilabilir limit: "+customerList.get(index).getKrediKartlari().get(0).getKullanilabilirLimit()));
        }
        else{
            JOptionPane.showMessageDialog(null,"Bilgilerini goruntulemek istediginiz musteriyi tablodan seciniz." ,"Hata!",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int index = jTable1.getSelectedRow();  //Tabloda secilen satirin indeksini bir degiskene atadim.
        jPanel2.setVisible(true);  //Butona tiklandiginda panel gorunur oluyor.
        if(index!=-1){
            jLabel7.setText("Hesap Iban: "+customerList.get(index).getHesaplar().get(0).getIban());
            jLabel8.setText("Hesap Bakiyesi: "+customerList.get(index).getHesaplar().get(0).getBakiye());
        }
        else{
            JOptionPane.showMessageDialog(null,"Bilgilerini goruntulemek istediginiz musteriyi tablodan seciniz." ,"Hata!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                                
                //Musteriler icin kredi kartlari olusturdum.
                KrediKarti krediKarti1 = new KrediKarti(3000, 200);
                long creditCardNumber1 = ThreadLocalRandom.current().nextLong(1000000000000000L ,10000000000000000L);
                krediKarti1.setKartNumarasi(creditCardNumber1);
                krediKarti1.setKullanilabilirLimit(krediKarti1.getLimit()-krediKarti1.getGuncelBorc());
                
                KrediKarti krediKarti2 = new KrediKarti(2000, 100);
                long creditCardNumber2 = ThreadLocalRandom.current().nextLong(1000000000000000L ,10000000000000000L);
                krediKarti2.setKartNumarasi(creditCardNumber2);
                krediKarti2.setKullanilabilirLimit(krediKarti2.getLimit()-krediKarti2.getGuncelBorc());
                
                //Musteriler icin banka hesaplari olusturdum.
                VadesizHesap hesap1 = new VadesizHesap(900);
                long iban = ThreadLocalRandom.current().nextLong(100000000000000000L ,1000000000000000000L);
                hesap1.setIban(iban);
                hesap1.setHesapTuru("Vadesiz Hesap");
                
                YatirimHesabi hesap2 = new YatirimHesabi(500);
                long iban2 = ThreadLocalRandom.current().nextLong(100000000000000000L ,1000000000000000000L);
                hesap2.setIban(iban2);
                hesap2.setHesapTuru("Yatirim Hesabi");
                
                YatirimHesabi hesap3 = new YatirimHesabi(1000);
                long iban3 = ThreadLocalRandom.current().nextLong(100000000000000000L ,1000000000000000000L);
                hesap3.setIban(iban3);
                hesap3.setHesapTuru("Yatirim Hesabi");
                
                
                //Musteriler olusturdum.
                Musteri musteri1 = new Musteri("Zeynep", "Sahin", "Zeynep@gmail.com", 905380846427L);
                int customerNumber = ThreadLocalRandom.current().nextInt(10000000, 100000000);
                musteri1.setMusteriNumarasi(customerNumber); 
                
                musteri1.hesapEkle(hesap1);
                musteri1.hesapEkle(hesap2);
                
                musteri1.krediKartiEkle(krediKarti1);
                musteri1.krediKartiEkle(krediKarti2);
                          
                Musteri musteri2 = new Musteri("Ayse", "Sahin", "Ayse@gmail.com", 905338190915L);
                int customerNumber2 = ThreadLocalRandom.current().nextInt(10000000, 100000000);
                musteri2.setMusteriNumarasi(customerNumber2);
                
                musteri2.hesapEkle(hesap3);
               
                ArrayList<Musteri> customerList2= new ArrayList<>();
                customerList2.add(musteri1);
                customerList2.add(musteri2);
                        
                //Banka personeli olusturdum.
                BankaPersoneli personel = new BankaPersoneli("Tugba", "Yapici", "Tugba@gmail.com", 901234567891L);
                int id = ThreadLocalRandom.current().nextInt(1, 100);
                personel.setPersonelId(id);
                personel.setMusteriler(customerList2);
                
                //Personel bilgilerini ekrana yazdirdim.
                System.out.println("Personel Bilgileri:");
                System.out.println(personel.toString());
                
                //Bir musterinin bilgilerini ekrana yazdirdim.
                System.out.println("\nMusteri Bilgileri:");
                System.out.println(musteri1.toString());
                System.out.println("\nHesap Bilgileri:");
                for(int i=0;i<musteri1.getHesaplar().size();i++){
                    System.out.println(musteri1.getHesaplar().get(i).toString());
                }
                System.out.println("\nKart Bilgiler:");
                for(int i=0;i<musteri1.getKrediKartlari().size();i++){
                    System.out.println(musteri1.getKrediKartlari().get(i).toString());
                }
                
                //S??n??flara ait diger metodlari denedim.
                System.out.println("");
                musteri1.hesapSil(hesap2);
                hesap1.paraTransferi(hesap1, hesap2, hesap2.getBakiye());
                musteri1.hesapSil(hesap2);
                
                System.out.println("");
                
                musteri1.krediKartiSil(krediKarti1);
                hesap1.krediKartiBorcOdeme(krediKarti1, krediKarti1.getGuncelBorc());
                musteri1.krediKartiSil(krediKarti1);
                
                //Metodlari kullandiktan sonra kontrol icin hesap ve kart bilgilerini tekrardan ekrana yazdirdim.
                System.out.println("\nHesap Bilgileri:");
                for(int i=0;i<musteri1.getHesaplar().size();i++){
                    System.out.println(musteri1.getHesaplar().get(i).toString());
                }
                System.out.println("\nKart Bilgileri:");
                for(int i=0;i<musteri1.getKrediKartlari().size();i++){
                    System.out.println(musteri1.getKrediKartlari().get(i).toString());
                }
                
                System.out.println("");
                hesap3.paraEkle(500);
                hesap3.paraCek(450);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

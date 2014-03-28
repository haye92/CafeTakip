/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.JOptionPane;
import model.bilgisayar.Bilgisayar;

/**
 *
 * @author yetishbey
 */
public class MasaKapatV extends javax.swing.JFrame {

    /**
     * Creates new form MasaKapatPanel
     */
    public MasaKapatV() {
        initComponents();
    }
    
    public MasaKapatV(Bilgisayar b) {
        initComponents();
        lblMasaAdi.setText(b.getMasaAdi());
        lblAcilisZamani.setText(b.getAcilisSaati().toLocaleString());
        lblGecenSure.setText(Long.toString(b.gecenDakikaHesapla())+" dk");
        if(b.getMusteri()!=null)
            lblMusteri.setText(b.getMusteri().getAd());
        lblTarife.setText("Normal");
        lblKullanimTutari.setText(Float.toString(b.kullanimTutariHesapla())+" TL");
        lblAdisyonTutari.setText(Float.toString(b.adisyonTutariHesapla())+" TL");
        lblToplamTutar.setText(Float.toString(b.kullanimTutariHesapla() + b.adisyonTutariHesapla())+" TL");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMasaAdi = new javax.swing.JLabel();
        pnlIslemler = new javax.swing.JPanel();
        btnMasaAktar = new javax.swing.JButton();
        btnAdisyonEkle = new javax.swing.JButton();
        btnIndırımUygula = new javax.swing.JButton();
        pnlMasaKapat = new javax.swing.JPanel();
        btnMasaKapat = new javax.swing.JButton();
        btnKismenOdendi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMusteri = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblKullanimTutari = new javax.swing.JLabel();
        lblAdisyonTutari = new javax.swing.JLabel();
        lblToplamTutar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGecenSure = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAcilisZamani = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTarife = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Masa Kapat");

        lblMasaAdi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMasaAdi.setText("Masa Adı");

        pnlIslemler.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İşlemler", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnMasaAktar.setText("Masa Aktar");
        btnMasaAktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasaAktarActionPerformed(evt);
            }
        });

        btnAdisyonEkle.setText("Adisyonlar");
        btnAdisyonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdisyonEkleActionPerformed(evt);
            }
        });

        btnIndırımUygula.setText("İndirim uygula");
        btnIndırımUygula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndırımUygulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIslemlerLayout = new javax.swing.GroupLayout(pnlIslemler);
        pnlIslemler.setLayout(pnlIslemlerLayout);
        pnlIslemlerLayout.setHorizontalGroup(
            pnlIslemlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIslemlerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdisyonEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMasaAktar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIndırımUygula)
                .addGap(21, 21, 21))
        );
        pnlIslemlerLayout.setVerticalGroup(
            pnlIslemlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIslemlerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIslemlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdisyonEkle)
                    .addComponent(btnMasaAktar)
                    .addComponent(btnIndırımUygula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMasaKapat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masa Kapat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnMasaKapat.setText("Tamamen Ödendi");
        btnMasaKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasaKapatActionPerformed(evt);
            }
        });

        btnKismenOdendi.setText("Kısmen Ödendi");

        javax.swing.GroupLayout pnlMasaKapatLayout = new javax.swing.GroupLayout(pnlMasaKapat);
        pnlMasaKapat.setLayout(pnlMasaKapatLayout);
        pnlMasaKapatLayout.setHorizontalGroup(
            pnlMasaKapatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMasaKapatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKismenOdendi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMasaKapat)
                .addContainerGap())
        );
        pnlMasaKapatLayout.setVerticalGroup(
            pnlMasaKapatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMasaKapatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMasaKapatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasaKapat)
                    .addComponent(btnKismenOdendi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Toplam Tutar :");

        jLabel6.setText("Adisyon Tutarı :");

        lblMusteri.setText("Kayıtlı Değil");

        jLabel2.setText("Geçen Süre :");

        lblKullanimTutari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKullanimTutari.setText("Kullanım Tutarı :");

        lblAdisyonTutari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdisyonTutari.setText("Adisyon Tutarı :");

        lblToplamTutar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblToplamTutar.setForeground(new java.awt.Color(204, 51, 0));
        lblToplamTutar.setText("Toplam Tutar :");

        jLabel5.setText("Kullanım Tutarı :");

        lblGecenSure.setText("Geçen Süre :");

        jLabel4.setText("Müşteri :");

        lblAcilisZamani.setText("Açılış Zamanı :");
        lblAcilisZamani.setName(""); // NOI18N

        jLabel3.setText("Tarife :");

        lblTarife.setText("Normal");

        jLabel1.setText("Açılış Zamanı :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblMasaAdi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAdisyonTutari)
                                .addComponent(lblMusteri)
                                .addComponent(lblToplamTutar)
                                .addComponent(lblGecenSure)
                                .addComponent(lblTarife)
                                .addComponent(lblAcilisZamani)
                                .addComponent(lblKullanimTutari))
                            .addGap(140, 140, 140))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pnlIslemler, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(pnlMasaKapat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMasaAdi)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcilisZamani)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGecenSure)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarife, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMusteri)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullanimTutari)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdisyonTutari)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblToplamTutar)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addComponent(pnlIslemler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(pnlMasaKapat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasaKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasaKapatActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Masa Kapatılacak ?")==0){
            if(mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaKapat(lblMasaAdi.getText())){
                mutlakkafe.MutlakKafe.mainCont.getCalisanCont().ana.masalarV1.
                        durumDegis(lblMasaAdi.getText(), MasalarV.Durum.KAPALI);
                
                mutlakkafe.MutlakKafe.mainCont.getCalisanCont().ana.masaBilgisiV1.init(
                        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaBul(lblMasaAdi.getText()));
                
                this.hide();
            }
        }
    }//GEN-LAST:event_btnMasaKapatActionPerformed

    private void btnMasaAktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasaAktarActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getCalisanCont().ana.masalarV1.masaAktar();
    }//GEN-LAST:event_btnMasaAktarActionPerformed

    private void btnAdisyonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdisyonEkleActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().adisyonEkleEkraniGoster(lblMasaAdi.getText());
    }//GEN-LAST:event_btnAdisyonEkleActionPerformed

    private void btnIndırımUygulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndırımUygulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIndırımUygulaActionPerformed

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
            java.util.logging.Logger.getLogger(MasaKapatV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasaKapatV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasaKapatV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasaKapatV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasaKapatV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdisyonEkle;
    private javax.swing.JButton btnIndırımUygula;
    private javax.swing.JButton btnKismenOdendi;
    private javax.swing.JButton btnMasaAktar;
    private javax.swing.JButton btnMasaKapat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAcilisZamani;
    private javax.swing.JLabel lblAdisyonTutari;
    private javax.swing.JLabel lblGecenSure;
    private javax.swing.JLabel lblKullanimTutari;
    private javax.swing.JLabel lblMasaAdi;
    private javax.swing.JLabel lblMusteri;
    private javax.swing.JLabel lblTarife;
    private javax.swing.JLabel lblToplamTutar;
    private javax.swing.JPanel pnlIslemler;
    private javax.swing.JPanel pnlMasaKapat;
    // End of variables declaration//GEN-END:variables
}

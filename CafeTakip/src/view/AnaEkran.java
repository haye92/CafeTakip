/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author yetishbey
 */
public class AnaEkran extends javax.swing.JFrame {

    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
        initComponents();
        String masaAdlari[] = {"Masa 1", "Masa 2", "Masa 3", "Masa 4", "Masa 5","Masa 6"};
//he yok build yapmak gerk bunları :D anahtar da ondanmış
        masalar1.init(masaAdlari);
        masalar1.masaEkle("Masa X");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        siraPanel1 = new view.SiraPanel();
        masalar1 = new view.Masalar();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDosya = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuRapor = new javax.swing.JMenu();
        menuGorunum = new javax.swing.JMenu();
        menuAraclar = new javax.swing.JMenu();
        menuYardim = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addTab("tab2", siraPanel1);

        javax.swing.GroupLayout masalar1Layout = new javax.swing.GroupLayout(masalar1);
        masalar1.setLayout(masalar1Layout);
        masalar1Layout.setHorizontalGroup(
            masalar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        masalar1Layout.setVerticalGroup(
            masalar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", masalar1);

        menuDosya.setText("Dosya");

        jMenu4.setText("jMenu4");
        menuDosya.add(jMenu4);

        jMenuBar1.add(menuDosya);

        menuRapor.setText("Rapor");
        jMenuBar1.add(menuRapor);

        menuGorunum.setText("Görünüm");
        jMenuBar1.add(menuGorunum);

        menuAraclar.setText("Araçlar");
        jMenuBar1.add(menuAraclar);

        menuYardim.setText("Yardım");
        jMenuBar1.add(menuYardim);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private view.Masalar masalar1;
    private javax.swing.JMenu menuAraclar;
    private javax.swing.JMenu menuDosya;
    private javax.swing.JMenu menuGorunum;
    private javax.swing.JMenu menuRapor;
    private javax.swing.JMenu menuYardim;
    private view.SiraPanel siraPanel1;
    // End of variables declaration//GEN-END:variables
}


package controller.kisi;

import model.kisi.Calisan;
import model.kisi.Kisi;

import javax.swing.JOptionPane;

import view.AnaEkran;

/**
 *
 * @author MustafaS
 */
public class CalisanC implements KisiI{
    private Calisan kullanici;
    public static AnaEkran ana;
    
    @SuppressWarnings("deprecation")
    @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
         if (!kullaniciAdi.isEmpty() && !sifre.isEmpty()) {
             kullanici = new Calisan();
             if (kullanici.girisYap(kullaniciAdi, sifre)) {
                 kullanici.bilgileriGetir(kullaniciAdi);
                 ana = new AnaEkran();
                 ana.show();
                 return true;
             }
              JOptionPane.showMessageDialog(null, "Yanlıs kullanıcı adı sifre",
                        "Hata", JOptionPane.ERROR_MESSAGE);
         }
         else 
             JOptionPane.showMessageDialog(null, "Lütfen alanları doldurunuz.",
                        "Hata", JOptionPane.ERROR_MESSAGE);
         return false;
        
    }

    @Override
    public Kisi bilgileriGetir(String kullaniciAdi) {
        return null;
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
    }

    public Calisan getKullanici() {
        return kullanici;
    }

    public void setKullanici(Calisan kullanici) {
        this.kullanici = kullanici;
    }

    @Override
    public void kisiEkle(Kisi k) {
        
        
    }
    
}

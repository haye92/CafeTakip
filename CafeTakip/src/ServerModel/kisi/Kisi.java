
package ServerModel.kisi;

import controller.KisiInterface;

/**
 *
 * @author MustafaS
 */
public class Kisi implements KisiInterface{
    private int kisiId;
    private String ad;
    private String soyad;
    private int telefon;
    private String kullaniciAdi;
    private String sifre;

    @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
        return true;
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
}

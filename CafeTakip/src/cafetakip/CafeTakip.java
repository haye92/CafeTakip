package cafetakip;

import controller.MainC;
import view.GirisV;



public class CafeTakip {
    
    public static MainC mainCont;
    public static void main(String[] args) {
        mainCont = new MainC();

        GirisV g = new GirisV();
        g.show();
    }
    
}

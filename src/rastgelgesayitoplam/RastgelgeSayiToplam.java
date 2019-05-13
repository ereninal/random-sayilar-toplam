/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rastgelgesayitoplam;

import java.util.Random;

/**
 *
 * @author Eren
 */
public class RastgelgeSayiToplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uretilenSayi,hedef=1,toplam=0;
        System.out.println("100-500 arası 11e bölünen rastgele sayılar");
        Random r = new Random();
        do {
            uretilenSayi = r.nextInt(400)+100;
            if(uretilenSayi %11 ==0){
                System.out.println(hedef+". üretilen ve 11e bölünen sayi: "+uretilenSayi);
                toplam+=uretilenSayi;
                hedef++;
            }
        } while (hedef !=16);
        System.out.println("Sayıların Toplamı : "+toplam);
        
        
    }
    
}

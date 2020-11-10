package soru1;

public class AritmetikOrtalama {

    public static void main(String[] args) {
        double ortalama = 0;
        int toplam = 0;
        int adet = 0;
        for (int i = 0; i < 200; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 53 == 0) {
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam / adet;
        System.out.println("Sayıların aritmetik ortalaması: " + ortalama);
    }
}

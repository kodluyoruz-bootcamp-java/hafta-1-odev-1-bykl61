package soru4;

import java.util.Scanner;

public class SayıYuvarlama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            float round = 0;
            System.out.println("Yuvarlamak istediğiniz sayıyı giriniz..");
            float number = input.nextFloat();
            System.out.println("Sayıyı aşağı yuvarlamak istiyorsanız 0, yukarı yuvarlamak istiyorsanız 1 yazınız.");
            byte control = input.nextByte();
            if (control == 1) {
                round = (float) Math.ceil(number);
            } else if (control == 0) {
                round = (float) Math.floor(number);
            } else {
                System.out.println("Hatalı seçim!");
            }
            System.out.println("Girdiğiniz sayı: " + number);
            System.out.println("Yuvarlanan sayını yeni değeri: " + round);

            System.out.println("Devam etmek istiyor musunuz y,çıkış yapmak için herhangi bir tuşa basınız");
            String exit = input.next();
            if (!exit.equals("y")){
                break;
            }

        }
        System.out.println("Başarıyla çıkış yaptınız");
    }
}

import java.util.Scanner;

public class Sinif_Gecme_Durumunu_Hesaplayan_Program {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int mat, fizik, turkce, kimya, muzik,toplam=0, dersSayisi=0 ;

            System.out.println("Matematik sınav notunuzu giriniz: ");
            mat=input.nextInt();

            System.out.println("Fizik sınav notunuzu giriniz: ");
            fizik=input.nextInt();

            System.out.println("Türkçe sınav notunuzu giriniz: ");
            turkce=input.nextInt();

            System.out.println("Kimya sınav notunuzu giriniz: ");
            kimya=input.nextInt();

            System.out.println("Müzik sınav notunuzu giriniz: ");
            muzik=input.nextInt();

            if(mat>=0 && mat<=100){
                toplam += mat;
                dersSayisi++;
            }

            if(fizik>=0 && fizik<=100){
                toplam += fizik;
                dersSayisi++;
            }

            if(turkce>=0 && turkce<=100){
                toplam += turkce;
                dersSayisi++;
            }

            if(kimya>=0 && kimya <=100){
                toplam += kimya;
                dersSayisi++;
            }

            if(muzik>=0 && muzik<=100){
                toplam += muzik;
                dersSayisi++;
            }

            double ortalama = toplam/dersSayisi;

            if (ortalama < 55){
                System.out.println("Sınıfta kaldınız!");
            }
            else{
                System.out.println("Tebrikler sınıfı geçtiniz.");
            }

            System.out.println("Ortalamanız: " + ortalama);
        }
}


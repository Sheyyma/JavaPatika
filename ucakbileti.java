import java.sql.SQLOutput;
import java.util.Scanner;
public class ucakbileti {
    public static void main(String[] args) {
        int yas,tip;
        double ucret,ucret2,mesafe,bilet;
        double perkm= 0.10 ;
        Scanner input= new Scanner(System.in);

        System.out.print("Kaç km gidiceksiniz:");
        mesafe= input.nextDouble();

        System.out.print("Kaç yaşındasınız:");
        yas= input.nextInt();

        System.out.print("Yolculuk tipi tekyon(1), gidiş-dönüş(2):");
        tip= input.nextInt();

        switch (tip){
            case 1:
             ucret= mesafe*perkm;
                if (yas<12){
                    System.out.print(ucret/2);
                } else if  ((yas > 12 && (yas < 24))){
                    System.out.print(ucret - (ucret * 10 / 100));
                } else if ((yas>65)) {
                    System.out.print(ucret - (ucret * 30 / 100));
                } else{
                    System.out.print(ucret);
                }
                break;

            case 2:
                ucret=((mesafe*perkm)*2)-((mesafe*perkm)*2) *20/100;
                if (yas<12){
                    System.out.print(ucret/2);
                } else if  ((yas > 12 && (yas < 24))){
                    System.out.print(ucret - (ucret * 10 / 100));
                } else if ((yas>65)) {
                    System.out.print(ucret - (ucret * 30 / 100));
                } else{
                    System.out.print(ucret);
                }
                break;

            default:
                System.out.print("hatalı giriş yaptınız tekrar deneyin.");
        }




    }
}


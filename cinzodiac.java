import java.util.Scanner;
public class cinzodiac {
    public static void main(String[] args){
        int dogumyili,burc;

        Scanner input= new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        dogumyili= input.nextInt();

        burc= dogumyili%12;

        if (burc == 0) {
            System.out.print("Çin Zodiyağınız:Maymun");
        }else if (burc==1){
            System.out.print("Çin Zodiyağınız:Horoz");
        }else if (burc==2){
            System.out.print("Çin Zodiyağınız:Köpek");
        }else if (burc==3){
            System.out.print("Çin Zodiyağınız:Domuz");
        }else if (burc==4){
            System.out.print("Çin Zodiyağınız:Fare");
        }else if (burc==5){
            System.out.print("Çin Zodiyağınız:Öküz");
        }else if (burc==6){
            System.out.print("Çin Zodiyağınız:Kaplan");
        }else if (burc==7){
            System.out.print("Çin Zodiyağınız:Tavşan");
        }else if (burc==8){
            System.out.print("Çin Zodiyağınız:Ejderha");
        }else if (burc==9){
            System.out.print("Çin Zodiyağınız:Yılan");
        }else if (burc==10){
            System.out.print("Çin Zodiyağınız:At");
        }else if (burc==11){
            System.out.print("Çin Zodiyağınız:Koyun");
        }else{
            System.out.println("hatalı tuşlama tekrar deneyiniz");
        }


    }
}

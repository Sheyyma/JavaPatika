import java.util.Scanner;
public class ciftvedortkati {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner input= new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz:");
            sayi= input.nextInt();
            if  (sayi%4==0){
                toplam+= sayi;
            }

        }while (sayi%2==0);
        System.out.print(toplam);

    }
}

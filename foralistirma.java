import java.util.Scanner;
public class foralistirma {
    public static void main(String[] args) {
        int sayi;
        Scanner input= new Scanner(System.in);

        for (boolean run =true; run;){
            System.out.print("Bir sayı giriniz:");
            sayi= input.nextInt();
            if (sayi<0){
                run= false;
            }
        }

    }
}

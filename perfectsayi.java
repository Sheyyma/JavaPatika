import java.util.Scanner;
public class perfectsayi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi;
        System.out.print("bir sayı  giriniz:");
        sayi= input.nextInt();

        int total=0;
        for( int i=1; i<sayi; i++){
            if ( sayi%i==0){
                total+=i;
            }}
            if (total==sayi){
                System.out.println("mükemmel sayıdır");
            }else{
                System.out.println("mükemmel sayı değildir");
            }

    }
}

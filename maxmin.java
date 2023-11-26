import java.util.Scanner;
public class maxmin {

    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            int n, max,min, sayi;
            System.out.print("kaç sayı gireceksiniz:");
            n= input.nextInt();
            max= 0;
            min=0;

            for ( int i=1; i<=n ; i++){
                System.out.print(i+ ". sayıyı giriniz:");
                sayi= input.nextInt();

                if (sayi>max){
                    max=sayi;
                }

                    if ((sayi < min) || (min==0)) {
                    min=sayi;

                }}
        System.out.println("max değeri:"+max);
        System.out.println("min değeri:"+min);

        }}

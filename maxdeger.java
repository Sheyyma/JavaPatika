import java.util.Scanner;
public class maxdeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, max, min, sayi;
        System.out.print("kaç sayı gireceksiniz:");
        n = input.nextInt();
        max = 0;
        min = 0;

        for (int i=0; i<= n; i++) {
            System.out.print("sayı giriniz:");
            sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
                System.out.println("max değeri:" + max);
                if ((sayi < min) || (min == 0)) {
                    sayi = min;
                    System.out.println("min değeri:" + min);
                }
            }


        }
    }}

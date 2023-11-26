import java.util.Scanner;
public class vücutkitle {
    public static void main(String[] args) {
        int kilo;
        double boy;
        double vki;
        Scanner input= new Scanner(System.in);
        System.out.print("m cinsinden boyunuzu giriniz:");
        boy = input.nextDouble();
        System.out.print("kg cinsinden kilonuzu giyiniz:");
        kilo = input.nextInt();
        vki= (double) kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz:"+ vki);


    }
}

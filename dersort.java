import java.util.Scanner;

public class dersort {
    public static void main(String[] args) {

        int matematik,fizik,turkce,fen;
        Scanner inp= new Scanner(System.in);

        System.out.print("matematik notunu giriniz:");
        matematik= inp.nextInt();
        System.out.println(matematik);

        System.out.print("fizik notunuzu giriniz:");
        fizik= inp.nextInt();
        System.out.println(fizik);

        System.out.print("türkçe notunu giriniz:");
        turkce= inp.nextInt();
        System.out.println(turkce);

        System.out.print("fen notunu giriniz:");
        fen= inp.nextInt();
        System.out.println(fen);

        double toplam= (double)(matematik+fizik+fen+turkce)/(double)4;
        System.out.println("ortalamanız:"+toplam);


    }
}

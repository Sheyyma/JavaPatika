import java.util.Scanner;
public class dersgecme {
    public static void main(String[] args) {
        int mat, fzk, trk,tarih;
        double ort;

        Scanner input= new Scanner(System.in);
        System.out.print("matematik notunu giriniz:");
        mat= input.nextInt();
        System.out.print("fizik notunu giriniz:");
        fzk= input.nextInt();
        System.out.print("türkçe notunu giriniz:");
        trk= input.nextInt();
        System.out.print("tarih notunu giriniz:");
        tarih= input.nextInt();
        ort= (double) (mat+fzk+trk+tarih)/4;

        if (ort<55){
            System.out.println("kaldınız");
        }else{
            System.out.println("geçtiniz");
        }
        System.out.println("ortalamanız:" + ort);
}}

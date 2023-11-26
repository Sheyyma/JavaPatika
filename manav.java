import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double aper=2.14, eper=3.67, dper=1.11, mper=0.95, pper=5.0, total;
        Scanner input= new Scanner(System.in);
        System.out.print("Armutun kilosunu giriniz:");
        armut= input.nextInt();
        System.out.print("Elmanın kilosunu giriniz:");
        elma= input.nextInt();
        System.out.print("Domatesin kilosunu giriniz:");
        domates= input.nextInt();
        System.out.print("Muzun kilosunu giriniz:");
        muz= input.nextInt();
        System.out.print("Patlıcanın kilosunu giriniz:");
        patlican= input.nextInt();
        total=(armut*aper + elma*eper + domates*dper + muz*mper + patlican*pper);
        System.out.println("Toplam tutar:" +total+ "TL");







    }
}

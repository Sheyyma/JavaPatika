import java.util.Scanner;
public class daireçevre {
    public static void main(String[] args) {
        int yaricap;
        double alan, cevre, pi=3.14;
        Scanner input= new Scanner(System.in);
        System.out.print("yarıçapı giriniz:");
        yaricap= input.nextInt();
        cevre = 2 * yaricap * pi;
        alan= pi * yaricap*yaricap;
        System.out.println("dairenin çevresi:"+cevre);
        System.out.println("dairenin alanı:"+ alan);





    }
}

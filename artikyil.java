import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        int artikyil;
        Scanner input= new Scanner(System.in);
        System.out.print("Bir yıl giriniz:");
        artikyil= input.nextInt();

        if (artikyil%4==0) {
            System.out.print(artikyil + " Bir Artık Yıldır");
        }else if ((artikyil%100==0) && (artikyil%400==0)){
            System.out.print(artikyil + " Bir Artık Yıldır");
        }else{
            System.out.print(artikyil+ " Bir Artık Yıl Değildir");





    }
}}

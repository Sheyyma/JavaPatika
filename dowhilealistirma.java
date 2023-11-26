import java.util.Scanner;
public class dowhilealistirma {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi;
                do{
                    System.out.print("bir sayı giriniz:");
                    sayi= input.nextInt();
                }while(sayi>0);

    }
}

import java.util.Scanner;
public class faktoryelhesap {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        n= input.nextInt();
        int total=1;

        for (int i = 1; i<=n; i++){
            total=total*i;
        }
        System.out.println(total);
    }
}

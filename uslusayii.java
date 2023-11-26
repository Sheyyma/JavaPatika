import java.util.Scanner;
public class uslusayii {
    public static void main(String[] args) {
        int n,k;
        Scanner input= new Scanner(System.in);
        System.out.print("Taban için sayı giriniz:");
        n= input.nextInt();
        System.out.print("Üs için sayı giriniz:");
        k= input.nextInt();

        int total=1;

        int i=1;
        while (i<=k){
            total*=n;
            i++;

        }
        System.out.println(total);


    }
}

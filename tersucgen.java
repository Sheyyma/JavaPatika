import java.util.Scanner;
public class tersucgen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        System.out.print("kaç satır olacağını giriniz:");
        n= input.nextInt();

        for ( int i =n; i>=n; i++){
            for (int j=0; j<=(n-1); j++) {
                System.out.println(" ");}

                for (int k = 0; k <=(2*i - 1); k++)
                    System.out.print("*");
                }}



    }

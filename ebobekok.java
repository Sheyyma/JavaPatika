import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int n1,n2,ebok,ekok;
        System.out.print("bir sayı giriniz");
        n1= input.nextInt();
        System.out.print("bir sayı giriniz");
        n2= input.nextInt();

        for(int i=2;(i<=n1) && (i<=n2); i++){
            if ((n1%i==0) && (n2%i==0)){
                System.out.println("ebob:"+i);
            }
        }


                }
            }







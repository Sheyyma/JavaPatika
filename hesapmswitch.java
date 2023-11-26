import java.util.Scanner;
public class hesapmswitch {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input= new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz:");
        n1= input.nextInt();

        System.out.print("ikinci sayıyıı giriniz:");
        n2= input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçiminiz:");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
                 case 2:
                    System.out.println(n1-n2);
                    break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("hatalı giriş yaptınız tekrar deneyin.");


        }



    }

}

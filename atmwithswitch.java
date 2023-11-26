import java.sql.SQLOutput;
import java.util.Scanner;
public class atmwithswitch {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String username, password;
        int select, price,right=3;
        int balance=1500;

        while(right>0){
        System.out.print("kullanıcı adı giriniz:");
        username= input.nextLine();
        System.out.print("şifre giriniz:");
        password= input.nextLine();

        if((username.equals("şeyma")) && (password.equals("ş123"))){
            System.out.println("giriş başarılı");
            System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
            System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
            select = input.nextInt();

            switch (select){

                case 1:
                    System.out.print("yatırılacak tutarı giriniz:");
                    price = input.nextInt();
                    balance+=price;
                    System.out.println("bakiye:"+balance);
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                    select = input.nextInt();
                case 2:
                    System.out.print("çekilecek tutarı giriniz:");
                    price= input.nextInt();
                    balance-=price;
                    System.out.println("bakiye:"+balance);
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                    select = input.nextInt();
                case 3:
                    System.out.println("bakiyeniz:"+balance);
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                    select = input.nextInt();

                case 4:
                    System.out.println("çıkış yaptınız");
                default:
                    System.out.println("hatalı tuşlama tekrar deneyin");
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                    select = input.nextInt();
                    
            }

            break;
        }else{
            System.out.println("giriş başarısız kalan hakkınız: "+(right-1));
            right--;
            if (right==0){
                System.out.print("bloke oldu banka ile iletişime geçiniz");
            }

        }


        }






    }}

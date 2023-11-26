import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String username, password;
        int right=3;
        int select;
        int balance=1500;
        int price;

         while(right>0){
        System.out.print("kullanıcı adını giriniz:");
        username= input.nextLine();
        System.out.print("şifrenizi giriniz:");
        password= input.nextLine();

        if ((username.equals("şeyma"))  &&  (password.equals("ş123"))){
                 System.out.print("merhaba bankamıza hoş geldiniz");

                 do {
                     System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                     System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                     select = input.nextInt();

                     if (select == 1) {
                         System.out.print("yatırmak istediğiniz miktarı giriniz");
                         price = input.nextInt();
                        balance+=price;
                         System.out.println("bakiye:"+balance);

                     } else if (select == 2) {
                         System.out.print("para miktarı:");
                         price = input.nextInt();
                         if (price > balance) {
                             System.out.println("bakiye yetersiz");
                         } else {
                             balance = balance - price;
                             System.out.println("işlem başarılı bakiye:" + balance);
                         }
                     } else if (select == 3) {
                         System.out.println("bakiyeniz:" + balance);
                     }
                 } while (select != 4);
                 System.out.println("tekrar görüşmek üzere");
                 break;
            }else{
            right--;
                 System.out.println("hatalı kullanıcı adı ya da şifre. tekrar deneyiniz");
                 if(right==0){
                     System.out.print("hesabınız bloke olmuştur banka ile iletişime geçiniz");
                 }else {
                     System.out.println("kalan hakkınız:"+right);
                 }


    }
}}}

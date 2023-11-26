import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {

        String password, username;
        Scanner input= new Scanner(System.in);

        System.out.print("kullanıcı adı giriniz:");
        username=input.nextLine();

        System.out.print("Şifre giriniz:");
        password=input.nextLine();

        if(username.equals("şeyma") && password.equals("ş123")){
            System.out.println("giriş başarılı");
        }else{
            System.out.println("giriş yapamadınız tekrar deneyin");
        }
    }
}

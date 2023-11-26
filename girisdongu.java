import java.util.Scanner;
public class girisdongu {
    public static void main(String[] args) {
      int password;
      boolean isPasworldSuccess= false;

      Scanner input= new Scanner(System.in);

      while(!isPasworldSuccess){
        System.out.print("Bir şifre giriniz: ");
        password= input.nextInt();

        if (password==123){
            System.out.print("doğru şifre");
            isPasworldSuccess=true;
        }else{
            System.out.print("yanlış şifre tekrar deneyiniz");
        }}






    }
}

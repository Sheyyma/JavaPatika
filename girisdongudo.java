import java.util.Scanner;
public class girisdongudo {
    public static void main(String[] args) {
        int pass;
        boolean isPass = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Şifre giriniz: ");
            pass = input.nextInt();
            if (pass==123){
                System.out.println("Doğru");
              isPass= false;
            }else{
                System.out.println("Yanlış");
            }
        } while(isPass);


    }}
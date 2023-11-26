import java.util.Scanner;
public class havasicak {
    public static void main(String[] args) {
        int heat;
        Scanner input= new Scanner(System.in);
        System.out.print("hava sıcaklığını giriniz:");
        heat= input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsin");
        } else if (heat<=25) {
            if (heat<15){
            System.out.println("sinemaya gidebilirsin");
            }
            if (heat>=10){
                System.out.println("pikniğe gidebilirsin");
            } else{
                System.out.println("yüzmeye gidebilirsin");
            }
    }
}}

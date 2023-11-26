import java.util.Scanner;

public class burcbulma {
    public static void main(String[] args) {
        int month,day;
        Scanner input= new Scanner(System.in);
        System.out.print("Doğduğunuz ay:");
        month= input.nextInt();

        System.out.print("Doğduğunuz gün:");
        day= input.nextInt();

        switch (month){
            case 1:
                if ((day<22)&& (day>0)) {
                    System.out.println("oğlak burcu");
                } else if (day<32) {
                    System.out.println("kova burcu");
                } else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 2:
                if ((day<20) && (day>0)){
                    System.out.println("kova burcu");
                } else if (day<30) {
                    System.out.println("balık burcu");
                } else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 3:
                if ((day<21)&& (day>0)){
                    System.out.println("balık burcu");
                }else if (day<32){
                    System.out.println("koç burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 4:
                if((day<21)&& (day>0)){
                    System.out.println("koç burcu");
                }else if (day<31){
                    System.out.println("boğa burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 5:
                if((day<22)&& (day>0)){
                    System.out.println("boğa burcu");
                }else if (day<32){
                    System.out.println("ikizler burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 6:
                if((day<23)&&(day>0)){
                    System.out.println("ikizler burcu");
                }else if (day<31){
                    System.out.println("yengeç burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 7:
                if((day<23)&&(day>0)){
                    System.out.println("yengeç burcu");
                }else if (day<32){
                    System.out.println("aslan burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 8:
                if((day<23)&&(day>0)){
                    System.out.println("aslan burcu");
                }else if (day<31){
                    System.out.println("başak burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }

            case 9:
                if((day<23)&&(day>0)){
                    System.out.println("başak burcu");
                }else if (day<32) {
                    System.out.println("terazi burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;

            case 10:
                if((day<23)&&(day>0)){
                    System.out.println("terazi burcu");
                }else if (day<31){
                    System.out.println("akrep burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;


            case 11:
                if((day<22)&&(day>0)){
                    System.out.println("akrep burcu");
                }else if (day<32){
                    System.out.println("yay burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;


            case 12:
                if((day<22)&&(day>0)){
                    System.out.println("yay burcu");
                }else if (day<31){
                    System.out.println("oğlak burcu");
                }else{
                    System.out.println("hatalı tuşlama tekrar deneyiniz");
                }
                break;


            default:
                System.out.println("yanlış bir sayı girdiniz tekrar deneyin.");



    }
}}

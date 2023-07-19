import java.util.Scanner;
public class VeriableTypes2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1'den 7'ye kadar bir rakam giriniz: ");
        int number = input.nextInt();
        /*if (number == 1) {
            System.out.println("Pazartesi");
        }
        else if (number == 2) {
            System.out.println("Salı");
        }
        else if (number == 3) {
            System.out.println("Çarşamba");
        }
        else if (number == 4) {
            System.out.println("Perşembe");
        }
        else if (number == 5) {
            System.out.println("Cuma");
        }
        else if (number == 6) {
            System.out.println("Cumaertesi");
        }
        else if (number == 7) {
            System.out.println("Pazar");
        }
        else {
            System.out.println("Hatalı girdi.");
        }*/
        switch (number){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumaertesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı girdi!");
                break;
        }

    }
}




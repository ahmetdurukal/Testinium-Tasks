import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        int note_1 = number.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        int note_2 = number.nextInt();

        System.out.println("Vize notunuz: " + note_1);
        System.out.println("Final notunuz: " + note_2);
        double lastNote = (note_1 * 0.4) + (note_2 * 0.6);
        System.out.println("GEnel Notunuz: " + lastNote);
        if (lastNote < 49) {
            System.out.println("FF --> Dersten kaldınız.");
        } else if (50 <= lastNote & lastNote < 60) {
            System.out.println("DD");
        } else if (lastNote >= 60 & lastNote < 70) {
            System.out.println("CC");

        } else if (70 <= lastNote & lastNote < 80) {

            System.out.println("BB");

        } else if (80 <= lastNote & lastNote < 90) {

            System.out.println("BA");

        } else if (90 <= lastNote & lastNote <= 100) {

            System.out.println("AA");

        } else {
            System.out.println("Geçerli bir not giriniz");
        }
    }
}


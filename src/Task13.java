public class Task13 {
    public static void main(String[] args) {
        int sayi1=1;
        int sayi2=2;
        sayi1=sayi2;
        sayi2=10;
        System.out.println(sayi1);

        System.out.println("----------------");

        int[] sayilar1 =new int[]{1,2,3};
        int[] sayilar2 =new int[]{10,20,30};
        sayilar1=sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);


    }
}

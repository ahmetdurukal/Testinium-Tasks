public class UsageSplit {
    public static void main(String[] args) {
        String sentence = "Ahmet,Mehmet,Faruk,Yavuz iyi insanlardır.";
        String[] array = sentence.split(",");
        for (String a : array) {
            System.out.println(a);
        }
        System.out.println("Array boyutu: " + array.length);
    }

}

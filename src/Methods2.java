public class Methods2 {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMesage= getCities();
        int number = collection(5,7);
        System.out.println(message);
        System.out.println(newMesage);
        System.out.println(number);
    }
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void remove(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }
    public static int collection (int number1,int number2){
        return number2+number1;
    }
    public static String getCities() {
    return "Ankara";
    }
}

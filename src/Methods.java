public class Methods {
    public static void main(String[] args) {
        findNumber();
    }
    public static void findNumber(){
        int[] numbers = new int[] {1,2,3,4,5,7,9,0};
        int wanted = 5;
        boolean isThere = false;

        for (int number : numbers){
            if (number == wanted){
                isThere =true;
                break;
            }
        }
        String message;
        if (isThere){
            message="Sayı mevcuttur: "+ wanted;
            sendMessage(message);
        }else {
            sendMessage("Sayı mevcut değildir: "+ wanted);
        }
    }
    public static void sendMessage(String message){
        System.out.println(message);
    }
}

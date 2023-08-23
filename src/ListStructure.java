public class ListStructure {
    public static void main(String[] args) {
        int[] numbers = new int[] {10,20,30,40,50,70,90,100};
        findNumber(numbers, 30);
    }
    public static void findNumber(int[] numbers, int wanted){
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

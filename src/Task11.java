import java.util.Arrays;
import java.lang.Integer;
public class Task11 {
    public static void main(String[] args){
        //bir integer listemiz var bunun içerisindeki
        // en büyük sayıyı ve en küçük sayıyı bulalım
        // örnek verirsem 12,231,565,7 burada 565 ve 7 yi nasıl buluruz
        int[] numList = {12,231,565,7};
        System.out.println(Arrays.stream(numList).max());
        System.out.println(Arrays.stream(numList).min());

    }
}

public class VeriableTypes {
    public static void main(String[] args) {
        //Bu task her veri tipinin bir değişken değere atanarak ekrana verilmesi için yazılmıştır.
        //(0)~(255)
        byte testByte = 126;
        //(-32768)~(32767)
        short testShort = 327;
        //(-2.147.483.648) ~ (2.147.483.647)
        int testInt = 1058;
        //10 haneden daha büyük sayılar için kullanılabilir.(Ör: TC No)
        long testLong = 12042;
        //Ondalıklı sayı kullanımında sayı sonuna "f" karakteri konularak kullanılır.
        float testFloat = 42.8f;
        //float gibi ondalıklı sayı kullanımı değişkenidir ama kapsamı çok geniştir.Üst düzey matematiksel işlemlerde kullanılır
        double testDouble = 82345.58;
        //Tek karakteri hafızada tutmak için kullanılır.
        char testChar = 'A';
        //Ya true ya false değeri döndüren veri tipidir.
        boolean testBoolean = false;
        //Yazı içeren veri tipidir.
        String testText = "Merhaba";
        // Ekrana Yazdırma Komutu:
        System.out.println("String Değeri:" + testText + "\nByte Değeri:" + testByte + "\nShort Değeri:"
                + testShort + "\nIntager Değeri:" + testInt + "\nLong Değeri:" + testLong + "\nFloat Değeri:"
                + testFloat + "\nDouble Değeri:" + testDouble + "\nChar Değeri:" + testChar + "\nBoolean Değeri:" + testBoolean);
    }
}

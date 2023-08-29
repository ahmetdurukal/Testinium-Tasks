public class KrediMain {
    public static void main(String[] args) {
        KrediOgretmen krediOgretmen = new KrediOgretmen();
        KrediTarim krediTarim = new KrediTarim();
        krediTarim.hesapla();
        krediOgretmen.hesapla();
        KrediUI krediUI=new KrediUI();
        krediUI.krediHesapla(new KrediBase());
        KrediBase[] krediBase = new KrediBase[]
                {new KrediTarim(),new KrediOgretmen()};
        for(KrediBase krediBase1:krediBase){
            System.out.println(krediBase1.faizHesapla(1000));
        }
    }
}

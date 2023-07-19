public class AnimalMain {
    public static void main(String[] args) {

        AnimalEagle animalEagle = new AnimalEagle("Fly","Meat",2.10
                ,"Kartalların gece görüşü kuvvetlidir"
                ,"Kartallar yağmur yağdığında bulutların üzerine çıkarlar");
        System.out.println(animalEagle.getFly()
                //opinion = görüş
                +" "+animalEagle.getOpinion()
                +" "+animalEagle.getFood()
                +" Boyu: "+animalEagle.getSize()
                +" "+animalEagle.getMovement());


        AnimalLeon animalLeon = new AnimalLeon("Run","Meat",1.2
                ,"Aslanların çok güçlü pençeleri vardır","Aslanlar çok hızlı koşuculardır");
        //claw=pençe
        System.out.println(animalLeon.getClaw()
                +" "+animalLeon.getRun()
                +" "+animalLeon.getFood()
                +" Boyu: "+animalLeon.getSize()
                +" "+animalLeon.getMovement());

        AnimalShark animalShark = new AnimalShark("Swim","Meat",6.1
                ,"Köpek balıkları avlarını parçalarlar","Köpek balıkları çok iyi yüzücülerdir.");
        System.out.println(animalShark.getSwim()
                //shred=parçalama
                +" "+animalShark.getShred()
                +" "+animalShark.getFood()
                +" Boyu: "+animalShark.getSize()
                +" "+animalShark.getMovement());


        AnimalSharkService animalSharkService = new AnimalSharkService(new LogServiceCloud());
        animalSharkService.delSkill(animalShark);

        LogServiceLocal logServiceLocal = new LogServiceLocal();
        logServiceLocal.log();

        LogServiceCloud logServiceCloud = new LogServiceCloud();
        logServiceCloud.log();

        AnimalEagleService animalEagleService = new AnimalEagleService(new LogServiceLocal());
        animalEagleService.addSkill(animalEagle);

    }
}

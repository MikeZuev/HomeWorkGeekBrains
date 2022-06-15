package lesson7;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Garfield");
        Cat cat1 = new Cat("James");
        Cat cat2 = new Cat("Fluffy");
        Plate plate = new Plate(50);
        plate.setFoodCount(5);

        Cat[] cats = new Cat[3];
        cats[0] = cat;
        cats[1] = cat1;
        cats[2] = cat2;

        plate.printInfo();


        while(plate.getFoodCount() > 0){

            for(int i = 0; i < cats.length; i++){
                cats[i].eat(plate);
                Thread.sleep(500);
            }
            plate.printInfo();
        }

        for(int i = 0; i < cats.length; i++){
            System.out.println(cats[i].getName());
            System.out.println(cats[i].getAppetite());
        }
        
    }
}

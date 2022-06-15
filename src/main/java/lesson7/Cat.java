package lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private int maxAppetite = 20;
    private int appetite;


    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {


        int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;
        if(catEatFoodCount >= plate.getFoodCount()){
            catEatFoodCount = plate.getFoodCount();
            plate.decreaseFood(catEatFoodCount);
            System.out.printf("Cat %s ate %d feed", name, catEatFoodCount);
            System.out.println();
            appetite += catEatFoodCount;

        }else {
            plate.decreaseFood(catEatFoodCount);
            System.out.printf("Cat %s ate %d feed", name, catEatFoodCount);
            System.out.println();
            appetite += catEatFoodCount;
        }

    }

    public int getMaxAppetite() {
        return maxAppetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}

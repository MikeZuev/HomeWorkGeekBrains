package lesson7;

public class Plate {

    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        if(foodCount < catEatFoodCount){
            catEatFoodCount = foodCount;
            foodCount -= catEatFoodCount;

        }else {
            foodCount -= catEatFoodCount;
        }

    }

    public void setFoodCount(int foodCount) {
        this.foodCount += foodCount;
    }
}

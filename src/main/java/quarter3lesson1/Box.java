package quarter3lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box <E extends Fruit>{
    private ArrayList<E> box;

    public Box(E... fruits) {
        this.box = new ArrayList<>(List.of(fruits));
    }

    public double getWeight() {
        double sum = 0;
        for (E e : box) {
            sum+=e.getWeight();
        }
        return sum;
    }

    public void add(E fruit) {
        box.add(fruit);
    }

    public void remove(E fruit) {
        box.remove(fruit);
    }

    public boolean compare(Box<?> box) {
        if(this.getWeight() == box.getWeight()) {
            return true;
        }
        else {
            return false;
        }

    }

    public void replaceFruits(Box<E> box, E fruit) {
        box.add(fruit);
        this.box.remove(fruit);

    }







}

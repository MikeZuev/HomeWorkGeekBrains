package quarter3lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main<E> {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(
                new Apple(11),
                new Apple(9),
                new Apple(13),
                new Apple(3)
        );

        Apple apple = new Apple(3);

        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>(
                new Orange(3),
                new Orange(4),
                new Orange(1),
                new Orange(9)
        );

        Orange orange = new Orange(12);
        Orange orange1 = new Orange(7);
        orangeBox.add(orange);
        orangeBox.add(orange1);

        orangeBox.replaceFruits(orangeBox, orange);

        


    }

    private List<E> arrayIntoArray(E[] arr) {
        ArrayList<E> arrList = new ArrayList<>(List.of(arr));
        return arrList;


    }


}

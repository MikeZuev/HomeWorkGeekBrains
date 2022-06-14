package lesson6;

public class Animal {
    private String name;
    private int age;
    private  static int numberOfAnimals;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfAnimals++;
    }

    public  static int getNumberOfAnimals() {
        return numberOfAnimals;
    }


    public void run(int i){

    }
    public void swim(int i){

    }

    public void getInfoRun(String name, int i){
        System.out.printf("%s ran %d", name, i);
        System.out.println();
    }

    public void getInfoSwim(String name, int i){
        System.out.printf("%s swam %d", name, i);
        System.out.println();
    }

    public String getName() {
        return name;
    }


}

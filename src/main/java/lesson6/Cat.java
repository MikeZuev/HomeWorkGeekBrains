package lesson6;

public class Cat extends Animal{

    private static int numberOfCats;


    public Cat(String name, int age) {
        super(name, age);
        numberOfCats++;
    }

    public void run(int i){
        if(i <= 200){
            getInfoRun(getName(), i);
        }
        else{
            System.out.println(getName() + " can't run such a long distance!");
        }

    }

    public void swim(int i){
        System.out.println(getName() + " can't swim!");
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }
}

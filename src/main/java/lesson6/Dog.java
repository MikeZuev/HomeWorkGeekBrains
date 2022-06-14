package lesson6;

public class Dog extends Animal{

    private static int numberOfDogs;


    public Dog(String name, int age) {
        super(name, age);
        numberOfDogs++;
    }




    public void run(int i){
        if(i <= 500){
            getInfoRun(getName(), i);
        }
        else{
            System.out.println(getName() + " can't run such a long distance!");
        }

    }

    public void swim(int i){
        if(i <= 10){
            getInfoSwim(getName(), i);

        }else{
            System.out.println(getName() + " can't swim such a long distance!");
        }

    }

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }
}

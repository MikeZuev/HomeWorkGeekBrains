package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(numbersChecker(3, 11));
        positiveNumber(0);
        stringsCopyMachine("hello my friend", 5);
        System.out.println(leapYearIndicator(504));


    }

    public static boolean numbersChecker(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative numbers");
        }

    }

    public static boolean negativeNumber(int a) {
        if (a < 0) {
            return true;

        } else {
            return false;
        }
    }

    public static void stringsCopyMachine(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean leapYearIndicator(int a) {

        if(a % 400 == 0){
            return true;
        }else if (a % 4 == 0 && a % 100 != 0){
            return true;
        }else{
            return false;
        }
    }
}
package lesson5;

public class Main {


    public static void main(String[] args) {
        Employee person1 = new Employee("John", "CEO", "JohnBest@gmail.com", "777-777", 1000000, 49);
        Employee[] employeeArr = new Employee[5];

        employeeArr[0] = new Employee("John", "CEO", "JohnBest@gmail.com", "777-777", 1000000, 49);
        employeeArr[1] = new Employee("Chuck", "CTO", "ChuckNorris@gamil.chuck", "1", 100000000, 71);
        employeeArr[2] = new Employee("Bob", "Coder", "BobSquarePents@gmail.com", "1000-7", 300000, 49);
        employeeArr[3] = new Employee("Mike", "Seller", "JohnBest@gmail.com", "123-456", 250000, 49);
        employeeArr[4] = new Employee("Elon", "Marketer", "JohnBest@gmail.com", "88-22-33-44", 200000, 49);

        printArray(employeeArr);


    }

    private static void printArray(Employee[] employeeArr) {
        for(int i = 0; i < employeeArr.length; i++){
            employeeArr[i].getInfo();
            System.out.println();
        }
    }
}

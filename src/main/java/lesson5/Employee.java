package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;


    }

    void getInfo() {
        System.out.printf("Имя работника %s, должность: %s, адрес электронной почты: %s, номер телефона: %s, зарплата: %d, возраст: %d ",
                name, position, email, phoneNumber, salary, age);
    }


}

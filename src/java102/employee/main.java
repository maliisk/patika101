package java102.employee;

public class main {

    public static void main(String[] args) {
        Employee Person1 = new Employee("Muhammed",2000,45,2015);
        Employee Person2 = new Employee("Ali",2000,65,2000);
        Person1.print();
        System.out.println();
        Person2.print();
    }

}
package override;
class Employee {
    void calculateSalary() {
        System.out.println("Calculating base salary...");
    }
}

class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Calculating full-time salary with benefits...");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Calculating part-time salary based on hours...");
    }
}

public class Employee_salary {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
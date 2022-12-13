package org.example;

public class Homework02 {

public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Anton Antonov", "Engineer", "aant@opn.ru", "89999999999",12000,62);
        empCorp[1] = new Employee("Boris Yurinov", "Sales Manager", "Boyara@opn.ru", "88888888888",15000,41);
        empCorp[2] = new Employee("Just  Vitaliy", "Real Cake", "Vmustang@opn.com", "87777777777",200000,22);
        empCorp[3] = new Employee("Dmitriy Dmitriev", "Driver", "pupkina@mailbox.com", "86666666666",10000,18);
        empCorp[4] = new Employee("Egor Egorov", "Engineer", "juk@mailbox.com", "85555555555",3000,25);
        for (Employee employee : empCorp)
        if (employee.getAge()>40)
        System.out.println(employee);

        }
        }
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age);
    }

}
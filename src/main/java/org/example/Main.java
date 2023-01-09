package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Anton Antonov", "Engineer", "aant@opn.ru", "89999999999", 12000, 62);
        empCorp[1] = new Employee("Boris Yurinov", "Sales Manager", "Boyara@opn.ru", "88888888888", 15000, 41);
        empCorp[2] = new Employee("Just  Vitaliy", "Real Cake", "Vmustang@opn.com", "87777777777", 200000, 22);
        empCorp[3] = new Employee("Dmitriy Dmitriev", "Driver", "pupkina@mailbox.com", "86666666666", 10000, 18);
        empCorp[4] = new Employee("Egor Egorov", "Engineer", "juk@mailbox.com", "85555555555", 3000, 25);
        for (Employee employee : empCorp)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}
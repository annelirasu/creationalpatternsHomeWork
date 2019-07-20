package design_pattern.structural.composite;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Employee("manager1","dep1", 100);
        Employee manager3 = new Employee("manager3","dep1", 100);
        manager.add(manager3);
        System.out.println(manager);
        Employee emp1 = new Employee("emp1","dep1",99);
        manager.add(emp1);
        System.out.println(manager);
        Employee manager0 = new Employee("manager0","dep0",101);
        manager0.add(manager);
        System.out.println(manager0);


    }
}

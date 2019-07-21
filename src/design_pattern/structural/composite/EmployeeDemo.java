package design_pattern.structural.composite;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee manager = new Employee("manager","Software",
                100);
        System.out.println("manager without developer"+manager);

        Employee developer1 = new Employee("Developer1", "Software"
                ,80);
        manager.add(developer1);



        System.out.println("manager with 1 developer"+manager);

        Employee developer2 = new Employee("developer2","Software"
                ,80);
        manager.add(developer2);

        System.out.println("manager with 2 developers"+manager);
        System.out.println(manager);


        Employee employee1 = new Employee("Accuntant1","Acc",23);
        developer2.add(employee1);

        Employee employee2 = new Employee("Accuntant1","Acc",23);
        developer2.add(employee2);

        System.out.println("developer 2 with 2 employees: "+developer2);






//        Employee manager = new Employee(
//                "manager1","dep1", 100);
//        Employee manager3 = new Employee(
//                "manager3","dep1", 100);
//
//        manager.add(manager3);
//        System.out.println(manager);
//
//        Employee emp1 = new Employee(
//                "emp1","dep1",99);
//        manager.add(emp1);
//
//        System.out.println(manager);
//        Employee manager0 = new Employee(
//                "manager0","dep0",101);
//        manager0.add(manager);
//
//        System.out.println(manager0);


    }
}

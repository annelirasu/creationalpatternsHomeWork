package demo;

import javax.rmi.CORBA.StubDelegate;

public class StudentDemo {
    private int age;
    private String name;
    private String family;

    public int getAge() {
        return age;
    }

    private StudentDemo(){}



    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    @Override
    public String toString() {
        return "StudentDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    public static void main(String[] args) {
            StudentDemo studentDemo  = new StudentDemo();
            studentDemo.setAge(12);
            studentDemo.setName("Alex");
            studentDemo.setFamily("cas");
//            System.out.println(studentDemo.getName()+ " "
//                    +studentDemo.getFamily()+ " "
//            +studentDemo.getAge());
            System.out.println( studentDemo.toString());
    }

}

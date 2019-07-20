package demo;

class Student implements Cloneable{
    private int age;
    private String name;

    Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String args[]){
        try{
            Student s1=new Student(30,"alex");
            Student s2=(Student)s1.clone();

            System.out.println(s1.age+" "+s1.name);
            System.out.println(s2.age+" "+s2.name);

            System.out.println(s1);
            System.out.println(s2.toString());
        }
        catch(CloneNotSupportedException ignored){}
    }
}  

package demo;

public class StringBuilderDemo {

    public static void main(String[] args) {
       StringBuilder stringBuilder =  new StringBuilder();
       stringBuilder.append("hello").append(" ").append("World")
               .append("");
       System.out.println( stringBuilder);
       String s = "Hello";
       s+=" ";
       s+="world";


    }
}

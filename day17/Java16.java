package day17;

import java.util.List;

public class Java16 {

    /**
     * InnerJava16
     */
    public record Student(int id, String name, double marks) {

        public boolean isPassed(){
            return marks >= 40;
        }
    }
    
    public interface Printable {    
        void print();
    }
    
    public record Student2(int id, String name, double marks) implements Printable{

        public boolean isPassed(){
            return marks >= 40;
        }

        public void print(){
            System.out.println("Print method called");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(851, "tanuj", 92);
        Student s3 = new Student(851, "tanuj", 92);
        
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);
        System.out.println("isPassed: " + s1.isPassed());

        Student2 s2 = new Student2(851, "tanuj", 92);
        s2.print();

        List<Student> list = List.of(
            new Student(813, "lakshya", 66),
            new Student(843, "krish", 73),
            new Student(840, "abhinav", 81),
            new Student(836, "mohit", 79)
        );

        System.out.print("is s1 and s3 == : ");
        System.out.println(s1 == s3);
        System.out.print("is s1 and s3 equals : ");
        System.out.println(s1.equals(s3));

        for(Student s : list){
            System.out.println(s.id + " " + s.name);
        }
    }
}
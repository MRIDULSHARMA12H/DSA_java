package OopsConcept;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Mridul");
        s2.roll = 22;
        System.out.println(s2.name);
        s2.marks[0] = 100;
        s2.marks[1] = 50;
        s2.marks[2] = 100;
        Student s3 = new Student(s2);
        System.out.println(s3.name);
        System.out.println(s3.roll);
        s2.marks[2] = 50;
        for(int i = 0 ; i<3 ; i++){
            System.out.println(s3.marks[i]);
        }



    }
}
class Student{
    String name;
    int roll;
    int[] marks;

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called..");
    }
//    when we give parameters , and we make multiple constructors in java
    Student(String name){
        marks = new int[3];
        this.name = name;
        System.out.println("Second constructor is called..");
    }

//    copy constructor & it is shallow copy
//    Student(Student s2){
//        marks = new int[3];
//        System.out.println("Third constructor is called.");
//        this.name = s2.name;
//        this.roll = s2.roll;
//        this.marks = s2.marks;
//        there we copy the value of s2 constructor.
//    }

//    Deep copy constructor.
    Student(Student s2){
        marks = new int[3];
        this.name = s2.name;
        this.roll = s2.roll;
        for(int i = 0 ; i< marks.length ; i++){
            this.marks[i] = s2.marks[i];
        }
    }
}

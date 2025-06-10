package Lab6.Question1;

import java.util.Scanner;
import java.util.ArrayList;
public class StudentEx {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Student> slist = new ArrayList<>();
       for(int i = 0;i<3;i++){
        System.out.println("Enter sid of student :");
        int sid = sc.nextInt();
      
        System.out.println("Enter name of student :");
        String name = sc.next();
       
       ArrayList<Integer> marks = new ArrayList<>();
       System.out.println("Enter the marks of 2 subjects :");
       for(int j = 0;j<2;j++){
        marks.add(sc.nextInt());
       }

       slist.add(new Student(sid, name, marks));
    }
    System.out.println("Student Details -->");
    for(Student s: slist){
        System.out.println(s.sid);
        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println("Total : "+s.getTotalMarks());
        System.out.println("Average : "+s.getAvgMarks());
    }
    sc.close();
    }
}
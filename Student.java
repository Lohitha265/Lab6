package Lab6.Question1;
import java.util.ArrayList;

class Student{
    int sid;
    String name;
    ArrayList<Integer> marks;

    Student(int sid, String name, ArrayList<Integer> marks){
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }
    int getTotalMarks(){
        int sum = 0;
        for(int i : marks){
            sum = sum+i;
        }
        return sum;
    }

    double getAvgMarks(){
        return getTotalMarks()/(double) marks.size();
    }
}

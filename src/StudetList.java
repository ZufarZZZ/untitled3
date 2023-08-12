import java.util.*;
public class StudetList <T extends Student>{
    List<T> students;
    public StudetList(){
        students = new ArrayList<>();

    }

    public StudetList(List<T> students) {
        this.students = students;
    }
    public void addStudent(T e){
        students.add(e);
    }
    public void removeStudent(T e){
        students.remove(e);
    }
    public T getHighestGpaStudent(){
        return 
    }
}

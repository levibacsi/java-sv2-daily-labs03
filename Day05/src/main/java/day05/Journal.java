package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    List <String> students = new ArrayList<>();

    public boolean addStudents (String studentName){
        if (studentName.trim().indexOf(" ") > 0){
            students.add(studentName);
            return true;
        } else {
            return false;
        }
    }

    public List<String> getStudents() {
        return new ArrayList<>(students);
    }
}

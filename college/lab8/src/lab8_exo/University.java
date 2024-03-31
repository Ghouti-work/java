package lab8_exo;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> studentsList = new ArrayList<>();
    private int depSize;
    private String name;

    public University(Student [] studentsList, int size,String name){
        for(Student s: studentsList){
            this.studentsList.add(s);
        }
        this.depSize = size;
        this.name = name;
    }
    
    public String univ_name() {
    	return this.name;
    }
    
    public void showStudentsDetails(University cs){
        for(Student s : studentsList){
            s.displayDetails(cs);
        }
    }
    
    public void addStudent(Student s){
        if(this.studentsList.size() > this.depSize) return;
        this.studentsList.add(s);
    }
    
    public void showStudentsNames(){
        for(Student s : studentsList){
            System.out.println(s.getName());
        }
    }
}

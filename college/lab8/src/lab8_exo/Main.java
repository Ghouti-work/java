package lab8_exo;

public class Main {

	public static void main(String[] args) {
        Student s1 = new Student("ghizlene_zerhouni_houria", 19, "L2");
        Student s2 = new Student("Mous_mohammed", 19, "L3");
        Student s3 = new Student("tihtih", 19, "M1");
        Student s4 = new Student("abdsammad_matalah", 19, "M2");
        Student s5 = new Student("Hakim_roissat", 18, "L1");
        Student[] students = {s1,s2,s3,s4,s5};
        University cs = new University(students,100,"univ-tlemcen");
        
        
        cs.showStudentsDetails(cs);
        System.out.println("Students name : ");
        cs.addStudent(s5);
        cs.showStudentsNames();

	}

}

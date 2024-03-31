package lab8_exo;

public class Student {
    private String name;
    private int age;
    private String level;
    private String email;
    
    public Student(String name, int age, String level){
        this.name = name;
        this.age =age;
        this.level = level;
    }

    public String getName(){
        return this.name;
    }
    public String getLevel(){
        return this.level;
    }
    public int getAge(){
        return this.age;
    }
    public void displayDetails(University univ){
        this.email = generateEmailAdress(univ);
        System.out.println("Name : " + this.name + ", Age : " + this.age + ", Level : "+ this.level + ", Email : " + email);

    }
    private String generateEmailAdress(University univ){
        return this.name + this.age+ "@" + univ.univ_name() + ".dz";
    }
}

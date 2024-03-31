public class App {
    int x ; // this is global variable in Java

    // This is a special function in Java

    App() { // this is a constructor in Java
        x = 5;
    }


    public static void main(String[] args) throws Exception {
        
        Cercle c = new Cercle(); // this is an object of type Cercle in Java 
        
        Point p = new Point(1,5); // this is an object of type Point in Java

        Cercle c1 = new Cercle(p, 5); // this is an object of type Cercle in Java

        /*
         * an object in Java is an instance of a class
         * the object is created by the keyword "new" followed by the class name and the constructor of the class   
         * the object is a container that can hold the value of the class
         * the object can call the methods of the class
         * the object can access the variables of the class
         * the object can be passed as a parameter to a method
         * the object can be returned from a method
         * the object can be assigned to a variable
         * the object can be compared to another object
         * the object can be used in a loop
         * the object can be used in a condition
         * the object can be used in a switch statement
         * the object can be used in a try-catch block
         */

         System.out.println("" + c.toString()); // this is a method call in Java

         System.out.println("" + c1.toString()); // this is a method call in Java

    }
}

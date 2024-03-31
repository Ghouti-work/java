public class App {
    public static void main(String[] args) throws Exception {

        // This is a comment in Java 

        /* this also a comment in java 
         * this is a multiline comment
         */

         // ____________________________________________________________________________________

        int a = 10; // This is a variable declaration in Java 

        // integer is between -2,147,483,648 and 2,147,483,647 

        /*
         * the variable a is declaration of a container that can hold a value of type integer or deferent type
         */

        float b = 10.5f; // This is a variable declaration of type float in Java 

        // float is between 1.4e-045 to 3.4e+038 

        double c = 10.5; // This is a variable declaration of type double in Java

        // double is between 4.9e-324 to 1.8e+308

        char d = 'A'; // This is a variable declaration of type char in Java

        // char is between 0 to 65,535 bite 

        boolean e = true; // This is a variable declaration of type boolean in Java 

        // boolean is either true or false 

        String f = "Hello, World!"; // This is a variable declaration of type String in Java

        // String is a sequence of characters like a tabele of char

        System.out.println(a); // This is a statement in Java TO "PRINT" the value of variable a

        System.out.println(b); // This is a statement in Java TO "PRINT" the value of variable b

        System.out.println(c); // This is a statement in Java TO "PRINT" the value of variable c

        System.out.println(d); // This is a statement in Java TO "PRINT" the value of variable d

        System.out.println(e); // This is a statement in Java TO "PRINT" the value of variable e

        System.out.println(f); // This is a statement in Java TO "PRINT" the value of variable f

        // This is a statement in Java TO "PRINT" the value of variable a

        if (a > 5) { // this is a condition in Java

            // condition in java is a statement that can be either true or false 
            // if the condition is true the code inside the block will be executed

            System.out.println("a is greater than 5"); 
        
        } else {
          
            // if the condition is false the code inside the block will not be executed
            System.out.println("a is less than 5");
            
        }

        // ____________________________________________________________________________________

        // This is a loop in Java

        for (int i = 0; i < 5; i++) { // this is a loop in Java

            // loop in java is a block of code that will be executed multiple times 

            System.out.println(i); // This is a statement in Java TO "PRINT" the value of variable i

        }

        // ____________________________________________________________________________________

        // This is a function in Java

        int sum = add(5, 10); // this is a function call in Java

        // function in java is a block of code that can be called multiple times

        System.out.println(sum); // This is a statement in Java TO "PRINT" the value of variable sum

        // ____________________________________________________________________________________

        // This is a table in Java

        int[] numbers = {1, 2, 3, 4, 5}; // this is a table declaration in Java

        // table in java is a collection of values of the same type

        for (int i = 0; i < numbers.length; i++) { // this is a loop in Java

            // loop in java is a block of code that will be executed multiple times 

            System.out.println(numbers[i]); // This is a statement in Java TO "PRINT" the value of variable numbers[i]

        }

        // ____________________________________________________________________________________

        // This is a table in Java

        String[] names = {"Ahmed", "Ali", "Mohamed", "Omar", "Khaled"}; // this is a table declaration in Java

        // table in java is a collection of values of the same type

        for (int i = 0; i < names.length; i++) { // this is a loop in Java

            // loop in java is a block of code that will be executed multiple times 

            System.out.println(names[i]); // This is a statement in Java TO "PRINT" the value of variable names[i]

        }

        // ____________________________________________________________________________________

        // This is a table in Java

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // this is a table declaration in Java

        // table in java is a collection of values of the same type

        for (int i = 0; i < matrix.length; i++) { // this is a loop in Java

            // loop in java is a block of code that will be executed multiple times 

            for (int j = 0; j < matrix[i].length; j++) { // this is a loop in Java

                // loop in java is a block of code that will be executed multiple times 

                System.out.println(matrix[i][j]); // This is a statement in Java TO "PRINT" the value of variable matrix[i][j]

            }

        }

        // ____________________________________________________________________________________

    }

    // This is a function in Java

    public static int add(int a, int b) { // this is a function declaration in Java

        // function in java is a block of code that can be called multiple times

        return a + b; // this is a statement in Java TO "RETURN" the value of a + b

    }

}


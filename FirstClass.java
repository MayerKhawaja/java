class FirstClass {
    
    public static void main(String args[]){
        // three ways to print output in java print for normal output in same line, println this gives us a nextline after printing, \n by using this the next text is giong to be printed in next line
        System.out.print("Hello World with java");
        System.out.println("Hello World with java");
        System.out.print("Hello World with java\n from me \n for me");
        // 1st methord
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        // 2nd methord
        System.out.println("*\n**\n***\n****");
        // variables in java
        String name = "Tony Stark";
        double price = 25.25;
        int age = 48;
        int a = 25;
        int b = 10;
        // we can also change the values of variables like so:
        b = 20;
        name = "ironman";
        int diff = a-b;
        
        // Using the variables to avoid warnings
        System.out.println("\nName: " + name);
        System.out.println("Price: " + price);
        System.out.println("Age: " + age);
        System.out.println("Difference (a - b): " + diff);
    }
} 
// public class NumberOperations {
//     private int num1;
//     private int num2;
//     private int num3;

//     // Getter and Setter for num1
//     public int getNum1() {
//         return num1;
//     }

//     public void setNum1(int num1) {
//         this.num1 = num1;
//     }

//     // Getter and Setter for num2
//     public int getNum2() {
//         return num2;
//     }

//     public void setNum2(int num2) {
//         this.num2 = num2;
//     }

//     // Getter and Setter for num3
//     public int getNum3() {
//         return num3;
//     }

//     public void setNum3(int num3) {
//         this.num3 = num3;
//     }

//     public static void main(String[] args) {
//         if (args.length != 3) {
//             System.out.println("Please enter exactly three integers as command line arguments.");
//             return;
//         }

//         try {
//             int a = Integer.parseInt(args[0]);
//             int b = Integer.parseInt(args[1]);
//             int c = Integer.parseInt(args[2]);

//             NumberOperations obj = new NumberOperations();
//             obj.setNum1(a);
//             obj.setNum2(b);
//             obj.setNum3(c);

//             int sum = obj.getNum1() + obj.getNum2();
//             int product = obj.getNum2() * obj.getNum3();

//             System.out.println("Sum of first two numbers: " + sum);
//             System.out.println("Product of last two numbers: " + product);
//         } catch (NumberFormatException e) {
//             System.out.println("Please ensure all inputs are valid integers.");
//         }
//     }
// }

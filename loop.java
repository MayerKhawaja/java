import java.util.*;
public class loop {
    public static void main(String arg[]) {
        //counter++ => counter = counter + 1
        // for (int counter = 0; counter < 11; counter++) {
        //     System.out.print(counter + " ");        
        // for (int i = 0; i<=10; i++){
        //  System.out.println (i);
        // }
        // int i = 0;
        // while (i < 11) {
        //     System.out.println(i);
        //     i = i+1; //i++;
        // }
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i= i+1;
        // } while (i < 11); //do ..while performs the function first and then checks the condition so it prints the statement atleast one time even if the cndition is false.
        // int sum = 0;
        // for (int i= 1; i<=4; i++){
        //     sum += i;
        // }
        // System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        // int sum = 0;
        // for(int i = 1 ; i <= n; i++){
        //     sum += i;
        // }
        // System.out.println(sum);
        // for (int i = 1; i <= 10 ;i++){
        //     System.out.println(n*i);
        // }
        for (int i = 2; i <= n ; i += 2){
            System.out.println(i);
        }
    }
}
import java.util.*;
package Day2;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("The sum of a and b is " + (a + b));
        System.out.println("The difference of a and b is " + (a - b));
        System.out.println("The product of a and b is " + (a * b));
        if (b != 0) {
            System.out.println("The quotient of a and b is " + (a / b));
            System.out.println("The remainder of a and b is " + (a % b));
        } else {
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}

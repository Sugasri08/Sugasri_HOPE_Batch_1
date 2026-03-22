
import java.util.*;
public class MathematicalOperations {
    public static void main(String[] args) {
    Scanner sc=new Scanner("Enter the first number: ");
    int num1=10;
    System.out.println("Enter the second number: ");
    int num2=20;
    System.out.println("Enter the operator: ");
    String o=sc.next();
    switch(o){
        case "+":
            System.out.println("The sum is: "+(num1+num2));
            break;
        case "-":
            System.out.println("The difference is: "+(num1-num2));
            break;
        case "*":
            System.out.println("The product is: "+(num1*num2));
            break;
        case "/":
            if(num2!=0){
                System.out.println("The quotient is: "+(num1/num2));
            }
            else{
                System.out.println("Cannot divide by zero");
            }
            break;
        default:
            System.out.println("Invalid operator");
    }
     }
}

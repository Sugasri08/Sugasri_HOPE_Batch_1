package Day3;
import java.util.*;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter the second Number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        int max=0;
        if(a>b&&a>c){
            max=a;
        }
        else if(b>a&&b>c){
            max=b;
        }
        else{
            max=c;
        }
    }
}

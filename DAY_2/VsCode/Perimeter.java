import java.util.*;
  
public class Perimeter {
    public static void main(String[] args) {
        int l=0;
        int b=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        l=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        b=sc.nextInt();
        int perimeter=2*(l+b);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        sc.close();
    }
}

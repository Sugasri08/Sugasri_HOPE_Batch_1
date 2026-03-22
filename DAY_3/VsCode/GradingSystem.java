import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the CGPA:");
        double cgpa=sc.nextDouble();
        if(cgpa>=9.0 && cgpa<=10.0){
            System.out.println("Distinction");
        }
        else if(cgpa>=8.0 && cgpa<9.0){
            System.out.println("First Class");
        }
        else if(cgpa>=7.0 && cgpa<8.0){
            System.out.println("Second Class");
        }
        else if(cgpa>=6.0 && cgpa<7.0){
            System.out.println("Third Class");
        }
        else{
            System.out.println("Fail");
        }
        String op=sc.next();
    }
}

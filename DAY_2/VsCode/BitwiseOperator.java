package Day2;
public class BitwiseOperator {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("Bitwise NOT: "+(~a));
        System.out.println("Left Shift: "+(a<<3));
        System.out.println("Right Shift: "+(a>>1));
    }
}

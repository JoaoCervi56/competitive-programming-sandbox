// SIMPLE: "Write a Java Program to convert Integer numbers into Binary numbers."
import java.util.Scanner;
public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(Integer.toBinaryString(read.nextInt()));
        read.close();
    }
}

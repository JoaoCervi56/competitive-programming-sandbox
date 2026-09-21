// SIMPLE: "Write a Program to Find Factorial of a Number in Java."
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(fatorial(read.nextInt()));
        read.close();

    }

    public static int fatorial(int x){
        return (x == 1 || x == 0) ? 1:x*fatorial(x-1);
    }
}
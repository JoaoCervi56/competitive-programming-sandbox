// SIMPLE: "Write a Fibonacci Sequence up to a number n."

import java.util.Scanner;
public class Fibonacci{

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nFn: ");
        int n = read.nextInt();

        int[] sequence = fibo(n);
        
        System.out.println("F"+n+": "+sequence[n]);
        System.out.print("Sequence: ");
        for(int number:sequence){System.out.print(number+ ", ");}System.out.print("...");

        read.close();
    }

    static int[] fibo(int n){
        int[] full = new int[n+1];
        int a = 0, b = 1;
        
        full[0] = a;
        if (n>0) full[1] = b;

        for(int i = 2; i <= n; i++){
            full[i] = a + b;
            a = b;
            b = full[i];
        }
        return full;
    }
}
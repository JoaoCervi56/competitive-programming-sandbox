// SIMPLE: "Write a Program to Print the Pascal's Triangle"

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nNumber of Rows: ");
        int n = read.nextInt();
        
        ArrayList<int[]> triangle = pascal(n);
        
        for(int[] line:triangle){
            n-=1;
            for(int i = 0; i < n; i++){System.out.print(" ");}
            for(int x:line){System.out.print(x+" ");}
            System.out.println();
        }
        
        read.close();
    }

    static ArrayList<int[]> pascal(int n){
        ArrayList<int[]> sequence = new ArrayList<int[]>();
        int[] first = {1};
        int[] second = {1,1};
        
        sequence.add(first);
        if (n>1) sequence.add(second);

        for(int i = 2; i<n; i++){

            int[] last = sequence.get(i-1);         
            int[] line = new int[i+1];
            
            line[0] = 1;
            line[i] = 1;

            int a = 0;
            int b = 1;

            for(int j = 1; j<i;j++){
                line[j] = last[a] + last[b];
                a++;
                b++;
            }
            sequence.add(line);
        }
        return sequence;
    }
}
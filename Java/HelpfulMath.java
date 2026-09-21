/* CODEFORCES
A. Helpful Maths
time limit per test
2 seconds
memory limit per test
256 megabytes

Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.
Input

The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.
Output

Print the new sum that Xenia can count.
Examples
Input
Copy

3+2+1

Output
Copy

1+2+3

Input
Copy

1+1+3+1+3

Output
Copy

1+1+1+3+3

Input
Copy

2

Output
Copy

2
*/

import java.util.Scanner;
public class HelpfulMath{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        char[] values = read.nextLine().toCharArray();
        int [] n = {0,0,0};

        for(char v:values){
            if(v == '+') {continue;}
            switch(v){
                case '1': n[0]++; break;
                case '2': n[1]++; break;
                case '3': n[2]++; break;
                default:          break;
            }
        }

        for(int i = (n[0]+n[1]+n[2]);i > 0; i--){
            if      (n[0] > 0){n[0]--; System.out.print('1');}
            else if (n[1] > 0){n[1]--; System.out.print('2');}
            else if (n[2] > 0){n[2]--; System.out.print('3');}

            if (i>1)System.out.print('+');
        }
        read.close();
    }
}

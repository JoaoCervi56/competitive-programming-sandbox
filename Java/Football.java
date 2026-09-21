/* CODEFORCES
A. Football
time limit per test
2 seconds
memory limit per test
256 megabytes

One day Vasya decided to have a look at the results of Berland 1910 Football Championship’s finals. Unfortunately he didn't find the overall score of the match; however, he got hold of a profound description of the match's process. On the whole there are n lines in that description each of which described one goal. Every goal was marked with the name of the team that had scored it. Help Vasya, learn the name of the team that won the finals. It is guaranteed that the match did not end in a tie.
Input

The first line contains an integer n (1 ≤ n ≤ 100) — the number of lines in the description. Then follow n lines — for each goal the names of the teams that scored it. The names are non-empty lines consisting of uppercase Latin letters whose lengths do not exceed 10 symbols. It is guaranteed that the match did not end in a tie and the description contains no more than two different teams.
Output

Print the name of the winning team. We remind you that in football the team that scores more goals is considered the winner.
Examples
Input
Copy

1
ABC

Output
Copy

ABC

Input
Copy

5
A
ABA
ABA
A
A

Output
Copy

A

*/


import java.util.Scanner;
public class Football {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int n = read.nextInt();
        read.nextLine();
        String[] score = new String[n];
        for(int i = 0; i < n;i++){
            score[i] = read.nextLine();
        }

        int contA = 0, contB = 0;
        String timeA = score[0], timeB ="";
        for(int j = 0;j < n;j++){
            if(score[j].equals(timeA)) {contA++;} else {contB++;timeB = score[j];}
            if(contA > (n/2)){ System.out.println(timeA); break;}
            if(contB > (n/2)){ System.out.println(timeB); break;}
        }

        read.close();
    }
}
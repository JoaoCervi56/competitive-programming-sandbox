// SIMPLE: "Write a Java Program to Add two Complex Numbers. (Only Positive Numbers...)"
import java.util.Scanner;

public class ComplexSum {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter: ");
        int[] first = separate(read.nextLine().toCharArray());
        System.out.print("Enter: ");
        int[] second = separate(read.nextLine().toCharArray());
               
        System.out.println((first[0]+second[0])+"+"+(first[1]+second[1])+"i");

        read.close();
    }


    public static int[] separate (char[] number){
        boolean flag = true;
        String realPart = "", complexPart = "";
        for(char n: number){
            if(n == '+'){flag = false; continue;}
            if(n == 'i'){break;}

            if(flag){realPart += n;}
            else{complexPart += n;}
        }
        int[] both = {Integer.parseInt(realPart),Integer.parseInt(complexPart)};

        return both;
    }
}

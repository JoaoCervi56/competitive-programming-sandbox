// Inspired by: https://youtu.be/-J_xL4IGhJA?si=c1uttGeUqhmzCbVg&t=2942

import java.util.Scanner;

public class SquareRootAlgorithm{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.print("\nNumber to find the Square Root: ");
        double x = read.nextDouble();
        double g = squareRoot(x);
        System.out.println("G: "+g);
        read.close();
    }

    public static double squareRoot(double x){return findSquareRoot(1, x);}
    public static double findSquareRoot(double g, double x){ return (isGoodEnough(g, x)) ? g :findSquareRoot(guessImprove(g, x),x);}

    public static boolean isGoodEnough(double g, double x){
        g = (Math.round(g*g*10000))/10000;
        return (g == x);
    }

    public static double guessImprove(double g, double x){return average(g, x/g);}
    public static double average(double a, double b){return (a+b)/2;}
}
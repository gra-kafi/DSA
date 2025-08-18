//Print the fibonacci sequence till nth term
//0, 1, 1, 2, 3, 5, 8, 13, 21
package Recursion;

public class PrintFibonacci {
    public static void main(String[] args) {
        int num = 0;
        int first = 0;
        int second = 1;
        printFibonacci(num,first,second);
    }
    public static void printFibonacci(int num, int first , int second){
        if(num == 0){
            System.out.print(" 0 ");
        }
        if(num == 1){
            System.out.print(" 1 ");
        }
        if(num>10){
            return;
        }

        int third = first + second;
        System.out.print(" "+third+" ");

        printFibonacci(num+1, second, third);


        
    }
}

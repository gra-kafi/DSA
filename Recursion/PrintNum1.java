//print 5 to 0
package Recursion;

public class PrintNum1 {
    public static void main(String[] args) {
        int n = 5;

        printNum(n);
    }
    public static void printNum(int n){
        if(n>=0){
            System.out.println(n);
            n--;
            printNum(n);
        }
    }
}

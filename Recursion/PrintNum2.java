//print number 1 to 5
package Recursion;

public class PrintNum2 {
    public static void main(String[] args) {
        printNum(1);
    }
    public static void printNum(int n){
        if(n<=5){
            System.out.println(n);
            n++;
            printNum(n);
        }
        
    }
}

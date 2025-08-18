//Print factorial of a number n
package Recursion;

public class PrintFactorial {
    
    public static void main(String[] args) {
        int num = 5;
        System.out.println(print_factorial(num));
    }
    public static int print_factorial(int num){
        if(num==1 || num==0){
            return 1;
        }
        else{
            return print_factorial(num-1)*num;
        }
    }

}

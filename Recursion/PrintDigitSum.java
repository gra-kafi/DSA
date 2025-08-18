package Recursion;

public class PrintDigitSum {
    public static void main(String[] args) {
        int num = 342;
        System.out.println(digitSum(num));
    }
    public static int digitSum(int num){
        if(num==0){
            return 0;
        }    
        return (num%10) + digitSum(num/10);
    }
}

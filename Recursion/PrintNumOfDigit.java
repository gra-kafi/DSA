package Recursion;

public class PrintNumOfDigit {
    public static void main(String[] args) {
        int num = 345;
        System.out.println(countNum(num));
    }
    public static int countNum(int num){
        if(num==0){
            return 0;
        }
        return countNum(num/10)
    }
}

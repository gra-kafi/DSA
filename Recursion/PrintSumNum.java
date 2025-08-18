//print sum of the first n natural number
package Recursion;

public class PrintSumNum {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int sum = 0;
        sumNum(start,end,sum);
    }
    public static void sumNum(int start, int end, int sum){
        
        if(start == end+1){
            System.out.println(sum);
            return;
        }
        sum = sum + start;
        sumNum(start+1, end, sum);

    }
}

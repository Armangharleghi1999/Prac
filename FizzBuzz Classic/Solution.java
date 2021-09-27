import java.util.Scanner;

public class Solution {
    public void Fizz(int n){
        for( int i = 1; i<=n; i++){
            if (i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if (i%5==0 && i%3!=0){
                System.out.println("Buzz");
            }
            else if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Input the max number: ");
        solution.Fizz(in.nextInt());
    }
}

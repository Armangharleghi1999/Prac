public class Solution {
    public int Fibonacci (int N){

        if (N==0){
            return(0);
        }
        if (N==1){
            return(1);
        }
            return (Fibonacci(N - 1) + Fibonacci(N - 2));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Fibonacci(4));
    }
}

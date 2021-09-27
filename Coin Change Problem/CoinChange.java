import java.util.Scanner;
public class CoinChange {
    private int total_cents = 0;
    public int getTotal_cents() {
        return total_cents;
    }
    public void setTotal_cents(int total_cents) {
        this.total_cents = total_cents;
    }

    static long getNumberOfWays(long N, long[] Coins)
    {
        long[] ways = new long[(int)N + 1];
        ways[0] = 1;
        for (long coin : Coins) {
            for (int j = 0; j < ways.length; j++) {
                if (coin <= j) {
                    ways[j] += ways[(int) (j - coin)];
                }
            }
        }
        return ways[(int)N];
    }
    static void printArray(long[] coins){
        for (long i : coins){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CoinChange coin = new CoinChange();
        long[] Coins = { 1, 5, 10 };
        System.out.println("How many total cents?");
        coin.setTotal_cents(in.nextInt());
        System.out.println("The Coins Array:");
        printArray(Coins);

        System.out.println("Solution:");
        System.out.println(getNumberOfWays(coin.getTotal_cents(), Coins));
    }
}

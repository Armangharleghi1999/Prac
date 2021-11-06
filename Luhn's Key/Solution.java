public class Solution {
//    Steps to check the 16 digits credit card number -
//            1. Drop the last digit from the card number. The last digit (16th position) is called Luhn key.
//            2. Evaluate each digit from right to left. When the digit is in odd positions, we multiply it by 2. If, in
//            addition, the digit is superior or equal to 5, we simply substract 9 from the previous multiplication (only applicable for odd ranks).
//            3. Add all the numbers together
//            4. Compute the Luhn Key. This (last) digit is the amount that you would need to add to the previous total (computed above in step 3) and check if its multiple of 10.

    public boolean luhnKey (String number){
        if(number == null){
            System.out.println("Null inputted");
            return false;
        }
        int total = 0;
        String[] numberStringArray = number.split("");
        int[] numberIntArray = new int[16];

        for (int i = 0; i<16; i++){
            numberIntArray[i] = Integer.parseInt(numberStringArray[i]);
        }
        for (int x = 14; x >= 0; x--){
            if(x % 2 != 1){
                numberIntArray[x] += numberIntArray[x];
                if(numberIntArray[x] > 9){
                    numberIntArray[x] = numberIntArray[x]-9;
                }
            }
            total += numberIntArray[x];
        }

        int luhnKey = 10-(total%10);
        if(luhnKey != numberIntArray[numberIntArray.length-1]){
            System.out.println("Error in logic");
            return false;
        }
        else {
            return ((total+luhnKey) % 10 == 0);
        }
    }

    public static void main(String[] args) {
    Solution solution = new Solution();
        System.out.println(solution.luhnKey("4003600000000014"));
    }
}

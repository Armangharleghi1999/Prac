import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public String solution(String s){
        // Used as index in the modified string
        char[] str = s.toCharArray();
        int n = str.length;
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    public static void main(String[] args) {
        Solution lmao = new Solution();
        Scanner in = new Scanner(System.in);

        System.out.println("Give word: ");
        String input = in.nextLine();
        System.out.print(lmao.solution(input));
    }
}

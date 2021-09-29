import java.util.*;
public class Palindrome {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if(a==0){System.out.println("wins");}
            LinkedList<Integer> number_input = new LinkedList<>();
            boolean is_palindrome = true;
            int i = 0;
            do{
                number_input.add(i, (a % 10));
                a = a/10;
                i++;
            }while (a>0);
            for (int x = 0; x<number_input.size(); x++){
                if (!Objects.equals(number_input.get(x), number_input.get(number_input.size() - (x + 1)))) {
                    is_palindrome = false;
                    break;
                }
            }
            final String msg = is_palindrome?"Wins":"Loses";
            System.out.println(msg);
        }
}

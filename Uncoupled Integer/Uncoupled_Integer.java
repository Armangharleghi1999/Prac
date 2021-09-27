import java.util.LinkedList;
import java.util.Scanner;

public class Uncoupled_Integer {
    public void Uncoupled(LinkedList<Integer> List){
        int hold;
        int check;
        boolean FoundDuplicate = false;
        for (int i = 0; i<List.size(); i++){
            hold = List.get(i);
            for (int j = 0; j<List.size(); j++){
                check = List.get(j);
                if (j==i){}
                else if (hold == check){
                    FoundDuplicate = true;
                }
            }
            if (!FoundDuplicate){
                System.out.println("The number is: "+hold);
            }
            FoundDuplicate = false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Uncoupled_Integer solution = new Uncoupled_Integer();
        LinkedList<Integer> Numbers_I = new LinkedList<>();

        System.out.println("Enter the list of numbers: ");
        String input = in.nextLine();
        String[] Numbers_s = input.split(", ");

        for (String numbers_ : Numbers_s) {
            Numbers_I.add(Integer.parseInt(numbers_));
        }
        solution.Uncoupled(Numbers_I);
    }
}

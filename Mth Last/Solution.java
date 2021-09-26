import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public void mth_to_last_ArrayList(int M, ArrayList List){
        if (M>0) {
            System.out.println(M > List.size() ? "Null" : String.valueOf(List.size() - (M-1)));
        }
        else{
            System.out.println("Error! Try that again.");
        }
    }
    private void mth_to_last_LinkedList(int M, LinkedList List){
        if (M>0) {
            System.out.println(M > List.size() ? "Null" : String.valueOf(List.size() - (M-1)));
        }
        else{
            System.out.println("Error! Try that again.");
        }
    }
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        ArrayList<Integer> ar1 = new ArrayList<>();
        LinkedList<Integer> ar2 = new LinkedList<>();
        LinkedList<Integer> ar3 = new LinkedList<>();

        for (int i = 0; i<10; i++){
            ar1.add(i);
            ar2.add(i);
        }
        //Arraylist
        System.out.println("ArrayList: ");
        solution.mth_to_last_ArrayList(1,ar1);

        //LinkedList
        System.out.println("\nLinkedList: ");
        solution.mth_to_last_LinkedList(1, ar2);

        //New LinkedList
        System.out.println("\nNew LinkedList:");
        int M = 2;
        String L = "1 2 3 4 5 6 7 8 9 10";
        String[] NewL = L.split(" ");

        for(int i = 0; i<NewL.length; i++){
            ar3.add(Integer.parseInt(NewL[i]));
        }
        if (M>0) {
            System.out.println(M > ar3.size() ? "Null" : String.valueOf(ar3.size() - (M-1)));
        }
        else{
            System.out.println("Error! Try that again.");
        }
    }
}
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] name = s.split("");
        LinkedList<String> namelist = new LinkedList<String>();
        boolean isnumber = false;
        for (int i = 0; i<name.length; i++) {
            for (int x = 0; x < 10; x++) {
                if (name[i].equals(String.valueOf(x))) {
                    isnumber = true;
                }
            }
            if (!isnumber){namelist.add(name[i]);}
            isnumber = false;
        }
        for (String value : namelist) {
            System.out.print(value);
        }
    }
}

import java.util.HashMap;
/*
You have a linear car parking lot with all parking spaces occupied except one. Each car has a unique number. The single
move you can make is to move a car from its position to the empty space. You also know the desired position of all cars.
Your task is to move all cars to their desired position using the least number of car moves.
 */
public class Solution {
    public int orderCars(int[] current, int[] desired){
        int emptyIndex = -1;
        int n = current.length;
        int moves = 0;

        HashMap<Integer, Integer> currentPos = new HashMap<>();

        for (int i = 0; i<n; i++){
            currentPos.put(current[i], i);
            if (current[i] == 0){
                emptyIndex = i;
            }
        }

        for (int i = 0; i<n; i++){
            // solve cycle with empty space
            while(desired[emptyIndex] != 0){
                int nextElem = desired[emptyIndex];
                int nextPos = currentPos.get(nextElem);

                current[nextPos] = 0;
                currentPos.replace(0, nextPos);

                emptyIndex = nextPos;
                moves++;
            }

            // break this cycle if necessary
            if (current[i] != desired[i]){
                int currentElem = current[i];

                current[emptyIndex] = currentElem;
                currentPos.replace(currentElem, emptyIndex);

                current[i] = 0;
                currentPos.replace(0, i);

                emptyIndex = i;
                moves++;
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] desired = {1, 2, 4, 6, 0, 7, 3, 5};
        int[] current = {0, 1, 4, 7, 3, 2, 5, 6};

        System.out.println(solution.orderCars(current, desired));
    }
}

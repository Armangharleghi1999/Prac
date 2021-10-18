public class OverlappingRectangles {
    public int solution (int[] rec1, int[] rec2){
        // result is 0 if they do not overlap, 1 if they do
        int isOverlap = 0;
        int[] rectangle1Xs = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] rectangle2Xs = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] rectangle1Ys = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] rectangle2Ys = {0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i<rec1.length; i=i+2){
            rectangle1Xs[i/2]=rec1[i];
            rectangle2Xs[i/2]=rec2[i];
            rectangle1Ys[i/2]=rec1[i+1];
            rectangle2Ys[i/2]=rec2[i+1];
        }

        //check for x overlap
        int maxX = rectangle1Xs[0];
        int minX = rectangle1Xs[0];
        int maxY = rectangle2Ys[0];
        int minY = rectangle2Ys[0];
        int n = rectangle1Xs.length;

        for (int x : rectangle1Xs){
            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);
        }
        for (int x : rectangle2Ys){
            maxY = Math.max(maxY, x);
            minY = Math.min(minY, x);
        }

        for (int x = 0; x<n; x++){
            if(maxX > rectangle2Xs[x] && minX < rectangle2Xs[x]){
                for (int z = 0; z<n; z++){
                    if(maxY > rectangle1Ys[z] && minY < rectangle1Ys[z]){
                        isOverlap = 1;
                        break;
                    }
                }
            }
        }
        return (isOverlap);
    }

    public static void main(String[] args) {
        OverlappingRectangles p = new OverlappingRectangles();
        int[] rectangle1 = {-1,-1,-1,1,1,1,1,-1};
        int[] rectangle2 = {-2,-2,-2,2,2,2,2,-2};
        System.out.println(p.solution(rectangle1, rectangle2));
    }
}
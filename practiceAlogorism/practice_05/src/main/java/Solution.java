import java.util.ArrayList;

/**
 * Created by samsung on 2017-05-30.
 */
public class Solution {
    public static int solution(int[] A) {
        int Answer = 0;
        ArrayList<Integer> sortPoint = new ArrayList<Integer>();

        sortPoint.add(0);
        for(int i=0; i<A.length-1; i++) {
            if(A[i] != A[i+1]) sortPoint.add(A[i]);
            else if (A[i] == A[i+1]) continue;
        }

        for(int a=0; a<sortPoint.size(); a++) {
            System.out.print(sortPoint.get(a));
        }

        System.out.println("");

        int startPoint = 0;
        for(int i = 1; i<sortPoint.size()-1; i++) {
            if(sortPoint.get(i-1) < sortPoint.get(i) && sortPoint.get(i) > sortPoint.get(i+1)) startPoint = sortPoint.get(i);
        }

        int endPoint =0;
        for(int i = 1; i<sortPoint.size(); i++) {
            if(sortPoint.get(i) >= startPoint) {
                endPoint = sortPoint.get(i);

            }
        }


        return Answer;
    }

    public static void main(String[] args) {

        int[] A = {1,3,2,1,2,1,5,3,3,4,2};
        int a = solution(A);
        System.out.println("");
        System.out.println(a);
    }
}

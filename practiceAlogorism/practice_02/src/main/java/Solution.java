import java.util.Arrays;

/**
 * Created by samsung on 2017-05-29.
 */
public class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int Answer = 0;

        if (A.length == 1) {
            Answer = A[0];
        } else {
            for (int i = 0; i < A.length - 3; i = i + 2) {
                if (A[i] == A[i + 1]) {
                    continue;
                } else if (A[i] != A[i + 1] && i != A.length - 2) {
                    Answer = A[i];
                    break;
                } else if (A[i] != A[i + 1] && i == A.length - 2) {
                    Answer = A[i + 1];
                    break;
                }
            }
        }

        return Answer;
    }
}

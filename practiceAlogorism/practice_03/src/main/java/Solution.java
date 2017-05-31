/**
 * Created by samsung on 2017-05-30.
 */
public class Solution {

    public static int[] solution(int[] A, int K) {
        int[] AnswerList = new int[A.length];

        if (A.length >= K) {
            for (int i = 0; i < A.length; i++) {
                if (i + K < A.length) {
                    AnswerList[i + K] = A[i];
                } else if (i + K >= A.length) {
                    AnswerList[(i + K) - A.length] = A[i];
                }
            }
        } else if(A.length < K) {
            int index = 1;
            while(true) {
                if (K - A.length*index > A.length) index++;
                else break;
            }

            K = K-A.length*index;

            AnswerList = solution(A, K);
        }

        return AnswerList;
    }

    public static void main(String args[]) {
        int[] A = {1,2,3,4,5,6,7,8,9,0};

        int[] B = solution(A, 13);
        for(int i=0; i<B.length; i++) {
            System.out.print(B[i]);
        }
    }
}

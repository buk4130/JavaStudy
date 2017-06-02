/**
 * Created by samsung on 2017-06-01.
 */
public class Solution {

    public static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }

        int l = 0;
        int r = N - 1;

        while (l < r) {
            int m = (l + r + 1) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }

        if (A[l] == X) {
            return l;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 5, 6, 6, 6, 6, 6, 8, 8, 9, 9, 9, 10, 11, 12, 13, 14, 15, 16,50, 100, 300};

        int a = solution(A, 300);

        System.out.print(a);
    }
}

/**
 * Created by samsung on 2017-06-04.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int Answer;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {
            Answer=0;
            int classNum = sc.nextInt();
            int canStudy = sc.nextInt();
            int[] classList = new int[classNum];

            for(int i=0; i<classList.length; i++) {
                classList[i] = sc.nextInt();
            }

            Arrays.sort(classList);

            int index = 1;
            for(int i=classList.length; i>0; i--) {
                if(canStudy == 0) break;
                Answer += classList[classList.length-index];
                canStudy--;
                index++;
            }

            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

}

/**
 * Created by samsung on 2017-06-05.
 */

import java.util.Scanner;

public class Solution {
    static int Answer;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {

            Answer = 0;

            int i = sc.nextInt();
            int j = sc.nextInt();

            for (int a = 0; a <= i; a++) {
                for (int b = 0; b <= j; b++) {
                    Answer += getNumOfCase(a + b, a);
                }
            }

            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }

    public static int getNumOfCase(int num, int select) {
        int caseOfNum;
        int index = select;

        if (num != 0 && select != 0) {
            int upNum = 1;
            int downNum = 1;

            for (int i = 0; i < index; i++) {
                upNum *= num;
                num--;
            }

            for (int i = 0; i < index; i++) {
                downNum *= select;
                select--;
            }

            caseOfNum = upNum / downNum;
        } else caseOfNum = 1;

        return caseOfNum;
    }

}

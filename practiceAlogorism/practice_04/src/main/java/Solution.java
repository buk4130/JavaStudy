import java.util.ArrayList;

/**
 * Created by samsung on 2017-05-30.
 */
public class Solution {
    public static int solution(String S) {
        String[] passwordList = S.split(" ");

        int Answer = 0;

        for (int i = 0; i < passwordList.length; i++) {
            int numIndex = 0;
            int strIndex = 0;
            int[] index = new int[2];
            int tempAnswer = 0;

            String tmp = passwordList[i];
            index = getIndex(tmp);

            numIndex = index[0];
            strIndex = index[1];

            if(numIndex == -1 || strIndex == -1) tempAnswer = -1;
            else if (numIndex % 2 == 1 && strIndex % 2 == 0) tempAnswer = numIndex + strIndex;
            else tempAnswer = -1;

            if(Answer < tempAnswer) Answer = tempAnswer;
            else if(Answer == 0) Answer = -1;

        }

        return Answer;
    }

    public static int[] getIndex(String password) {
        int[] index = {0, 0};

        for (int j = 0; j < password.length(); j++) {
            char check = password.charAt(j);

            if (47 < check && check < 58) index[0]++;
            else if ((64 < check && check < 91) || (96 < check && check < 123)) index[1]++;
            else {
                index[0] = -1;
                index[1] = -1;
                break;
            }
        }

        return index;
    }

    public static void main(String args[]) {
        int a = solution("test 5 a0A pass007 ?xy1");
        System.out.print(a);
    }


}

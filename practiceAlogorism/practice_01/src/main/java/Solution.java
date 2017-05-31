import java.util.ArrayList;

/**
 * Created by samsung on 2017-05-29.
 */
public class Solution {
    public static int solution(int N) {
        ArrayList<Integer> binaryNum = new ArrayList<Integer>();

        while(true) {
            binaryNum.add(N%2);
            N = N/2;
            if(N == 0) break;
        }


        int result = 0;
        int tmp = 0;
        int stratIndex = 0;
        
        for(int j=0; j<binaryNum.size(); j++) {
            if(binaryNum.get(j) == 1){
                stratIndex = j;
                break;
            }
        }
        
        for(int i=stratIndex; i<binaryNum.size(); i++) {
            if(binaryNum.get(i) == 0) {
                tmp++;
            } else if(binaryNum.get(i) != 0 && tmp >= result) {
                result = tmp;
                tmp = 0;
            } else if (binaryNum.get(i) != 0 && result >= tmp) {
                tmp = 0;
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int solution = solution(561892);
        System.out.println(Integer.toBinaryString(561892));
        System.out.print(solution);
    }
}
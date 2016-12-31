package forSolve;

import java.util.ArrayList;

/**
 * Created by seonghohong on 2016. 12. 30..
 */
public class SumNumber {
    public int getresult(ArrayList<Integer> firstMultipleList, ArrayList<Integer> secondMultipleList, ArrayList<Integer> sameNumberList) {

        int sumFirstMultiple = 0;
        int sumSecondMultiple = 0;
        int sumSameNumber = 0;

        for(int i=0; i<firstMultipleList.size(); i++){
            sumFirstMultiple += firstMultipleList.get(i);
        }

        for(int i=0; i<secondMultipleList.size(); i++){
            sumSecondMultiple += firstMultipleList.get(i);
        }

        for(int i=0; i<sameNumberList.size(); i++){
            sumSameNumber += firstMultipleList.get(i);
        }

        int sumResult = 0;

        sumResult = (sumFirstMultiple + sumSecondMultiple) - sumSameNumber;

        return sumResult;
    }
}

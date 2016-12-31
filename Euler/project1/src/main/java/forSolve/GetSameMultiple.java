package forSolve;

import java.util.ArrayList;

/**
 * Created by seonghohong on 2016. 12. 30..
 */
public class GetSameMultiple {

    private ArrayList<Integer> sameNumber;

    public ArrayList<Integer> deleteSameNumber(ArrayList<Integer> firstMultipleList, ArrayList<Integer> secondMultipleList) {

        sameNumber = new ArrayList<Integer>();

        int forj = 0;

        for(int i=0; i<secondMultipleList.size(); i++){
            for(int j=forj; j<firstMultipleList.size(); j++){

                if(firstMultipleList.get(j) < secondMultipleList.get(i)){
                    continue;
                }else if(firstMultipleList.get(j) == secondMultipleList.get(i)){
                    sameNumber.add(firstMultipleList.get(j));
                }
                else {
                    break;
                }

                forj = j;
            }
        }

        return sameNumber;
    }
}

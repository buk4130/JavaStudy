package forSolve;

import java.util.ArrayList;

/**
 * Created by seonghohong on 2016. 12. 30..
 */
public class GetSameMultiple {

    private ArrayList<Integer> sameNumber;

    protected int getSameMultiple(ArrayList<Integer> firstMultipleList, ArrayList<Integer> secondMultipleList){

        int sameMultiple = 0;

        for(int i=0; i<secondMultipleList.size(); i++) {
            for(int j=0; j<firstMultipleList.size(); j++) {

                if(firstMultipleList.get(j) < secondMultipleList.get(i)){
                    continue;
                } else if(secondMultipleList.get(i) < firstMultipleList.get(j)){
                    break;
                } else if(firstMultipleList.get(j) == secondMultipleList.get(i)){
                    sameMultiple = firstMultipleList.get(j);
                    break;
                }
            }

            if (sameMultiple != 0){
                break;
            }
        }

        return sameMultiple;
    }

    public ArrayList<Integer> deleteSameNumber(ArrayList<Integer> firstMultipleList, ArrayList<Integer> secondMultipleList, int inputNumber) {

        sameNumber = new ArrayList<Integer>();
        int sameMultiple = getSameMultiple(firstMultipleList, secondMultipleList);
        

        for(int i=1; i*sameMultiple < inputNumber; i++) {
            sameNumber.add(i*sameMultiple);
        }


        return sameNumber;
    }
}

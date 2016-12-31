package forSolve;

import java.util.ArrayList;

/**
 * Created by seonghohong on 2016. 12. 30..
 */
public class Multiple {

    private ArrayList<Integer> multipleList;

    public ArrayList<Integer> getMultipleList(int inputNumber, int multipleNumber){

        multipleList = new ArrayList<Integer>();

        for(int i=1; i*multipleNumber < inputNumber; i++){

            int multiple = i*multipleNumber;
            multipleList.add(multiple);
        }

        return multipleList;
    }
}

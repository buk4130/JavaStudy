import askView.AskNumber;
import forSolve.GetSameMultiple;
import forSolve.Multiple;
import forSolve.SumNumber;

import java.util.ArrayList;

/**
 * Created by seonghohong on 2016. 12. 29..
 */
public class SolveOrder {


    private AskNumber askInputNumber;
    private AskNumber askFirstMultipleNumber;
    private AskNumber askSecondMultipleNumber;

    private ArrayList<Integer> firstMultipleList;
    private ArrayList<Integer> secondMultipleList;

    private Multiple multiple;

    private GetSameMultiple getSameMultiple;
    private ArrayList<Integer> sameNumberList;

    private SumNumber sumNumber;

    public SolveOrder(AskNumber askInputNumber,
                      AskNumber askFirstMultipleNumber,
                      AskNumber askSecondMultipleNumber,
                      Multiple multiple,
                      GetSameMultiple getSameMultiple,
                      SumNumber sumNumber) {

        this.askInputNumber = askInputNumber;
        this.askFirstMultipleNumber = askFirstMultipleNumber;
        this.askSecondMultipleNumber = askSecondMultipleNumber;
        this.multiple = multiple;
        this.getSameMultiple = getSameMultiple;
        this.sumNumber = sumNumber;

    }


    public void solve(){
        int inputNumber = askInputNumber.getNumber();
        int firstMultipleNumber = askFirstMultipleNumber.getNumber();
        int secondMultipleNumber = askSecondMultipleNumber.getNumber();

        firstMultipleList = new ArrayList<Integer>();
        secondMultipleList = new ArrayList<Integer>();

        firstMultipleList = multiple.getMultipleList(inputNumber, firstMultipleNumber);
        secondMultipleList = multiple.getMultipleList(inputNumber, secondMultipleNumber);

        sameNumberList = new ArrayList<Integer>();

        sameNumberList = getSameMultiple.deleteSameNumber(firstMultipleList, secondMultipleList);

        int result = sumNumber.getresult(firstMultipleList, secondMultipleList, sameNumberList);

        System.out.println("구하시는 답은 : " + result);
    }
}

import askView.AskFirstMultipleNumber;
import askView.AskInputNumber;
import askView.AskNumber;
import askView.AskSecondMultipleNumber;
import forSolve.GetSameMultiple;
import forSolve.Multiple;
import forSolve.SumNumber;

/**
 * Created by seonghohong on 2016. 12. 30..
 */
public class Assembler {

    private SolveOrder solveOrder;

    private AskNumber askInputNumber = new AskInputNumber();
    private AskNumber askFistNumber = new AskFirstMultipleNumber();
    private AskNumber askSecondNumber = new AskSecondMultipleNumber();

    private Multiple multiple = new Multiple();
    private GetSameMultiple getSameMultiple = new GetSameMultiple();
    private SumNumber sumNumber = new SumNumber();

    public void solveWork(){
        solveOrder = new SolveOrder(askInputNumber,
                askFistNumber,
                askSecondNumber,
                multiple,
                getSameMultiple,
                sumNumber);

        solveOrder.solve();

    }
}

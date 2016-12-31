package askView;

import java.util.Scanner;

/**
 * Created by seonghohong on 2016. 12. 29..
 */
public abstract class AskNumber {

    Scanner readInput = new Scanner(System.in);

    public int getNumber() {
        showMessage();

        int number = readNumber();

        return number;
    }

    protected abstract void showMessage();

    protected int readNumber() {

        int inputNumber;

        inputNumber = readInput.nextInt();

        return inputNumber;
    }
}

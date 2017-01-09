/**
 * Created by seonghohong on 2017. 1. 6..
 */
public class Dollar extends Money{

    Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

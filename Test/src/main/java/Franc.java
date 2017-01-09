/**
 * Created by seonghohong on 2017. 1. 7..
 */
public class Franc extends Money{

    Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}

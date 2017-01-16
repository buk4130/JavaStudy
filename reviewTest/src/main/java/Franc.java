/**
 * Created by seonghohong on 2017. 1. 15..
 */
public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount*multiplier);
    }
}

/**
 * Created by seonghohong on 2017. 1. 7..
 */
public class Franc extends Money{

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return currency;
    }
}

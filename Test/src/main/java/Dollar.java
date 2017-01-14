/**
 * Created by seonghohong on 2017. 1. 6..
 */
public class Dollar extends Money{

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return currency;
    }
}

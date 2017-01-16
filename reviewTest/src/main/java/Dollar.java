/**
 * Created by seonghohong on 2017. 1. 14..
 */
public class Dollar extends Money{
    
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplier) {
        return Money.dollar(amount*multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }
}

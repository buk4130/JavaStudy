/**
 * Created by seonghohong on 2017. 1. 15..
 */
public abstract class Money {

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;

        return amount == money.amount && getClass().equals(money.getClass());
    }
}

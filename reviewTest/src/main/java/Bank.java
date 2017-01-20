/**
 * Created by seonghohong on 2017. 1. 18..
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
}

/**
 * Created by seonghohong on 2017. 1. 15..
 */
public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String toString() {
        return amount + " " + currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;

        return amount == money.amount && currency().equals(money.currency());
    }

    public Money times(int multiplier) {
        return new Money (amount*multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}

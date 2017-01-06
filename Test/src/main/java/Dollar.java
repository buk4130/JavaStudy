/**
 * Created by seonghohong on 2017. 1. 6..
 */
public class Dollar {

    int amount = 5*2;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}

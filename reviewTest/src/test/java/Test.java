import static org.junit.Assert.assertEquals;

/**
 * Created by seonghohong on 2017. 1. 14..
 */
public class Test {

    @org.junit.Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}

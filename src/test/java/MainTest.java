import org.junit.Test;
import test.Calculator;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MainTest {

    Calculator calculator = Calculator.instance.get();

    @Test
    public void plusTest() {
        final int original = 7;
        final int result = calculator.plus.apply(3,4);
        assertThat(original, is(equalTo(result)));
    }

    @Test
    public void emptyTest() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, is(not(empty())));
    }
}

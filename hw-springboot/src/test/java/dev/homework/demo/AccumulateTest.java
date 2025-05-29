package dev.homework.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccumulateTest {


    @Test
    public void emptyAccumulateProducesEmptyAccumulation() {
        assertThat(Accumulate.accumulate(new LinkedList<Integer>(), x -> x * x))
                .isEmpty();
    }

    @Test
    public void accumulateSquares() {
        assertThat(Accumulate.accumulate(Arrays.asList(1, 2, 3), x -> x * x))
                .containsExactly(1, 4, 9);
    }

    @Test
    public void accumulateUpperCases() {
        assertThat(Accumulate.accumulate(Arrays.asList("hello", "world"), String::toUpperCase))
                .containsExactly("HELLO", "WORLD");
    }

    @Test
    public void accumulateReversedStrings() {
        assertThat(Accumulate.accumulate(Arrays.asList("the", "quick", "brown", "fox", "etc"), this::reverse))
                .containsExactly("eht", "kciuq", "nworb", "xof", "cte");
    }

    private String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Test
    public void accumulateWithinAccumulate() {
        List<String> input1 = Arrays.asList("a", "b", "c");
        List<String> input2 = Arrays.asList("1", "2", "3");
        assertThat(Accumulate.accumulate(
                input1, c ->
                        String.join(" ", Accumulate.accumulate(input2, d -> c + d))
        )).containsExactly("a1 a2 a3", "b1 b2 b3", "c1 c2 c3");
    }
}
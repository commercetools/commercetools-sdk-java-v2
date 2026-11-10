
package com.commercetools.importapi.models.orders;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ScoreShippingRateInputTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ScoreShippingRateInputBuilder builder) {
        ScoreShippingRateInput scoreShippingRateInput = builder.buildUnchecked();
        Assertions.assertThat(scoreShippingRateInput).isInstanceOf(ScoreShippingRateInput.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "score", ScoreShippingRateInput.builder().score(9L) } };
    }

    @Test
    public void score() {
        ScoreShippingRateInput value = ScoreShippingRateInput.of();
        value.setScore(9L);
        Assertions.assertThat(value.getScore()).isEqualTo(9L);
    }
}

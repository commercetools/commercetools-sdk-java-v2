
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCartScoreShippingRateInputValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCartScoreShippingRateInputValueBuilder builder) {
        SetCartScoreShippingRateInputValue setCartScoreShippingRateInputValue = builder.buildUnchecked();
        Assertions.assertThat(setCartScoreShippingRateInputValue)
                .isInstanceOf(SetCartScoreShippingRateInputValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", SetCartScoreShippingRateInputValue.builder().type("type") },
                new Object[] { "score", SetCartScoreShippingRateInputValue.builder().score(9) } };
    }

    @Test
    public void type() {
        SetCartScoreShippingRateInputValue value = SetCartScoreShippingRateInputValue.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void score() {
        SetCartScoreShippingRateInputValue value = SetCartScoreShippingRateInputValue.of();
        value.setScore(9);
        Assertions.assertThat(value.getScore()).isEqualTo(9);
    }
}


package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangePriceRoundingModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangePriceRoundingModeChangeBuilder builder) {
        ChangePriceRoundingModeChange changePriceRoundingModeChange = builder.buildUnchecked();
        Assertions.assertThat(changePriceRoundingModeChange).isInstanceOf(ChangePriceRoundingModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangePriceRoundingModeChange.builder().change("change") },
                new Object[] { "previousValue", ChangePriceRoundingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "nextValue", ChangePriceRoundingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void change() {
        ChangePriceRoundingModeChange value = ChangePriceRoundingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePriceRoundingModeChange value = ChangePriceRoundingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void nextValue() {
        ChangePriceRoundingModeChange value = ChangePriceRoundingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }
}

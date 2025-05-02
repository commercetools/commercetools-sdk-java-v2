
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTaxRoundingModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTaxRoundingModeChangeBuilder builder) {
        ChangeTaxRoundingModeChange changeTaxRoundingModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeTaxRoundingModeChange).isInstanceOf(ChangeTaxRoundingModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTaxRoundingModeChange.builder().change("change") },
                new Object[] { "previousValue", ChangeTaxRoundingModeChange.builder()
                        .previousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "nextValue", ChangeTaxRoundingModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void change() {
        ChangeTaxRoundingModeChange value = ChangeTaxRoundingModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTaxRoundingModeChange value = ChangeTaxRoundingModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void nextValue() {
        ChangeTaxRoundingModeChange value = ChangeTaxRoundingModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.RoundingMode.findEnum("HalfEven"));
    }
}

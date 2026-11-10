
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTaxCalculationModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTaxCalculationModeChangeBuilder builder) {
        ChangeTaxCalculationModeChange changeTaxCalculationModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeTaxCalculationModeChange).isInstanceOf(ChangeTaxCalculationModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTaxCalculationModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeTaxCalculationModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.TaxCalculationMode
                                        .findEnum("LineItemLevel")) },
                new Object[] { "nextValue", ChangeTaxCalculationModeChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel")) } };
    }

    @Test
    public void change() {
        ChangeTaxCalculationModeChange value = ChangeTaxCalculationModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTaxCalculationModeChange value = ChangeTaxCalculationModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void nextValue() {
        ChangeTaxCalculationModeChange value = ChangeTaxCalculationModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TaxCalculationMode.findEnum("LineItemLevel"));
    }
}

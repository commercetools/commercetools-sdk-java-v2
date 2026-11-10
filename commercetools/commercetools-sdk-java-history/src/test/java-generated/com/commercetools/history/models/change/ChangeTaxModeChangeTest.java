
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTaxModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTaxModeChangeBuilder builder) {
        ChangeTaxModeChange changeTaxModeChange = builder.buildUnchecked();
        Assertions.assertThat(changeTaxModeChange).isInstanceOf(ChangeTaxModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTaxModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeTaxModeChange.builder()
                                .previousValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) },
                new Object[] { "nextValue", ChangeTaxModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        ChangeTaxModeChange value = ChangeTaxModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTaxModeChange value = ChangeTaxModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }

    @Test
    public void nextValue() {
        ChangeTaxModeChange value = ChangeTaxModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}


package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetOrderTotalTaxChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetOrderTotalTaxChangeBuilder builder) {
        SetOrderTotalTaxChange setOrderTotalTaxChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderTotalTaxChange).isInstanceOf(SetOrderTotalTaxChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetOrderTotalTaxChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetOrderTotalTaxChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue",
                        SetOrderTotalTaxChange.builder()
                                .nextValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "taxMode", SetOrderTotalTaxChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetOrderTotalTaxChange value = SetOrderTotalTaxChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderTotalTaxChange value = SetOrderTotalTaxChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        SetOrderTotalTaxChange value = SetOrderTotalTaxChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void taxMode() {
        SetOrderTotalTaxChange value = SetOrderTotalTaxChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}

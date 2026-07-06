
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetOrderTaxedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetOrderTaxedPriceChangeBuilder builder) {
        SetOrderTaxedPriceChange setOrderTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderTaxedPriceChange).isInstanceOf(SetOrderTaxedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetOrderTaxedPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetOrderTaxedPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { "nextValue",
                        SetOrderTaxedPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { "taxMode", SetOrderTaxedPriceChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }

    @Test
    public void nextValue() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }

    @Test
    public void taxMode() {
        SetOrderTaxedPriceChange value = SetOrderTaxedPriceChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}


package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTaxedShippingPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTaxedShippingPriceChangeBuilder builder) {
        SetTaxedShippingPriceChange setTaxedShippingPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setTaxedShippingPriceChange).isInstanceOf(SetTaxedShippingPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTaxedShippingPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetTaxedShippingPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { "nextValue", SetTaxedShippingPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxedPriceImpl()) } };
    }

    @Test
    public void change() {
        SetTaxedShippingPriceChange value = SetTaxedShippingPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTaxedShippingPriceChange value = SetTaxedShippingPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }

    @Test
    public void nextValue() {
        SetTaxedShippingPriceChange value = SetTaxedShippingPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }
}

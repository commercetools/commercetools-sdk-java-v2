
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingInfoTaxedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingInfoTaxedPriceChangeBuilder builder) {
        SetShippingInfoTaxedPriceChange setShippingInfoTaxedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingInfoTaxedPriceChange).isInstanceOf(SetShippingInfoTaxedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingInfoTaxedPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetShippingInfoTaxedPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { "nextValue", SetShippingInfoTaxedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TaxedPriceImpl()) } };
    }

    @Test
    public void change() {
        SetShippingInfoTaxedPriceChange value = SetShippingInfoTaxedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingInfoTaxedPriceChange value = SetShippingInfoTaxedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }

    @Test
    public void nextValue() {
        SetShippingInfoTaxedPriceChange value = SetShippingInfoTaxedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }
}

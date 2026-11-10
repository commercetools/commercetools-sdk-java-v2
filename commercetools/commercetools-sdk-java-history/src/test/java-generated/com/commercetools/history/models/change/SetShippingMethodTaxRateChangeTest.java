
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingMethodTaxRateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingMethodTaxRateChangeBuilder builder) {
        SetShippingMethodTaxRateChange setShippingMethodTaxRateChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodTaxRateChange).isInstanceOf(SetShippingMethodTaxRateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingMethodTaxRateChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetShippingMethodTaxRateChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "nextValue",
                        SetShippingMethodTaxRateChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "taxMode", SetShippingMethodTaxRateChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void taxMode() {
        SetShippingMethodTaxRateChange value = SetShippingMethodTaxRateChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}

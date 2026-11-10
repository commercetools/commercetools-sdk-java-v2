
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingMethodTaxAmountChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingMethodTaxAmountChangeBuilder builder) {
        SetShippingMethodTaxAmountChange setShippingMethodTaxAmountChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodTaxAmountChange).isInstanceOf(SetShippingMethodTaxAmountChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingMethodTaxAmountChange.builder().change("change") },
                new Object[] { "previousValue", SetShippingMethodTaxAmountChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl()) },
                new Object[] { "nextValue", SetShippingMethodTaxAmountChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl()) },
                new Object[] { "taxMode", SetShippingMethodTaxAmountChange.builder()
                        .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) } };
    }

    @Test
    public void change() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setPreviousValue(
            new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueImpl());
    }

    @Test
    public void taxMode() {
        SetShippingMethodTaxAmountChange value = SetShippingMethodTaxAmountChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }
}

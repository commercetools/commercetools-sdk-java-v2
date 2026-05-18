
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeTaxCategoryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeTaxCategoryChangeBuilder builder) {
        ShippingMethodChangeTaxCategoryChange shippingMethodChangeTaxCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeTaxCategoryChange)
                .isInstanceOf(ShippingMethodChangeTaxCategoryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodChangeTaxCategoryChange.builder().change("change") },
                new Object[] { "previousValue",
                        ShippingMethodChangeTaxCategoryChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "nextValue", ShippingMethodChangeTaxCategoryChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodChangeTaxCategoryChange value = ShippingMethodChangeTaxCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodChangeTaxCategoryChange value = ShippingMethodChangeTaxCategoryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        ShippingMethodChangeTaxCategoryChange value = ShippingMethodChangeTaxCategoryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}

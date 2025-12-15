
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetCustomTypeChangeBuilder builder) {
        ShippingMethodSetCustomTypeChange shippingMethodSetCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetCustomTypeChange).isInstanceOf(ShippingMethodSetCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ShippingMethodSetCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        ShippingMethodSetCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", ShippingMethodSetCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodSetCustomTypeChange value = ShippingMethodSetCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodSetCustomTypeChange value = ShippingMethodSetCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        ShippingMethodSetCustomTypeChange value = ShippingMethodSetCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}


package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetLocalizedDescriptionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetLocalizedDescriptionChangeBuilder builder) {
        ShippingMethodSetLocalizedDescriptionChange shippingMethodSetLocalizedDescriptionChange = builder
                .buildUnchecked();
        Assertions.assertThat(shippingMethodSetLocalizedDescriptionChange)
                .isInstanceOf(ShippingMethodSetLocalizedDescriptionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodSetLocalizedDescriptionChange.builder().change("change") },
                new Object[] { "previousValue",
                        ShippingMethodSetLocalizedDescriptionChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue", ShippingMethodSetLocalizedDescriptionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodSetLocalizedDescriptionChange value = ShippingMethodSetLocalizedDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodSetLocalizedDescriptionChange value = ShippingMethodSetLocalizedDescriptionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ShippingMethodSetLocalizedDescriptionChange value = ShippingMethodSetLocalizedDescriptionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}

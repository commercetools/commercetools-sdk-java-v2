
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetLocalizedNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetLocalizedNameChangeBuilder builder) {
        ShippingMethodSetLocalizedNameChange shippingMethodSetLocalizedNameChange = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetLocalizedNameChange)
                .isInstanceOf(ShippingMethodSetLocalizedNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ShippingMethodSetLocalizedNameChange.builder().change("change") },
                new Object[] { "previousValue",
                        ShippingMethodSetLocalizedNameChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue", ShippingMethodSetLocalizedNameChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void change() {
        ShippingMethodSetLocalizedNameChange value = ShippingMethodSetLocalizedNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ShippingMethodSetLocalizedNameChange value = ShippingMethodSetLocalizedNameChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ShippingMethodSetLocalizedNameChange value = ShippingMethodSetLocalizedNameChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}

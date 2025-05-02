
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCartClassificationShippingRateInputValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCartClassificationShippingRateInputValueBuilder builder) {
        SetCartClassificationShippingRateInputValue setCartClassificationShippingRateInputValue = builder
                .buildUnchecked();
        Assertions.assertThat(setCartClassificationShippingRateInputValue)
                .isInstanceOf(SetCartClassificationShippingRateInputValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type", SetCartClassificationShippingRateInputValue.builder().type("type") },
                new Object[] { "key", SetCartClassificationShippingRateInputValue.builder().key("key") },
                new Object[] { "label", SetCartClassificationShippingRateInputValue.builder()
                        .label(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void type() {
        SetCartClassificationShippingRateInputValue value = SetCartClassificationShippingRateInputValue.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void key() {
        SetCartClassificationShippingRateInputValue value = SetCartClassificationShippingRateInputValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        SetCartClassificationShippingRateInputValue value = SetCartClassificationShippingRateInputValue.of();
        value.setLabel(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}


package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetLocalizedDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetLocalizedDescriptionActionBuilder builder) {
        ShippingMethodSetLocalizedDescriptionAction shippingMethodSetLocalizedDescriptionAction = builder
                .buildUnchecked();
        Assertions.assertThat(shippingMethodSetLocalizedDescriptionAction)
                .isInstanceOf(ShippingMethodSetLocalizedDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "localizedDescription", ShippingMethodSetLocalizedDescriptionAction.builder()
                        .localizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void localizedDescription() {
        ShippingMethodSetLocalizedDescriptionAction value = ShippingMethodSetLocalizedDescriptionAction.of();
        value.setLocalizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}


package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetLocalizedNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetLocalizedNameActionBuilder builder) {
        ShippingMethodSetLocalizedNameAction shippingMethodSetLocalizedNameAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetLocalizedNameAction)
                .isInstanceOf(ShippingMethodSetLocalizedNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "localizedName", ShippingMethodSetLocalizedNameAction.builder()
                .localizedName(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void localizedName() {
        ShippingMethodSetLocalizedNameAction value = ShippingMethodSetLocalizedNameAction.of();
        value.setLocalizedName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}

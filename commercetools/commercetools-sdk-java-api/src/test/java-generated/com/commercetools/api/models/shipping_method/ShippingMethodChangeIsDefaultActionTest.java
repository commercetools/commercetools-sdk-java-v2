
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeIsDefaultActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeIsDefaultActionBuilder builder) {
        ShippingMethodChangeIsDefaultAction shippingMethodChangeIsDefaultAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeIsDefaultAction)
                .isInstanceOf(ShippingMethodChangeIsDefaultAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isDefault", ShippingMethodChangeIsDefaultAction.builder().isDefault(true) } };
    }

    @Test
    public void isDefault() {
        ShippingMethodChangeIsDefaultAction value = ShippingMethodChangeIsDefaultAction.of();
        value.setIsDefault(true);
        Assertions.assertThat(value.getIsDefault()).isEqualTo(true);
    }
}

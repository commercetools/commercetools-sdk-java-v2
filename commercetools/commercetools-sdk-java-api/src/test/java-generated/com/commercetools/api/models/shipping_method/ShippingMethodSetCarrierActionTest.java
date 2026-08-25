
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSetCarrierActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSetCarrierActionBuilder builder) {
        ShippingMethodSetCarrierAction shippingMethodSetCarrierAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetCarrierAction).isInstanceOf(ShippingMethodSetCarrierAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "carrier", ShippingMethodSetCarrierAction.builder().carrier("carrier") } };
    }

    @Test
    public void carrier() {
        ShippingMethodSetCarrierAction value = ShippingMethodSetCarrierAction.of();
        value.setCarrier("carrier");
        Assertions.assertThat(value.getCarrier()).isEqualTo("carrier");
    }
}

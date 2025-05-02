
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShippingRateInputSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShippingRateInputSetMessagePayloadBuilder builder) {
        OrderShippingRateInputSetMessagePayload orderShippingRateInputSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShippingRateInputSetMessagePayload)
                .isInstanceOf(OrderShippingRateInputSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingRateInput",
                        OrderShippingRateInputSetMessagePayload.builder()
                                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { "oldShippingRateInput", OrderShippingRateInputSetMessagePayload.builder()
                        .oldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        OrderShippingRateInputSetMessagePayload value = OrderShippingRateInputSetMessagePayload.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void oldShippingRateInput() {
        OrderShippingRateInputSetMessagePayload value = OrderShippingRateInputSetMessagePayload.of();
        value.setOldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getOldShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }
}

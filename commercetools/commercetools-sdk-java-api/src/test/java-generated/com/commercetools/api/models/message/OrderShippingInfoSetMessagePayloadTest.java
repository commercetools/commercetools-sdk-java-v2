
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShippingInfoSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShippingInfoSetMessagePayloadBuilder builder) {
        OrderShippingInfoSetMessagePayload orderShippingInfoSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShippingInfoSetMessagePayload)
                .isInstanceOf(OrderShippingInfoSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingInfo",
                        OrderShippingInfoSetMessagePayload.builder()
                                .shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { "oldShippingInfo", OrderShippingInfoSetMessagePayload.builder()
                        .oldShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) } };
    }

    @Test
    public void shippingInfo() {
        OrderShippingInfoSetMessagePayload value = OrderShippingInfoSetMessagePayload.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void oldShippingInfo() {
        OrderShippingInfoSetMessagePayload value = OrderShippingInfoSetMessagePayload.of();
        value.setOldShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getOldShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }
}

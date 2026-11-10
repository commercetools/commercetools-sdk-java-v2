
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShippingInfoSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShippingInfoSetMessageBuilder builder) {
        OrderShippingInfoSetMessage orderShippingInfoSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderShippingInfoSetMessage).isInstanceOf(OrderShippingInfoSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingInfo",
                        OrderShippingInfoSetMessage.builder()
                                .shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { "oldShippingInfo", OrderShippingInfoSetMessage.builder()
                        .oldShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) } };
    }

    @Test
    public void shippingInfo() {
        OrderShippingInfoSetMessage value = OrderShippingInfoSetMessage.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void oldShippingInfo() {
        OrderShippingInfoSetMessage value = OrderShippingInfoSetMessage.of();
        value.setOldShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getOldShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }
}

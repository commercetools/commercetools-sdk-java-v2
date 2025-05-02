
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShippingRateInputSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShippingRateInputSetMessageBuilder builder) {
        OrderShippingRateInputSetMessage orderShippingRateInputSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderShippingRateInputSetMessage).isInstanceOf(OrderShippingRateInputSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingRateInput",
                        OrderShippingRateInputSetMessage.builder()
                                .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] { "oldShippingRateInput", OrderShippingRateInputSetMessage.builder()
                        .oldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) } };
    }

    @Test
    public void shippingRateInput() {
        OrderShippingRateInputSetMessage value = OrderShippingRateInputSetMessage.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void oldShippingRateInput() {
        OrderShippingRateInputSetMessage value = OrderShippingRateInputSetMessage.of();
        value.setOldShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getOldShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }
}

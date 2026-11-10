
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemAddedMessagePayloadBuilder builder) {
        OrderCustomLineItemAddedMessagePayload orderCustomLineItemAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemAddedMessagePayload)
                .isInstanceOf(OrderCustomLineItemAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customLineItem", OrderCustomLineItemAddedMessagePayload.builder()
                .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemAddedMessagePayload value = OrderCustomLineItemAddedMessagePayload.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}

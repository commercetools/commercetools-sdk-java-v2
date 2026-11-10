
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemAddedMessageBuilder builder) {
        OrderCustomLineItemAddedMessage orderCustomLineItemAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemAddedMessage).isInstanceOf(OrderCustomLineItemAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customLineItem", OrderCustomLineItemAddedMessage.builder()
                .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemAddedMessage value = OrderCustomLineItemAddedMessage.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}

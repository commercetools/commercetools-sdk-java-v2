
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemRemovedMessageBuilder builder) {
        OrderCustomLineItemRemovedMessage orderCustomLineItemRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemRemovedMessage).isInstanceOf(OrderCustomLineItemRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderCustomLineItemRemovedMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderCustomLineItemRemovedMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "customLineItem", OrderCustomLineItemRemovedMessage.builder()
                        .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemRemovedMessage value = OrderCustomLineItemRemovedMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemRemovedMessage value = OrderCustomLineItemRemovedMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemRemovedMessage value = OrderCustomLineItemRemovedMessage.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}

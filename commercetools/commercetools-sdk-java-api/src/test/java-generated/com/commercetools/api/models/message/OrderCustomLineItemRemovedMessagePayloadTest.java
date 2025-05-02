
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemRemovedMessagePayloadBuilder builder) {
        OrderCustomLineItemRemovedMessagePayload orderCustomLineItemRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemRemovedMessagePayload)
                .isInstanceOf(OrderCustomLineItemRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderCustomLineItemRemovedMessagePayload.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderCustomLineItemRemovedMessagePayload.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "customLineItem", OrderCustomLineItemRemovedMessagePayload.builder()
                        .customLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemRemovedMessagePayload value = OrderCustomLineItemRemovedMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemRemovedMessagePayload value = OrderCustomLineItemRemovedMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void customLineItem() {
        OrderCustomLineItemRemovedMessagePayload value = OrderCustomLineItemRemovedMessagePayload.of();
        value.setCustomLineItem(new com.commercetools.api.models.cart.CustomLineItemImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.api.models.cart.CustomLineItemImpl());
    }
}

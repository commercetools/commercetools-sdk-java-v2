
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemQuantityChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder) {
        OrderCustomLineItemQuantityChangedMessagePayload orderCustomLineItemQuantityChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderCustomLineItemQuantityChangedMessagePayload)
                .isInstanceOf(OrderCustomLineItemQuantityChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderCustomLineItemQuantityChangedMessagePayload.builder()
                                .customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderCustomLineItemQuantityChangedMessagePayload.builder()
                                .customLineItemKey("customLineItemKey") },
                new Object[] { "quantity", OrderCustomLineItemQuantityChangedMessagePayload.builder().quantity(8L) },
                new Object[] { "oldQuantity",
                        OrderCustomLineItemQuantityChangedMessagePayload.builder().oldQuantity(2L) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void oldQuantity() {
        OrderCustomLineItemQuantityChangedMessagePayload value = OrderCustomLineItemQuantityChangedMessagePayload.of();
        value.setOldQuantity(2L);
        Assertions.assertThat(value.getOldQuantity()).isEqualTo(2L);
    }
}

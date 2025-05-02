
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemQuantityChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemQuantityChangedMessageBuilder builder) {
        OrderCustomLineItemQuantityChangedMessage orderCustomLineItemQuantityChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemQuantityChangedMessage)
                .isInstanceOf(OrderCustomLineItemQuantityChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderCustomLineItemQuantityChangedMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderCustomLineItemQuantityChangedMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "quantity", OrderCustomLineItemQuantityChangedMessage.builder().quantity(8L) },
                new Object[] { "oldQuantity", OrderCustomLineItemQuantityChangedMessage.builder().oldQuantity(2L) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void oldQuantity() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setOldQuantity(2L);
        Assertions.assertThat(value.getOldQuantity()).isEqualTo(2L);
    }
}

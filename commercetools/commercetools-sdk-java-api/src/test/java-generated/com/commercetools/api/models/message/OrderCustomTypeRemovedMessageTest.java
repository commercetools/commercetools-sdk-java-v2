
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomTypeRemovedMessageBuilder builder) {
        OrderCustomTypeRemovedMessage orderCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomTypeRemovedMessage).isInstanceOf(OrderCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "previousTypeId",
                OrderCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        OrderCustomTypeRemovedMessage value = OrderCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}


package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomFieldRemovedMessageBuilder builder) {
        OrderCustomFieldRemovedMessage orderCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldRemovedMessage).isInstanceOf(OrderCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        OrderCustomFieldRemovedMessage value = OrderCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}


package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomFieldAddedMessageBuilder builder) {
        OrderCustomFieldAddedMessage orderCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldAddedMessage).isInstanceOf(OrderCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", OrderCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderCustomFieldAddedMessage value = OrderCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldAddedMessage value = OrderCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}

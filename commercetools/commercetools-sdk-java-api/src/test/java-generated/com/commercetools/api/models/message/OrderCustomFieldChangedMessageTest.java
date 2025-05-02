
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomFieldChangedMessageBuilder builder) {
        OrderCustomFieldChangedMessage orderCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldChangedMessage).isInstanceOf(OrderCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", OrderCustomFieldChangedMessage.builder().value("value") }, new Object[] {
                        "previousValue", OrderCustomFieldChangedMessage.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        OrderCustomFieldChangedMessage value = OrderCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldChangedMessage value = OrderCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        OrderCustomFieldChangedMessage value = OrderCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}

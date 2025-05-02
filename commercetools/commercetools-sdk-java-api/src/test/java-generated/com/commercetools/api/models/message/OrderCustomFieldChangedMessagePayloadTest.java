
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomFieldChangedMessagePayloadBuilder builder) {
        OrderCustomFieldChangedMessagePayload orderCustomFieldChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldChangedMessagePayload)
                .isInstanceOf(OrderCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", OrderCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "previousValue",
                        OrderCustomFieldChangedMessagePayload.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        OrderCustomFieldChangedMessagePayload value = OrderCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldChangedMessagePayload value = OrderCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        OrderCustomFieldChangedMessagePayload value = OrderCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}

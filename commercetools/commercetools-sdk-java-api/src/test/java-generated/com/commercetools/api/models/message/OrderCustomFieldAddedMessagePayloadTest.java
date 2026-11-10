
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomFieldAddedMessagePayloadBuilder builder) {
        OrderCustomFieldAddedMessagePayload orderCustomFieldAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldAddedMessagePayload)
                .isInstanceOf(OrderCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", OrderCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderCustomFieldAddedMessagePayload value = OrderCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldAddedMessagePayload value = OrderCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}

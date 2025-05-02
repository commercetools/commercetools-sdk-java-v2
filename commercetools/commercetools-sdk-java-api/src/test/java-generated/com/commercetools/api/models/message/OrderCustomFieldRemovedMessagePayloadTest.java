
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomFieldRemovedMessagePayloadBuilder builder) {
        OrderCustomFieldRemovedMessagePayload orderCustomFieldRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldRemovedMessagePayload)
                .isInstanceOf(OrderCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", OrderCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        OrderCustomFieldRemovedMessagePayload value = OrderCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}

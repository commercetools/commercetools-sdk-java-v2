
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryItemBuilder builder) {
        DeliveryItem deliveryItem = builder.buildUnchecked();
        Assertions.assertThat(deliveryItem).isInstanceOf(DeliveryItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", DeliveryItem.builder().id("id") },
                new Object[] { "quantity", DeliveryItem.builder().quantity(8) } };
    }

    @Test
    public void id() {
        DeliveryItem value = DeliveryItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void quantity() {
        DeliveryItem value = DeliveryItem.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }
}

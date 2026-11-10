
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemReturnItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemReturnItemBuilder builder) {
        CustomLineItemReturnItem customLineItemReturnItem = builder.buildUnchecked();
        Assertions.assertThat(customLineItemReturnItem).isInstanceOf(CustomLineItemReturnItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomLineItemReturnItem.builder().key("key") },
                new Object[] { "customLineItemId",
                        CustomLineItemReturnItem.builder().customLineItemId("customLineItemId") },
                new Object[] { "quantity", CustomLineItemReturnItem.builder().quantity(8L) } };
    }

    @Test
    public void key() {
        CustomLineItemReturnItem value = CustomLineItemReturnItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customLineItemId() {
        CustomLineItemReturnItem value = CustomLineItemReturnItem.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void quantity() {
        CustomLineItemReturnItem value = CustomLineItemReturnItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}

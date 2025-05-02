
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemReturnItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemReturnItemBuilder builder) {
        LineItemReturnItem lineItemReturnItem = builder.buildUnchecked();
        Assertions.assertThat(lineItemReturnItem).isInstanceOf(LineItemReturnItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", LineItemReturnItem.builder().key("key") },
                new Object[] { "lineItemId", LineItemReturnItem.builder().lineItemId("lineItemId") },
                new Object[] { "quantity", LineItemReturnItem.builder().quantity(8L) } };
    }

    @Test
    public void key() {
        LineItemReturnItem value = LineItemReturnItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void lineItemId() {
        LineItemReturnItem value = LineItemReturnItem.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void quantity() {
        LineItemReturnItem value = LineItemReturnItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}

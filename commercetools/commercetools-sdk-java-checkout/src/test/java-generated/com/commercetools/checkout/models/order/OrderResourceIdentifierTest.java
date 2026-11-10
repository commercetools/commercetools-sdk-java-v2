
package com.commercetools.checkout.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderResourceIdentifierBuilder builder) {
        OrderResourceIdentifier orderResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(orderResourceIdentifier).isInstanceOf(OrderResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", OrderResourceIdentifier.builder().id("id") },
                new Object[] { "key", OrderResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        OrderResourceIdentifier value = OrderResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        OrderResourceIdentifier value = OrderResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}

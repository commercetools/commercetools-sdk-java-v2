
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditResourceIdentifierBuilder builder) {
        OrderEditResourceIdentifier orderEditResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(orderEditResourceIdentifier).isInstanceOf(OrderEditResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", OrderEditResourceIdentifier.builder().id("id") },
                new Object[] { "key", OrderEditResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        OrderEditResourceIdentifier value = OrderEditResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        OrderEditResourceIdentifier value = OrderEditResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}

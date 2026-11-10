
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartResourceIdentifierBuilder builder) {
        CartResourceIdentifier cartResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(cartResourceIdentifier).isInstanceOf(CartResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartResourceIdentifier.builder().id("id") },
                new Object[] { "key", CartResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CartResourceIdentifier value = CartResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CartResourceIdentifier value = CartResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}

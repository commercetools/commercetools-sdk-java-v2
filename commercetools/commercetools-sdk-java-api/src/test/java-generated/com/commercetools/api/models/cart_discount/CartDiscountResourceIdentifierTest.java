
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountResourceIdentifierBuilder builder) {
        CartDiscountResourceIdentifier cartDiscountResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountResourceIdentifier).isInstanceOf(CartDiscountResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartDiscountResourceIdentifier.builder().id("id") },
                new Object[] { "key", CartDiscountResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CartDiscountResourceIdentifier value = CartDiscountResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CartDiscountResourceIdentifier value = CartDiscountResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}


package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountKeyReferenceBuilder builder) {
        CartDiscountKeyReference cartDiscountKeyReference = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountKeyReference).isInstanceOf(CartDiscountKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CartDiscountKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        CartDiscountKeyReference value = CartDiscountKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}

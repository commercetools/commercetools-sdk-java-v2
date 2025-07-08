
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartKeyReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartKeyReferenceBuilder builder) {
        CartKeyReference cartKeyReference = builder.buildUnchecked();
        Assertions.assertThat(cartKeyReference).isInstanceOf(CartKeyReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CartKeyReference.builder().key("key") } };
    }

    @Test
    public void key() {
        CartKeyReference value = CartKeyReference.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}


package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountReferenceBuilder builder) {
        CartDiscountReference cartDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountReference).isInstanceOf(CartDiscountReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartDiscountReference.builder().id("id") } };
    }

    @Test
    public void id() {
        CartDiscountReference value = CartDiscountReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}

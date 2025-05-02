
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueRelativeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueRelativeBuilder builder) {
        CartDiscountValueRelative cartDiscountValueRelative = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueRelative).isInstanceOf(CartDiscountValueRelative.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permyriad", CartDiscountValueRelative.builder().permyriad(1L) } };
    }

    @Test
    public void permyriad() {
        CartDiscountValueRelative value = CartDiscountValueRelative.of();
        value.setPermyriad(1L);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1L);
    }
}

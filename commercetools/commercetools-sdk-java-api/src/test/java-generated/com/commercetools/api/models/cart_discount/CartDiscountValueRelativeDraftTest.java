
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueRelativeDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueRelativeDraftBuilder builder) {
        CartDiscountValueRelativeDraft cartDiscountValueRelativeDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueRelativeDraft).isInstanceOf(CartDiscountValueRelativeDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "permyriad", CartDiscountValueRelativeDraft.builder().permyriad(1L) },
                new Object[] { "applicationMode",
                        CartDiscountValueRelativeDraft.builder()
                                .applicationMode(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                                        .findEnum("ProportionateDistribution")) } };
    }

    @Test
    public void permyriad() {
        CartDiscountValueRelativeDraft value = CartDiscountValueRelativeDraft.of();
        value.setPermyriad(1L);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1L);
    }

    @Test
    public void applicationMode() {
        CartDiscountValueRelativeDraft value = CartDiscountValueRelativeDraft.of();
        value.setApplicationMode(
            com.commercetools.api.models.cart_discount.DiscountApplicationMode.findEnum("ProportionateDistribution"));
        Assertions.assertThat(value.getApplicationMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                        .findEnum("ProportionateDistribution"));
    }
}

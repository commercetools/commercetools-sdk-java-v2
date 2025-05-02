
package com.commercetools.api.models.discount_code;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeChangeCartDiscountsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeChangeCartDiscountsActionBuilder builder) {
        DiscountCodeChangeCartDiscountsAction discountCodeChangeCartDiscountsAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeChangeCartDiscountsAction)
                .isInstanceOf(DiscountCodeChangeCartDiscountsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartDiscounts",
                DiscountCodeChangeCartDiscountsAction.builder()
                        .cartDiscounts(Collections.singletonList(
                            new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl())) } };
    }

    @Test
    public void cartDiscounts() {
        DiscountCodeChangeCartDiscountsAction value = DiscountCodeChangeCartDiscountsAction.of();
        value.setCartDiscounts(Collections
                .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl()));
        Assertions.assertThat(value.getCartDiscounts())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifierImpl()));
    }
}

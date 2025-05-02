
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemoveDiscountCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemoveDiscountCodeActionBuilder builder) {
        CartRemoveDiscountCodeAction cartRemoveDiscountCodeAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveDiscountCodeAction).isInstanceOf(CartRemoveDiscountCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCode", CartRemoveDiscountCodeAction.builder()
                .discountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl()) } };
    }

    @Test
    public void discountCode() {
        CartRemoveDiscountCodeAction value = CartRemoveDiscountCodeAction.of();
        value.setDiscountCode(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
        Assertions.assertThat(value.getDiscountCode())
                .isEqualTo(new com.commercetools.api.models.discount_code.DiscountCodeReferenceImpl());
    }
}

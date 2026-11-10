
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRecalculateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRecalculateActionBuilder builder) {
        CartRecalculateAction cartRecalculateAction = builder.buildUnchecked();
        Assertions.assertThat(cartRecalculateAction).isInstanceOf(CartRecalculateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "updateProductData", CartRecalculateAction.builder().updateProductData(true) } };
    }

    @Test
    public void updateProductData() {
        CartRecalculateAction value = CartRecalculateAction.of();
        value.setUpdateProductData(true);
        Assertions.assertThat(value.getUpdateProductData()).isEqualTo(true);
    }
}

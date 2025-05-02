
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountChangeIsActiveActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountChangeIsActiveActionBuilder builder) {
        ProductDiscountChangeIsActiveAction productDiscountChangeIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangeIsActiveAction)
                .isInstanceOf(ProductDiscountChangeIsActiveAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isActive", ProductDiscountChangeIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        ProductDiscountChangeIsActiveAction value = ProductDiscountChangeIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}

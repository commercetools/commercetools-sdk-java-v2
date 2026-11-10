
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueAbsoluteTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueAbsoluteBuilder builder) {
        CartDiscountValueAbsolute cartDiscountValueAbsolute = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueAbsolute).isInstanceOf(CartDiscountValueAbsolute.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "money",
                        CartDiscountValueAbsolute.builder()
                                .money(Collections.singletonList(
                                    new com.commercetools.api.models.common.CentPrecisionMoneyImpl())) },
                new Object[] { "applicationMode",
                        CartDiscountValueAbsolute.builder()
                                .applicationMode(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                                        .findEnum("ProportionateDistribution")) } };
    }

    @Test
    public void money() {
        CartDiscountValueAbsolute value = CartDiscountValueAbsolute.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()));
    }

    @Test
    public void applicationMode() {
        CartDiscountValueAbsolute value = CartDiscountValueAbsolute.of();
        value.setApplicationMode(
            com.commercetools.api.models.cart_discount.DiscountApplicationMode.findEnum("ProportionateDistribution"));
        Assertions.assertThat(value.getApplicationMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                        .findEnum("ProportionateDistribution"));
    }
}

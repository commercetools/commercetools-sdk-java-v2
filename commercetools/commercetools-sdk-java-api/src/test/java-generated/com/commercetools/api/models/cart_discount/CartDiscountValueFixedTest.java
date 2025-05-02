
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueFixedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueFixedBuilder builder) {
        CartDiscountValueFixed cartDiscountValueFixed = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueFixed).isInstanceOf(CartDiscountValueFixed.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "money",
                        CartDiscountValueFixed.builder()
                                .money(Collections
                                        .singletonList(new com.commercetools.api.models.common.TypedMoneyImpl())) },
                new Object[] { "applicationMode",
                        CartDiscountValueFixed.builder()
                                .applicationMode(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                                        .findEnum("ProportionateDistribution")) } };
    }

    @Test
    public void money() {
        CartDiscountValueFixed value = CartDiscountValueFixed.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.TypedMoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.TypedMoneyImpl()));
    }

    @Test
    public void applicationMode() {
        CartDiscountValueFixed value = CartDiscountValueFixed.of();
        value.setApplicationMode(
            com.commercetools.api.models.cart_discount.DiscountApplicationMode.findEnum("ProportionateDistribution"));
        Assertions.assertThat(value.getApplicationMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.DiscountApplicationMode
                        .findEnum("ProportionateDistribution"));
    }
}

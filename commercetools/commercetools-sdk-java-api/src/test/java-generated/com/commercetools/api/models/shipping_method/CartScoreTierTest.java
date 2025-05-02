
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartScoreTierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartScoreTierBuilder builder) {
        CartScoreTier cartScoreTier = builder.buildUnchecked();
        Assertions.assertThat(cartScoreTier).isInstanceOf(CartScoreTier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "score", CartScoreTier.builder().score(9) },
                new Object[] { "price",
                        CartScoreTier.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "priceFunction",
                        CartScoreTier.builder()
                                .priceFunction(new com.commercetools.api.models.shipping_method.PriceFunctionImpl()) },
                new Object[] { "isMatching", CartScoreTier.builder().isMatching(true) } };
    }

    @Test
    public void score() {
        CartScoreTier value = CartScoreTier.of();
        value.setScore(9);
        Assertions.assertThat(value.getScore()).isEqualTo(9);
    }

    @Test
    public void price() {
        CartScoreTier value = CartScoreTier.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void priceFunction() {
        CartScoreTier value = CartScoreTier.of();
        value.setPriceFunction(new com.commercetools.api.models.shipping_method.PriceFunctionImpl());
        Assertions.assertThat(value.getPriceFunction())
                .isEqualTo(new com.commercetools.api.models.shipping_method.PriceFunctionImpl());
    }

    @Test
    public void isMatching() {
        CartScoreTier value = CartScoreTier.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }
}

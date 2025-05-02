
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartValueTierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartValueTierBuilder builder) {
        CartValueTier cartValueTier = builder.buildUnchecked();
        Assertions.assertThat(cartValueTier).isInstanceOf(CartValueTier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "minimumCentAmount", CartValueTier.builder().minimumCentAmount(3L) },
                new Object[] { "price",
                        CartValueTier.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "isMatching", CartValueTier.builder().isMatching(true) } };
    }

    @Test
    public void minimumCentAmount() {
        CartValueTier value = CartValueTier.of();
        value.setMinimumCentAmount(3L);
        Assertions.assertThat(value.getMinimumCentAmount()).isEqualTo(3L);
    }

    @Test
    public void price() {
        CartValueTier value = CartValueTier.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void isMatching() {
        CartValueTier value = CartValueTier.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }
}

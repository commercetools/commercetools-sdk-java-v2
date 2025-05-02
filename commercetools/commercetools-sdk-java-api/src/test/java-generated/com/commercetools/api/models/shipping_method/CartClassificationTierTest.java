
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartClassificationTierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartClassificationTierBuilder builder) {
        CartClassificationTier cartClassificationTier = builder.buildUnchecked();
        Assertions.assertThat(cartClassificationTier).isInstanceOf(CartClassificationTier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", CartClassificationTier.builder().value("value") },
                new Object[] { "price",
                        CartClassificationTier.builder().price(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "isMatching", CartClassificationTier.builder().isMatching(true) } };
    }

    @Test
    public void value() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void price() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void isMatching() {
        CartClassificationTier value = CartClassificationTier.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }
}


package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PriceTierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PriceTierBuilder builder) {
        PriceTier priceTier = builder.buildUnchecked();
        Assertions.assertThat(priceTier).isInstanceOf(PriceTier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "minimumQuantity", PriceTier.builder().minimumQuantity(1L) },
                new Object[] { "value",
                        PriceTier.builder().value(new com.commercetools.history.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void minimumQuantity() {
        PriceTier value = PriceTier.of();
        value.setMinimumQuantity(1L);
        Assertions.assertThat(value.getMinimumQuantity()).isEqualTo(1L);
    }

    @Test
    public void value() {
        PriceTier value = PriceTier.of();
        value.setValue(new com.commercetools.history.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.history.models.common.TypedMoneyImpl());
    }
}

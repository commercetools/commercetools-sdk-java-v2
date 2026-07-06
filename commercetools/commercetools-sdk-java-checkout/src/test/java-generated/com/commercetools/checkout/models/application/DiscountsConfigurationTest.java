
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountsConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountsConfigurationBuilder builder) {
        DiscountsConfiguration discountsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(discountsConfiguration).isInstanceOf(DiscountsConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "allowDiscounts", DiscountsConfiguration.builder().allowDiscounts(true) } };
    }

    @Test
    public void allowDiscounts() {
        DiscountsConfiguration value = DiscountsConfiguration.of();
        value.setAllowDiscounts(true);
        Assertions.assertThat(value.getAllowDiscounts()).isEqualTo(true);
    }
}

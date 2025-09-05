
package com.commercetools.checkout.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AmountTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AmountBuilder builder) {
        Amount amount = builder.buildUnchecked();
        Assertions.assertThat(amount).isInstanceOf(Amount.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "centAmount", Amount.builder().centAmount(3) },
                new Object[] { "currencyCode", Amount.builder().currencyCode("currencyCode") } };
    }

    @Test
    public void centAmount() {
        Amount value = Amount.of();
        value.setCentAmount(3);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3);
    }

    @Test
    public void currencyCode() {
        Amount value = Amount.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }
}

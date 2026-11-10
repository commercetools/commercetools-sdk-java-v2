
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MoneyBuilder builder) {
        Money money = builder.buildUnchecked();
        Assertions.assertThat(money).isInstanceOf(Money.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "centAmount", Money.builder().centAmount(3L) },
                new Object[] { "currencyCode", Money.builder().currencyCode("currencyCode") } };
    }

    @Test
    public void centAmount() {
        Money value = Money.of();
        value.setCentAmount(3L);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3L);
    }

    @Test
    public void currencyCode() {
        Money value = Money.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }
}

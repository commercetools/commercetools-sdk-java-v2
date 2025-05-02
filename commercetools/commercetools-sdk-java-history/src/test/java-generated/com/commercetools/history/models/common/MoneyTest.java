
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
        return new Object[][] { new Object[] { "currencyCode", Money.builder().currencyCode("currencyCode") },
                new Object[] { "centAmount", Money.builder().centAmount(3) },
                new Object[] { "fractionDigits", Money.builder().fractionDigits(4) },
                new Object[] { "type", Money.builder()
                        .type(com.commercetools.history.models.common.MoneyType.findEnum("centPrecision")) } };
    }

    @Test
    public void currencyCode() {
        Money value = Money.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }

    @Test
    public void centAmount() {
        Money value = Money.of();
        value.setCentAmount(3);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3);
    }

    @Test
    public void fractionDigits() {
        Money value = Money.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }

    @Test
    public void type() {
        Money value = Money.of();
        value.setType(com.commercetools.history.models.common.MoneyType.findEnum("centPrecision"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.history.models.common.MoneyType.findEnum("centPrecision"));
    }
}

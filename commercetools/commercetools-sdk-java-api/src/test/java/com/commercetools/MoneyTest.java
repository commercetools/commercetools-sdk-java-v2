
package com.commercetools;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.common.*;

import org.assertj.core.api.Assertions;
import org.javamoney.moneta.FastMoney;
import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testMonetaConversion() {
        final CentPrecisionMoney centPrecisionMoney = CentPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount centAmount = centPrecisionMoney.withCentPrecisionMoney(money -> FastMoney
                .of(money.getCentAmount() / Math.pow(10, money.getFractionDigits()), money.getCurrencyCode()));
        Assertions.assertThat(centAmount.getNumber().doubleValueExact()).isEqualTo(1.00);
        Assertions.assertThat(centAmount.isZero()).isFalse();

        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount highAmount = highPrecisionMoney.withHighPrecisionMoney(money -> FastMoney
                .of((money.getPreciseAmount() / Math.pow(10, money.getFractionDigits())), money.getCurrencyCode()));
        Assertions.assertThat(highAmount.getNumber().doubleValueExact()).isEqualTo(1.001);

        final TypedMoney typedMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount typedAmount = typedMoney.withTypedMoney(money -> {
            if (money instanceof HighPrecisionMoney) {
                return FastMoney.of(
                    ((HighPrecisionMoney) money).getPreciseAmount() / Math.pow(10, money.getFractionDigits()),
                    money.getCurrencyCode());
            }
            return FastMoney.of(money.getCentAmount() / Math.pow(10, money.getFractionDigits()),
                money.getCurrencyCode());
        });
        Assertions.assertThat(typedAmount.getNumber().doubleValueExact()).isEqualTo(1.001);

    }
}

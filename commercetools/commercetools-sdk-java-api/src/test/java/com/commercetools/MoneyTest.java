
package com.commercetools;

import java.util.Collections;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
import com.commercetools.api.models.common.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testMonetaConversion() {
        final CentPrecisionMoney centPrecisionMoney = CentPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .fractionDigits(2)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount centAmount = centPrecisionMoney.asMonetary();
        Assertions.assertThat(centAmount.getNumber().doubleValueExact()).isEqualTo(1.00);
        Assertions.assertThat(centAmount.isZero()).isFalse();

        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount highAmount = highPrecisionMoney.asMonetary();
        Assertions.assertThat(highAmount.getNumber().doubleValueExact()).isEqualTo(1.001);

        final TypedMoney typedMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount typedAmount = typedMoney.asMonetary();
        Assertions.assertThat(typedAmount.getNumber().doubleValueExact()).isEqualTo(1.001);
    }

    @Test
    public void testSubTotal() {
        Cart cart = CartBuilder.of()
                .totalPrice(CentPrecisionMoneyBuilder.of().centAmount(0L).fractionDigits(2).currencyCode("EUR").build())
                .lineItems(Collections.emptyList())
                .customLineItems(Collections.emptyList())
                .buildUnchecked();

        final MonetaryAmount subTotal = cart.calculateSubTotalPrice();
        Assertions.assertThat(subTotal.isZero()).isTrue();
    }

}

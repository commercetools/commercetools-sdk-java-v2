
package com.commercetools;

import java.util.Collections;
import java.util.Optional;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.order.OrderLike;

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
        final MonetaryAmount centAmount = centPrecisionMoney.withCentPrecisionMoney(MoneyUtil::asMoney);
        Assertions.assertThat(centAmount.getNumber().doubleValueExact()).isEqualTo(1.00);
        Assertions.assertThat(centAmount.isZero()).isFalse();

        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount highAmount = highPrecisionMoney.withHighPrecisionMoney(MoneyUtil::asMoney);
        Assertions.assertThat(highAmount.getNumber().doubleValueExact()).isEqualTo(1.001);

        final TypedMoney typedMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount typedAmount = typedMoney.withTypedMoney(MoneyUtil::asMoney);
        Assertions.assertThat(typedAmount.getNumber().doubleValueExact()).isEqualTo(1.001);
    }

    @Test
    public void testSubTotal() {
        Cart cart = CartBuilder.of()
                .totalPrice(CentPrecisionMoneyBuilder.of().centAmount(0L).fractionDigits(2).currencyCode("EUR").build())
                .lineItems(Collections.emptyList())
                .customLineItems(Collections.emptyList())
                .buildUnchecked();

        final MonetaryAmount subTotal = cart.withCart(MoneyUtil::calculateSubTotalPrice);
        Assertions.assertThat(subTotal.isZero()).isTrue();
    }

    public static class MoneyUtil {
        public static MonetaryAmount asMoney(TypedMoney money) {
            if (money instanceof HighPrecisionMoney) {
                return asMoney((HighPrecisionMoney) money);
            }
            return asMoney((CentPrecisionMoney) money);
        }

        public static MonetaryAmount asMoney(CentPrecisionMoney centPrecisionMoney) {
            return FastMoney.of(
                centPrecisionMoney.getCentAmount() / Math.pow(10, centPrecisionMoney.getFractionDigits()),
                centPrecisionMoney.getCurrencyCode());
        }

        public static MonetaryAmount asMoney(HighPrecisionMoney highPrecisionMoney) {
            return FastMoney.of(
                highPrecisionMoney.getPreciseAmount() / Math.pow(10, highPrecisionMoney.getFractionDigits()),
                highPrecisionMoney.getCurrencyCode());
        }

        public static MonetaryAmount zeroAmount(final String currency) {
            return FastMoney.of(0, currency);
        }

        public static MonetaryAmount calculateSubTotalPrice(final OrderLike<?> orderLike) {
            final MonetaryAmount lineItemTotal = orderLike.getLineItems()
                    .stream()
                    .map(LineItem::getTotalPrice)
                    .map(MoneyUtil::asMoney)
                    .reduce(
                        zeroAmount(
                            Optional.ofNullable(orderLike.getTotalPrice()).map(Money::getCurrencyCode).orElse(null)),
                        MonetaryAmount::add);
            final MonetaryAmount customLineItemTotal = orderLike.getCustomLineItems()
                    .stream()
                    .map(CustomLineItem::getTotalPrice)
                    .map(MoneyUtil::asMoney)
                    .reduce(
                        zeroAmount(
                            Optional.ofNullable(orderLike.getTotalPrice()).map(Money::getCurrencyCode).orElse(null)),
                        MonetaryAmount::add);
            return lineItemTotal.add(customLineItemTotal);
        }
    }
}

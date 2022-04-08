
package com.commercetools;

import java.util.Collections;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartBuilder;
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
        final MonetaryAmount centAmount = centPrecisionMoney.toMonetaryAmount();
        Assertions.assertThat(centAmount.getNumber().doubleValueExact()).isEqualTo(1.00);
        Assertions.assertThat(centAmount.isZero()).isFalse();

        final HighPrecisionMoney highPrecisionMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount highAmount = highPrecisionMoney.toMonetaryAmount();
        Assertions.assertThat(highAmount.getNumber().doubleValueExact()).isEqualTo(1.001);

        final TypedMoney typedMoney = HighPrecisionMoneyBuilder.of()
                .centAmount(100L)
                .preciseAmount(1001L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        final MonetaryAmount typedAmount = typedMoney.toMonetaryAmount();
        Assertions.assertThat(typedAmount.getNumber().doubleValueExact()).isEqualTo(1.001);
    }

    @Test
    public void testMonetaryToMoney() {
        CentPrecisionMoney centMoney = MoneyUtil.of(FastMoney.of(1.000, "EUR"));
        Assertions.assertThat(centMoney.getFractionDigits()).isEqualTo(2);
        Assertions.assertThat(centMoney.getCentAmount()).isEqualTo(100);
        Assertions.assertThat(centMoney.getCurrencyCode()).isEqualTo("EUR");

        CentPrecisionMoney jpyCentMoney = MoneyUtil.of(FastMoney.of(1.000, "JPY"));
        Assertions.assertThat(jpyCentMoney.getFractionDigits()).isEqualTo(0);
        Assertions.assertThat(jpyCentMoney.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyCentMoney.getCurrencyCode()).isEqualTo("JPY");

        CentPrecisionMoneyDraft centMoneyDraft = MoneyUtil.draftOf(FastMoney.of(1.000, "EUR"));
        Assertions.assertThat(centMoneyDraft.getFractionDigits()).isNull();
        Assertions.assertThat(centMoneyDraft.getCentAmount()).isEqualTo(100);
        Assertions.assertThat(centMoneyDraft.getCurrencyCode()).isEqualTo("EUR");

        CentPrecisionMoneyDraft jpyCentMoneyDraft = MoneyUtil.draftOf(FastMoney.of(1.000, "JPY"));
        Assertions.assertThat(jpyCentMoneyDraft.getFractionDigits()).isNull();
        Assertions.assertThat(jpyCentMoneyDraft.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyCentMoneyDraft.getCurrencyCode()).isEqualTo("JPY");

        HighPrecisionMoney highMoney = MoneyUtil.of(FastMoney.of(1.0010, "EUR"), 3);
        Assertions.assertThat(highMoney.getCentAmount()).isEqualTo(100);
        Assertions.assertThat(highMoney.getPreciseAmount()).isEqualTo(1001);
        Assertions.assertThat(highMoney.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(highMoney.getCurrencyCode()).isEqualTo("EUR");

        HighPrecisionMoney jpyHighMoney = MoneyUtil.of(FastMoney.of(1.0010, "JPY"), 3);
        Assertions.assertThat(jpyHighMoney.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyHighMoney.getPreciseAmount()).isEqualTo(1001);
        Assertions.assertThat(jpyHighMoney.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(jpyHighMoney.getCurrencyCode()).isEqualTo("JPY");

        HighPrecisionMoneyDraft highMoneyDraft = MoneyUtil.draftOf(FastMoney.of(1.0010, "EUR"), 3);
        Assertions.assertThat(highMoneyDraft.getCentAmount()).isEqualTo(100);
        Assertions.assertThat(highMoneyDraft.getPreciseAmount()).isEqualTo(1001);
        Assertions.assertThat(highMoneyDraft.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(highMoneyDraft.getCurrencyCode()).isEqualTo("EUR");

        HighPrecisionMoneyDraft jpyHighMoneyDraft = MoneyUtil.draftOf(FastMoney.of(1.0010, "JPY"), 3);
        Assertions.assertThat(jpyHighMoneyDraft.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyHighMoneyDraft.getPreciseAmount()).isEqualTo(1001);
        Assertions.assertThat(jpyHighMoneyDraft.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(jpyHighMoneyDraft.getCurrencyCode()).isEqualTo("JPY");

        HighPrecisionMoney highMoneyUpscale = MoneyUtil.of(FastMoney.of(1.001, "EUR"), 6);
        Assertions.assertThat(highMoneyUpscale.getCentAmount()).isEqualTo(100);
        Assertions.assertThat(highMoneyUpscale.getPreciseAmount()).isEqualTo(1001000);
        Assertions.assertThat(highMoneyUpscale.getFractionDigits()).isEqualTo(6);
        Assertions.assertThat(highMoneyUpscale.getCurrencyCode()).isEqualTo("EUR");

        HighPrecisionMoney jpyHighMoneyUpscale = MoneyUtil.of(FastMoney.of(1.001, "JPY"), 6);
        Assertions.assertThat(jpyHighMoneyUpscale.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyHighMoneyUpscale.getPreciseAmount()).isEqualTo(1001000);
        Assertions.assertThat(jpyHighMoneyUpscale.getFractionDigits()).isEqualTo(6);
        Assertions.assertThat(jpyHighMoneyUpscale.getCurrencyCode()).isEqualTo("JPY");

        HighPrecisionMoneyDraft highMoneyDraftUpscale = MoneyUtil.draftOf(FastMoney.of(1.001, "EUR"), 6);
        Assertions.assertThat(highMoneyDraftUpscale.getCentAmount()).isEqualTo(100);
        Assertions.assertThat(highMoneyDraftUpscale.getPreciseAmount()).isEqualTo(1001000);
        Assertions.assertThat(highMoneyDraftUpscale.getFractionDigits()).isEqualTo(6);
        Assertions.assertThat(highMoneyDraftUpscale.getCurrencyCode()).isEqualTo("EUR");

        HighPrecisionMoneyDraft jpyHighMoneyDraftUpscale = MoneyUtil.draftOf(FastMoney.of(1.001, "JPY"), 6);
        Assertions.assertThat(jpyHighMoneyDraftUpscale.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyHighMoneyDraftUpscale.getPreciseAmount()).isEqualTo(1001000);
        Assertions.assertThat(jpyHighMoneyDraftUpscale.getFractionDigits()).isEqualTo(6);
        Assertions.assertThat(jpyHighMoneyDraftUpscale.getCurrencyCode()).isEqualTo("JPY");

        HighPrecisionMoney highMoneyDownscale = MoneyUtil.of(FastMoney.of(1.23456, "EUR"), 3);
        Assertions.assertThat(highMoneyDownscale.getCentAmount()).isEqualTo(123);
        Assertions.assertThat(highMoneyDownscale.getPreciseAmount()).isEqualTo(1235);
        Assertions.assertThat(highMoneyDownscale.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(highMoneyDownscale.getCurrencyCode()).isEqualTo("EUR");

        HighPrecisionMoney jpyHighMoneyDownscale = MoneyUtil.of(FastMoney.of(1.23456, "JPY"), 3);
        Assertions.assertThat(jpyHighMoneyDownscale.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyHighMoneyDownscale.getPreciseAmount()).isEqualTo(1235);
        Assertions.assertThat(jpyHighMoneyDownscale.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(jpyHighMoneyDownscale.getCurrencyCode()).isEqualTo("JPY");

        HighPrecisionMoneyDraft highMoneyDraftDownscale = MoneyUtil.draftOf(FastMoney.of(1.23456, "EUR"), 3);
        Assertions.assertThat(highMoneyDraftDownscale.getCentAmount()).isEqualTo(123);
        Assertions.assertThat(highMoneyDraftDownscale.getPreciseAmount()).isEqualTo(1235);
        Assertions.assertThat(highMoneyDraftDownscale.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(highMoneyDraftDownscale.getCurrencyCode()).isEqualTo("EUR");

        HighPrecisionMoneyDraft jpyHighMoneyDraftDownscale = MoneyUtil.draftOf(FastMoney.of(1.23456, "JPY"), 3);
        Assertions.assertThat(jpyHighMoneyDraftDownscale.getCentAmount()).isEqualTo(1);
        Assertions.assertThat(jpyHighMoneyDraftDownscale.getPreciseAmount()).isEqualTo(1235);
        Assertions.assertThat(jpyHighMoneyDraftDownscale.getFractionDigits()).isEqualTo(3);
        Assertions.assertThat(jpyHighMoneyDraftDownscale.getCurrencyCode()).isEqualTo("JPY");
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


package com.commercetools;

import java.util.Collections;

import javax.money.MonetaryAmount;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.common.*;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

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

    @Test
    public void testMoneyMonetaryAmount() {
        Money money = Money.builder().centAmount(10L).currencyCode("EUR").build();
        MonetaryAmount amount = money.multiply(1L);

        Assertions.assertThat(amount).isExactlyInstanceOf(CentPrecisionMoneyImpl.class);
    }

    @Test
    public void testCentPrecisionMoneyMonetaryAmount() {
        Money money = TypedMoney.centPrecisionBuilder().centAmount(10L).fractionDigits(2).currencyCode("EUR").build();
        MonetaryAmount amount = money.multiply(1L);

        Assertions.assertThat(amount).isExactlyInstanceOf(CentPrecisionMoneyImpl.class);
    }

    @Test
    public void testHighPrecisionMoneyMonetaryAmount() {
        Money money = TypedMoney.highPrecisionBuilder()
                .centAmount(1L)
                .preciseAmount(10L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        MonetaryAmount amount = money.multiply(1L);

        Assertions.assertThat(amount).isExactlyInstanceOf(HighPrecisionMoneyImpl.class);
    }

    @Test
    public void testCentPrecisionMoneyDraftMonetaryAmount() {
        Money money = TypedMoneyDraft.centPrecisionBuilder().centAmount(10L).currencyCode("EUR").build();
        MonetaryAmount amount = money.multiply(1L);

        Assertions.assertThat(amount).isExactlyInstanceOf(CentPrecisionMoneyDraftImpl.class);
    }

    @Test
    public void testHighPrecisionMoneyDraftMonetaryAmount() {
        Money money = TypedMoneyDraft.highPrecisionBuilder()
                .preciseAmount(10L)
                .fractionDigits(3)
                .currencyCode("EUR")
                .build();
        MonetaryAmount amount = money.multiply(1L);
        Assertions.assertThat(amount).isExactlyInstanceOf(HighPrecisionMoneyDraftImpl.class);
    }

    @Test
    public void testMoneyUtilQueryFrom() {
        final MonetaryAmount eur = org.javamoney.moneta.Money.of(10.00501, "EUR");
        Assertions.assertThat(MoneyUtil.amountToCents(eur)).isEqualTo(1001);

        final MonetaryAmount jpy = org.javamoney.moneta.Money.of(10.00501, "JPY");
        Assertions.assertThat(MoneyUtil.amountToCents(jpy)).isEqualTo(10);

        final MonetaryAmount fastEur = org.javamoney.moneta.FastMoney.of(10.00501, "EUR");
        Assertions.assertThat(MoneyUtil.amountToCents(fastEur)).isEqualTo(1001);

        final MonetaryAmount fastJpy = org.javamoney.moneta.FastMoney.of(10.00501, "JPY");
        Assertions.assertThat(MoneyUtil.amountToCents(fastJpy)).isEqualTo(10);

        final MonetaryAmount highEur = org.javamoney.moneta.Money.of(10.00501, "EUR");
        Assertions.assertThat(MoneyUtil.amountToPreciseAmount(highEur, 3)).isEqualTo(10005);

        final MonetaryAmount highJpy = org.javamoney.moneta.Money.of(10.00501, "JPY");
        Assertions.assertThat(MoneyUtil.amountToPreciseAmount(highJpy, 3)).isEqualTo(10005);

        final MonetaryAmount highFastEur = org.javamoney.moneta.FastMoney.of(10.00501, "EUR");
        Assertions.assertThat(MoneyUtil.amountToPreciseAmount(highFastEur, 3)).isEqualTo(10005);

        final MonetaryAmount highFastJpy = org.javamoney.moneta.FastMoney.of(10.00501, "JPY");
        Assertions.assertThat(MoneyUtil.amountToPreciseAmount(highFastJpy, 3)).isEqualTo(10005);
    }

    @Test
    public void serialization() {
        Cart cart = Cart.builder()
                .totalPrice(b -> b.centPrecisionBuilder().centAmount(100L).fractionDigits(2).currencyCode("EUR"))
                .buildUnchecked();

        JsonNode cartNode = JsonUtils.toJsonNode(cart);

        Assertions.assertThat(cartNode.get("totalPrice")).hasSize(3);
        Assertions.assertThat(cartNode.get("totalPrice").get("type").asText()).isEqualTo("centPrecision");
        Assertions.assertThat(cartNode.get("totalPrice").get("centAmount").asInt()).isEqualTo(100);
        Assertions.assertThat(cartNode.get("totalPrice").get("currencyCode").asText()).isEqualTo("EUR");

        Cart highCart = Cart.builder()
                .totalPrice(b -> b.highPrecisionBuilder()
                        .centAmount(100L)
                        .fractionDigits(3)
                        .preciseAmount(1000L)
                        .currencyCode("EUR"))
                .buildUnchecked();

        JsonNode highCartNode = JsonUtils.toJsonNode(highCart);
        Assertions.assertThat(highCartNode.get("totalPrice")).hasSize(5);
        Assertions.assertThat(highCartNode.get("totalPrice").get("type").asText()).isEqualTo("highPrecision");
        Assertions.assertThat(highCartNode.get("totalPrice").get("centAmount").asInt()).isEqualTo(100);
        Assertions.assertThat(highCartNode.get("totalPrice").get("preciseAmount").asInt()).isEqualTo(1000);
        Assertions.assertThat(highCartNode.get("totalPrice").get("fractionDigits").asInt()).isEqualTo(3);
        Assertions.assertThat(highCartNode.get("totalPrice").get("currencyCode").asText()).isEqualTo("EUR");
    }

    @Test
    public void serializationDraft() {
        CartDraft cart = CartDraft.builder()
                .plusCustomLineItems(CustomLineItemDraft.builder()
                        .money(CentPrecisionMoneyDraft.builder().centAmount(100L).currencyCode("EUR").buildUnchecked())
                        .buildUnchecked())
                .buildUnchecked();

        JsonNode cartNode = JsonUtils.toJsonNode(cart);

        Assertions.assertThat(cartNode.get("customLineItems").get(0).get("money")).hasSize(3);
        Assertions.assertThat(cartNode.get("customLineItems").get(0).get("money").get("type").asText())
                .isEqualTo("centPrecision");
        Assertions.assertThat(cartNode.get("customLineItems").get(0).get("money").get("centAmount").asInt())
                .isEqualTo(100);
        Assertions.assertThat(cartNode.get("customLineItems").get(0).get("money").get("currencyCode").asText())
                .isEqualTo("EUR");

        CartDraft highCart = CartDraft.builder()
                .customLineItems(CustomLineItemDraft.builder()
                        .money(HighPrecisionMoneyDraft.builder()
                                .fractionDigits(3)
                                .preciseAmount(1000L)
                                .currencyCode("EUR")
                                .buildUnchecked())
                        .buildUnchecked())
                .buildUnchecked();

        JsonNode highCartNode = JsonUtils.toJsonNode(highCart);
        Assertions.assertThat(highCartNode.get("customLineItems").get(0).get("money")).hasSize(4);
        Assertions.assertThat(highCartNode.get("customLineItems").get(0).get("money").get("type").asText())
                .isEqualTo("highPrecision");
        Assertions.assertThat(highCartNode.get("customLineItems").get(0).get("money").get("preciseAmount").asInt())
                .isEqualTo(1000);
        Assertions.assertThat(highCartNode.get("customLineItems").get(0).get("money").get("fractionDigits").asInt())
                .isEqualTo(3);
        Assertions.assertThat(highCartNode.get("customLineItems").get(0).get("money").get("currencyCode").asText())
                .isEqualTo("EUR");
    }
}

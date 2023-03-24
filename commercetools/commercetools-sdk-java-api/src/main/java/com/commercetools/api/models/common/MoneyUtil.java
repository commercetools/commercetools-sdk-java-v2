
package com.commercetools.api.models.common;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Optional;

import javax.money.*;
import javax.money.Monetary;

import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.money.MonetaryProvider;
import com.commercetools.money.MonetarySupplier;

import org.javamoney.moneta.spi.DefaultRoundingProvider;

/**
 * Utility methods to convert from {@link MonetaryAmount} to {@link Money} and vice versa
 */
public class MoneyUtil {
    private static final MonetaryProvider MONETARY_PROVIDER;
    protected static final DefaultRoundingProvider ROUNDING_PROVIDER = new DefaultRoundingProvider();

    static {
        MONETARY_PROVIDER = MonetarySupplier.instance();
    }

    public static MonetaryAmount toMonetaryAmount(final Money money) {
        if (money instanceof TypedMoneyDraft) {
            return toMonetaryAmount((TypedMoneyDraft) money);
        }
        if (money instanceof TypedMoney) {
            return toMonetaryAmount((TypedMoney) money);
        }
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(), Monetary.getCurrency(money.getCurrencyCode()));
    }

    public static MonetaryAmount toMonetaryAmount(final TypedMoneyDraft money) {
        if (money instanceof HighPrecisionMoneyDraft) {
            return toMonetaryAmount((HighPrecisionMoneyDraft) money);
        }
        return toMonetaryAmount((CentPrecisionMoneyDraft) money);
    }

    public static MonetaryAmount toMonetaryAmount(final CentPrecisionMoneyDraft money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(),
            Optional.ofNullable(money.getFractionDigits()).orElse(unit.getDefaultFractionDigits()), unit);
    }

    public static MonetaryAmount toMonetaryAmount(final HighPrecisionMoneyDraft money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getPreciseAmount(), money.getFractionDigits(), unit);
    }

    public static MonetaryAmount toMonetaryAmount(final TypedMoney money) {
        if (money instanceof HighPrecisionMoney) {
            return toMonetaryAmount((HighPrecisionMoney) money);
        }
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(),
            Optional.ofNullable(money.getFractionDigits()).orElse(unit.getDefaultFractionDigits()), unit);
    }

    public static MonetaryAmount toMonetaryAmount(final CentPrecisionMoney money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(),
            Optional.ofNullable(money.getFractionDigits()).orElse(unit.getDefaultFractionDigits()), unit);
    }

    public static MonetaryAmount toMonetaryAmount(final HighPrecisionMoney money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getPreciseAmount(), money.getFractionDigits(), unit);
    }

    public static MonetaryAmount zeroAmount(final String currency) {
        return zeroAmount(Monetary.getCurrency(currency));
    }

    public static MonetaryAmount zeroAmount(final CurrencyUnit currency) {
        return MONETARY_PROVIDER.asMonetaryAmount(0, currency);
    }

    public static CentPrecisionMoney of(final MonetaryAmount monetaryAmount) {
        return CentPrecisionMoneyBuilder.of()
                .centAmount(amountToCents(monetaryAmount))
                .fractionDigits(monetaryAmount.getCurrency().getDefaultFractionDigits())
                .currencyCode(monetaryAmount.getCurrency().getCurrencyCode())
                .build();
    }

    public static HighPrecisionMoney of(final MonetaryAmount monetaryAmount, final int fractionDigits) {
        return HighPrecisionMoneyBuilder.of()
                .centAmount(amountToCents(monetaryAmount))
                .preciseAmount(amountToPreciseAmount(monetaryAmount, fractionDigits))
                .fractionDigits(fractionDigits)
                .currencyCode(monetaryAmount.getCurrency().getCurrencyCode())
                .build();
    }

    public static CentPrecisionMoneyDraft draftOf(final MonetaryAmount monetaryAmount) {
        return CentPrecisionMoneyDraftBuilder.of()
                .centAmount(amountToCents(monetaryAmount))
                .currencyCode(monetaryAmount.getCurrency().getCurrencyCode())
                .build();
    }

    public static HighPrecisionMoneyDraft draftOf(final MonetaryAmount monetaryAmount, final int fractionDigits) {
        return HighPrecisionMoneyDraftBuilder.of()
                .centAmount(amountToCents(monetaryAmount))
                .preciseAmount(amountToPreciseAmount(monetaryAmount, fractionDigits))
                .fractionDigits(fractionDigits)
                .currencyCode(monetaryAmount.getCurrency().getCurrencyCode())
                .build();
    }

    public static long amountToCents(final MonetaryAmount monetaryAmount) {
        final MonetaryRounding ROUNDING = ROUNDING_PROVIDER.getRounding(
            RoundingQueryBuilder.of().setRoundingName("default").setCurrency(monetaryAmount.getCurrency()).build());
        return monetaryAmount.with(ROUNDING).query(amount -> queryFrom(monetaryAmount).longValue());
    }

    public static long amountToPreciseAmount(final MonetaryAmount monetaryAmount, final int fractionDigits) {
        final MonetaryRounding ROUNDING = ROUNDING_PROVIDER.getRounding(
            RoundingQueryBuilder.of().setRoundingName("default").setCurrency(monetaryAmount.getCurrency()).build());
        return monetaryAmount.with(ROUNDING).query(amount -> queryFrom(monetaryAmount, fractionDigits).longValue());
    }

    protected static BigDecimal queryFrom(final MonetaryAmount amount) {
        Objects.requireNonNull(amount, "Amount required.");
        final CurrencyUnit cur = amount.getCurrency();
        final BigDecimal number = amount.getNumber()
                .numberValue(BigDecimal.class)
                .setScale(Math.max(0, cur.getDefaultFractionDigits()), RoundingMode.HALF_EVEN);
        return number.scaleByPowerOfTen(number.scale());
    }

    protected static BigDecimal queryFrom(final MonetaryAmount amount, final int fractionsDigit) {
        Objects.requireNonNull(amount, "Amount required.");
        final BigDecimal number = amount.getNumber()
                .numberValue(BigDecimal.class)
                .setScale(Math.max(0, fractionsDigit), RoundingMode.HALF_EVEN);
        return number.scaleByPowerOfTen(number.scale());
    }

    /**
     * Calculates the taxes applied to the pricing.
     * @param taxedPrice the items taxed price
     * @return the monetary amount
     */
    public static MonetaryAmount calculateAppliedTaxes(final TaxedItemPrice taxedPrice) {
        return taxedPrice.getTotalGross().subtract(taxedPrice.getTotalNet());
    }

    /**
     * Calculates the gross price of the given amount according to its tax rate.
     * Whether the provided amount is already gross or net is determined by the tax rate.
     * @param amount the monetary amount
     * @param taxRate the tax rate used for calculating the gross price
     * @return the monetary amount
     */
    public static MonetaryAmount calculateGrossPrice(final MonetaryAmount amount, final TaxRate taxRate) {
        return taxRate.getIncludedInPrice() ? amount : convertNetToGrossPrice(amount, taxRate.getAmount());
    }

    /**
     * Calculates the net price of the given amount according to its tax rate.
     * Whether the provided amount is already net or gross is determined by the tax rate.
     * @param amount the monetary amount
     * @param taxRate the tax rate corresponding to the {@code amount}
     * @return the net monetary amount
     */
    public static MonetaryAmount calculateNetPrice(final MonetaryAmount amount, final TaxRate taxRate) {
        return taxRate.getIncludedInPrice() ? convertGrossToNetPrice(amount, taxRate.getAmount()) : amount;
    }

    /**
     * Converts the given net amount (i.e. without taxes) to gross (i.e. with taxes included) according to the provided tax rate.
     * @param netAmount the net monetary amount
     * @param taxRate the given tax rate, e.g. {@code 0.19} for 19% tax
     * @return the gross monetary amount
     */
    public static MonetaryAmount convertNetToGrossPrice(final MonetaryAmount netAmount, final double taxRate) {
        return netAmount.multiply(1 + taxRate);
    }

    /**
     * Converts the given gross amount (i.e. with taxes included) to net (i.e. without taxes) according to the provided tax rate.
     * @param grossAmount the gross monetary amount
     * @param taxRate the given tax rate, e.g. {@code 0.19} for 19% tax
     * @return the net monetary amount
     */
    public static MonetaryAmount convertGrossToNetPrice(final MonetaryAmount grossAmount, final double taxRate) {
        return grossAmount.divide(1 + taxRate);
    }
}

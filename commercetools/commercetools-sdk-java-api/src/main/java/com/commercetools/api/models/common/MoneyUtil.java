
package com.commercetools.api.models.common;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Optional;

import javax.money.*;
import javax.money.Monetary;

import com.commercetools.money.MonetaryProvider;
import com.commercetools.money.MonetarySupplier;

import org.javamoney.moneta.spi.DefaultRoundingProvider;

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
        return toMonetaryAmount((CentPrecisionMoney) money);
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
        BigDecimal number = amount.getNumber().numberValue(BigDecimal.class);
        CurrencyUnit cur = amount.getCurrency();
        number = number.setScale(Math.max(0, cur.getDefaultFractionDigits()), RoundingMode.HALF_EVEN);
        return number.movePointRight(number.scale());
    }

    protected static BigDecimal queryFrom(final MonetaryAmount amount, final int fractionsDigit) {
        Objects.requireNonNull(amount, "Amount required.");
        BigDecimal number = amount.getNumber().numberValue(BigDecimal.class);
        number = number.setScale(fractionsDigit, RoundingMode.HALF_EVEN);
        return number.movePointRight(number.scale());
    }
}

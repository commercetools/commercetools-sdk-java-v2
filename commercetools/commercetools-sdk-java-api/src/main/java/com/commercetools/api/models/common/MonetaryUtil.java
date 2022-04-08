
package com.commercetools.api.models.common;

import java.util.Optional;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.order.OrderLike;
import com.commercetools.money.MonetaryProvider;
import com.commercetools.money.MonetarySupplier;

public class MonetaryUtil {
    private static final MonetaryProvider MONETARY_PROVIDER;

    static {
        MONETARY_PROVIDER = MonetarySupplier.instance();
    }

    public static MonetaryAmount asMonetary(Money money) {
        if (money instanceof TypedMoneyDraft) {
            return asMonetary((TypedMoneyDraft) money);
        }
        if (money instanceof TypedMoney) {
            return asMonetary((TypedMoney) money);
        }
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(), Monetary.getCurrency(money.getCurrencyCode()));
    }

    public static MonetaryAmount asMonetary(TypedMoneyDraft money) {
        if (money instanceof HighPrecisionMoneyDraft) {
            return asMonetary((HighPrecisionMoneyDraft) money);
        }
        return asMonetary((CentPrecisionMoneyDraft) money);
    }

    public static MonetaryAmount asMonetary(CentPrecisionMoneyDraft money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(),
            Optional.ofNullable(money.getFractionDigits()).orElse(unit.getDefaultFractionDigits()), unit);
    }

    public static MonetaryAmount asMonetary(HighPrecisionMoneyDraft money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getPreciseAmount(), money.getFractionDigits(), unit);
    }

    public static MonetaryAmount asMonetary(TypedMoney money) {
        if (money instanceof HighPrecisionMoney) {
            return asMonetary((HighPrecisionMoney) money);
        }
        return asMonetary((CentPrecisionMoney) money);
    }

    public static MonetaryAmount asMonetary(CentPrecisionMoney money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getCentAmount(),
            Optional.ofNullable(money.getFractionDigits()).orElse(unit.getDefaultFractionDigits()), unit);
    }

    public static MonetaryAmount asMonetary(HighPrecisionMoney money) {
        CurrencyUnit unit = Monetary.getCurrency(money.getCurrencyCode());
        return MONETARY_PROVIDER.asMonetaryAmount(money.getPreciseAmount(), money.getFractionDigits(), unit);
    }

    public static MonetaryAmount zeroAmount(final String currency) {
        return zeroAmount(Monetary.getCurrency(currency));
    }

    public static MonetaryAmount zeroAmount(final CurrencyUnit currency) {
        return MONETARY_PROVIDER.asMonetaryAmount(0, currency);
    }
}

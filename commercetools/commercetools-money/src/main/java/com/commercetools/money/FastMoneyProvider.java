
package com.commercetools.money;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.FastMoney;

/**
 * MonetaryProvider which uses the FastMoney implementation. Used as default provider
 */
public class FastMoneyProvider implements MonetaryProvider {
    @Override
    public MonetaryAmount asMonetaryAmount(final long amount, final long fractionDigits, final String currencyCode) {
        return FastMoney.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(final long amount, final long fractionDigits,
            final CurrencyUnit currencyCode) {
        return FastMoney.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(final double amount, final CurrencyUnit currencyCode) {
        return FastMoney.of(amount, currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(final BigDecimal amount, final CurrencyUnit currencyCode) {
        return FastMoney.of(amount, currencyCode);
    }
}

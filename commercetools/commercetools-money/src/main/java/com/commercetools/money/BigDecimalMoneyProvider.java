
package com.commercetools.money;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;

/**
 * MoneyProvider which uses the Money implementation with BigDecimals.
 */
public class BigDecimalMoneyProvider implements MonetaryProvider {
    @Override
    public MonetaryAmount asMonetaryAmount(final long amount, final long fractionDigits, final String currencyCode) {
        return Money.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(final long amount, final long fractionDigits,
            final CurrencyUnit currencyCode) {
        return Money.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(final double amount, final CurrencyUnit currencyCode) {
        return Money.of(amount, currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(final BigDecimal amount, final CurrencyUnit currencyCode) {
        return Money.of(amount, currencyCode);
    }
}


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
    public MonetaryAmount asMonetaryAmount(long amount, long fractionDigits, String currencyCode) {
        return Money.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(long amount, long fractionDigits, CurrencyUnit currencyCode) {
        return Money.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(double amount, CurrencyUnit currencyCode) {
        return Money.of(amount, currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(BigDecimal amount, CurrencyUnit currencyCode) {
        return Money.of(amount, currencyCode);
    }
}

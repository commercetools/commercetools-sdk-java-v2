
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
    public MonetaryAmount asMonetaryAmount(long amount, long fractionDigits, String currencyCode) {
        return FastMoney.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(long amount, long fractionDigits, CurrencyUnit currencyCode) {
        return FastMoney.of(amount / Math.pow(10, fractionDigits), currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(double amount, CurrencyUnit currencyCode) {
        return FastMoney.of(amount, currencyCode);
    }

    @Override
    public MonetaryAmount asMonetaryAmount(BigDecimal amount, CurrencyUnit currencyCode) {
        return FastMoney.of(amount, currencyCode);
    }
}

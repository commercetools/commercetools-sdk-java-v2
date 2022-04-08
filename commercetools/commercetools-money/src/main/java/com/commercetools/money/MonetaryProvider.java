
package com.commercetools.money;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

public interface MonetaryProvider {

    public MonetaryAmount asMonetaryAmount(long amount, long fractionDigits, String currencyCode);

    public MonetaryAmount asMonetaryAmount(long amount, long fractionDigits, CurrencyUnit currencyCode);

    public MonetaryAmount asMonetaryAmount(double amount, CurrencyUnit currencyCode);

    public MonetaryAmount asMonetaryAmount(BigDecimal amount, CurrencyUnit currencyCode);
}

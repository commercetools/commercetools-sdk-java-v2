
package com.commercetools.money;

import java.math.BigDecimal;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;

public interface MonetaryProvider {

    public MonetaryAmount asMonetaryAmount(final long amount, final long fractionDigits, final String currencyCode);

    public MonetaryAmount asMonetaryAmount(final long amount, final long fractionDigits,
            final CurrencyUnit currencyCode);

    public MonetaryAmount asMonetaryAmount(final double amount, final CurrencyUnit currencyCode);

    public MonetaryAmount asMonetaryAmount(final BigDecimal amount, final CurrencyUnit currencyCode);
}

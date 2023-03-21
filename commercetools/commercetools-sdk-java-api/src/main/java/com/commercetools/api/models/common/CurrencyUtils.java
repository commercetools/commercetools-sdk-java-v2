
package com.commercetools.api.models.common;

import javax.money.CurrencyQuery;
import javax.money.CurrencyQueryBuilder;
import javax.money.CurrencyUnit;
import javax.money.UnknownCurrencyException;

import org.javamoney.moneta.spi.JDKCurrencyProvider;

final class CurrencyUtils {
    static final JDKCurrencyProvider CURRENCY_PROVIDER = new JDKCurrencyProvider();

    public static CurrencyUnit ofCode(final String currencyCode) {
        CurrencyQuery query = CurrencyQueryBuilder.of().setCurrencyCodes(currencyCode).build();
        return CURRENCY_PROVIDER.getCurrencies(query)
                .stream()
                .findFirst()
                .orElseThrow(() -> new UnknownCurrencyException(currencyCode));
    }

}

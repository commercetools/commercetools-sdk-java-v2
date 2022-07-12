
package com.commercetools.api.models.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class HighPrecisionMoneyRepresentation extends MoneyRepresentation {

    private final Long preciseAmount;
    private final Integer fractionDigits;

    @JsonCreator
    public HighPrecisionMoneyRepresentation(final String currencyCode, final Long centAmount, final Long preciseAmount,
            final Integer fractionDigits) {
        super(centAmount, currencyCode);
        this.preciseAmount = preciseAmount;
        this.fractionDigits = fractionDigits;
    }

    /**
     * Creates a new Money instance.
     * Money can't represent cent fractions. The value will be rounded to nearest cent value using RoundingMode.HALF_EVEN.
     *
     * @param monetaryAmount the amount with currency to transform
     */
    @JsonIgnore
    public HighPrecisionMoneyRepresentation(final HighPrecisionMoney monetaryAmount) {
        super(monetaryAmount.getCentAmount(), requireValidCurrencyCode(monetaryAmount.getCurrencyCode()));
        preciseAmount = monetaryAmount.getPreciseAmount();
        fractionDigits = monetaryAmount.getFractionDigits();
    }

    @JsonIgnore
    public HighPrecisionMoneyRepresentation(final HighPrecisionMoneyDraft monetaryAmount) {
        super(monetaryAmount.getCentAmount(), requireValidCurrencyCode(monetaryAmount.getCurrencyCode()));
        preciseAmount = monetaryAmount.getPreciseAmount();
        fractionDigits = monetaryAmount.getFractionDigits();
    }

    public Long getPreciseAmount() {
        return preciseAmount;
    }

    public Integer getFractionDigits() {
        return fractionDigits;
    }

}


package com.commercetools.api.models.common;

public interface HighPrecisionMoneyDraftMixin extends TypedMoneyDraft {
    public Integer getFractionDigits();

    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return amount -> MoneyUtil.draftOf(amount, getFractionDigits());
    }
}

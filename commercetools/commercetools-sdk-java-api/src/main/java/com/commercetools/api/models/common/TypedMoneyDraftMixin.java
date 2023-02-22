
package com.commercetools.api.models.common;

public interface TypedMoneyDraftMixin extends Money {
    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return MoneyUtil::draftOf;
    }
}

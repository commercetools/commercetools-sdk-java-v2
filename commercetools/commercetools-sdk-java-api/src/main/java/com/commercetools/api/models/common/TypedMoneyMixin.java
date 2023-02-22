
package com.commercetools.api.models.common;

public interface TypedMoneyMixin extends Money {
    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return MoneyUtil::of;
    }
}

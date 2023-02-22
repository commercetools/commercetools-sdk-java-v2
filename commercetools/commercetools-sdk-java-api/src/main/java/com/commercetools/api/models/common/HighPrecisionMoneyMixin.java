
package com.commercetools.api.models.common;

public interface HighPrecisionMoneyMixin extends TypedMoney {
    public Integer getFractionDigits();

    @Override
    default javax.money.MonetaryOperator createMoneyOperator() {
        return amount -> MoneyUtil.of(amount, getFractionDigits());
    }

}

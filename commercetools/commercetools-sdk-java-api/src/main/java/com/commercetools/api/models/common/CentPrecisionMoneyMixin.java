
package com.commercetools.api.models.common;

public interface CentPrecisionMoneyMixin extends TypedMoney {
    public default CentPrecisionMoneyDraft toDraft() {
        return CentPrecisionMoneyDraft.of(this);
    }
}

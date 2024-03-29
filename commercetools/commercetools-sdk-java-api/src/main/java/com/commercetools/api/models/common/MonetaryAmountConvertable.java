
package com.commercetools.api.models.common;

import java.util.function.Function;

import javax.money.*;

/**
 * conversion methods for Money classes
 */
public interface MonetaryAmountConvertable {
    <T> T withMoney(Function<Money, T> helper);

    default public MonetaryAmount toMonetaryAmount() {
        return withMoney(MoneyUtil::toMonetaryAmount);
    }
}

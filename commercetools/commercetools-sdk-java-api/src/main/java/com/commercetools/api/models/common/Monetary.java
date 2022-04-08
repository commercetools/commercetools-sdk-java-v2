
package com.commercetools.api.models.common;

import java.util.function.Function;

import javax.money.*;

public interface Monetary {
    <T> T withMoney(Function<Money, T> helper);

    default public MonetaryAmount asMonetary() {
        return withMoney(MonetaryUtil::asMonetary);
    }
}

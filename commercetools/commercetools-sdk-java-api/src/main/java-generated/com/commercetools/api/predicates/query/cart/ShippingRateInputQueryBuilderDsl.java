
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class ShippingRateInputQueryBuilderDsl {
    public ShippingRateInputQueryBuilderDsl() {
    }

    public static ShippingRateInputQueryBuilderDsl of() {
        return new ShippingRateInputQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRateInputQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateInputQueryBuilderDsl::of));
    }
}

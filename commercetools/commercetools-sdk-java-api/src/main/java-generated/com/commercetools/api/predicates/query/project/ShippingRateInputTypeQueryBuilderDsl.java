
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ShippingRateInputTypeQueryBuilderDsl {
    public ShippingRateInputTypeQueryBuilderDsl() {
    }

    public static ShippingRateInputTypeQueryBuilderDsl of() {
        return new ShippingRateInputTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRateInputTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateInputTypeQueryBuilderDsl::of));
    }
}

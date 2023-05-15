
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class ShippingRateInputDraftQueryBuilderDsl {
    public ShippingRateInputDraftQueryBuilderDsl() {
    }

    public static ShippingRateInputDraftQueryBuilderDsl of() {
        return new ShippingRateInputDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRateInputDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShippingRateInputDraftQueryBuilderDsl::of));
    }
}

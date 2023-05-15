
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingRatePriceTierQueryBuilderDsl {
    public ShippingRatePriceTierQueryBuilderDsl() {
    }

    public static ShippingRatePriceTierQueryBuilderDsl of() {
        return new ShippingRatePriceTierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingRatePriceTierQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShippingRatePriceTierQueryBuilderDsl::of));
    }
}

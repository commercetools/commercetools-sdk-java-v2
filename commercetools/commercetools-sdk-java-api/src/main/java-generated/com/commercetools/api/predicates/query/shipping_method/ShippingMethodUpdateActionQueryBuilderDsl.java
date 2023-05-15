
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodUpdateActionQueryBuilderDsl {
    public ShippingMethodUpdateActionQueryBuilderDsl() {
    }

    public static ShippingMethodUpdateActionQueryBuilderDsl of() {
        return new ShippingMethodUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodUpdateActionQueryBuilderDsl::of));
    }
}

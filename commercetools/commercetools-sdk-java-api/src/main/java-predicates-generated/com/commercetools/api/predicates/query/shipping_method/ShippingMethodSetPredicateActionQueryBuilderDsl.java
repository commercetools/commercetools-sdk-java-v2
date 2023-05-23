
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetPredicateActionQueryBuilderDsl {
    public ShippingMethodSetPredicateActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetPredicateActionQueryBuilderDsl of() {
        return new ShippingMethodSetPredicateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetPredicateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetPredicateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetPredicateActionQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetPredicateActionQueryBuilderDsl::of));
    }

}

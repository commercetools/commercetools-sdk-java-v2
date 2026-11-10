
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodChangeActiveActionQueryBuilderDsl {
    public ShippingMethodChangeActiveActionQueryBuilderDsl() {
    }

    public static ShippingMethodChangeActiveActionQueryBuilderDsl of() {
        return new ShippingMethodChangeActiveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodChangeActiveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeActiveActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ShippingMethodChangeActiveActionQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeActiveActionQueryBuilderDsl::of));
    }

}

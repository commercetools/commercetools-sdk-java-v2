
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodChangeNameActionQueryBuilderDsl {
    public ShippingMethodChangeNameActionQueryBuilderDsl() {
    }

    public static ShippingMethodChangeNameActionQueryBuilderDsl of() {
        return new ShippingMethodChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeNameActionQueryBuilderDsl::of));
    }

}

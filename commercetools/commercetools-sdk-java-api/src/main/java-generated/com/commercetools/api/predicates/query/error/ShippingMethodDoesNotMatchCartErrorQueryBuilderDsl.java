
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl {
    public ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl() {
    }

    public static ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl of() {
        return new ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodDoesNotMatchCartErrorQueryBuilderDsl::of));
    }
}

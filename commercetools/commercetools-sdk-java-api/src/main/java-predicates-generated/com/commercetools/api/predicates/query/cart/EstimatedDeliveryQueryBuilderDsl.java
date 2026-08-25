
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class EstimatedDeliveryQueryBuilderDsl {
    public EstimatedDeliveryQueryBuilderDsl() {
    }

    public static EstimatedDeliveryQueryBuilderDsl of() {
        return new EstimatedDeliveryQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<EstimatedDeliveryQueryBuilderDsl> from() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("from")),
            p -> new CombinationQueryPredicate<>(p, EstimatedDeliveryQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<EstimatedDeliveryQueryBuilderDsl> until() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("until")),
            p -> new CombinationQueryPredicate<>(p, EstimatedDeliveryQueryBuilderDsl::of));
    }

}

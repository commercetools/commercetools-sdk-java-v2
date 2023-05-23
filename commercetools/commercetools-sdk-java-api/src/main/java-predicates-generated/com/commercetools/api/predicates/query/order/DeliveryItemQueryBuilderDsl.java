
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class DeliveryItemQueryBuilderDsl {
    public DeliveryItemQueryBuilderDsl() {
    }

    public static DeliveryItemQueryBuilderDsl of() {
        return new DeliveryItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DeliveryItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DeliveryItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, DeliveryItemQueryBuilderDsl::of));
    }

}

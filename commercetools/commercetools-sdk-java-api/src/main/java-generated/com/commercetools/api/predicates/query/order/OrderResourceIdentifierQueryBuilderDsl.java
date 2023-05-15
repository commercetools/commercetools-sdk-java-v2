
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderResourceIdentifierQueryBuilderDsl {
    public OrderResourceIdentifierQueryBuilderDsl() {
    }

    public static OrderResourceIdentifierQueryBuilderDsl of() {
        return new OrderResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, OrderResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, OrderResourceIdentifierQueryBuilderDsl::of));
    }
}

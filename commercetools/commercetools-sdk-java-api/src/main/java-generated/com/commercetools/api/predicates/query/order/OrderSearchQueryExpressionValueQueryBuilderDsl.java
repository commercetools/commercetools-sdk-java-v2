
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSearchQueryExpressionValueQueryBuilderDsl {
    public OrderSearchQueryExpressionValueQueryBuilderDsl() {
    }

    public static OrderSearchQueryExpressionValueQueryBuilderDsl of() {
        return new OrderSearchQueryExpressionValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchQueryExpressionValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchQueryExpressionValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchQueryExpressionValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchQueryExpressionValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchQueryExpressionValueQueryBuilderDsl::of));
    }
}

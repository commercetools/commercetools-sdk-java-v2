
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSearchLongRangeValueQueryBuilderDsl {
    public OrderSearchLongRangeValueQueryBuilderDsl() {
    }

    public static OrderSearchLongRangeValueQueryBuilderDsl of() {
        return new OrderSearchLongRangeValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchLongRangeValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchLongRangeValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchLongRangeValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchLongRangeValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchLongRangeValueQueryBuilderDsl> gte() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("gte")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchLongRangeValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchLongRangeValueQueryBuilderDsl> lte() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lte")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchLongRangeValueQueryBuilderDsl::of));
    }
}

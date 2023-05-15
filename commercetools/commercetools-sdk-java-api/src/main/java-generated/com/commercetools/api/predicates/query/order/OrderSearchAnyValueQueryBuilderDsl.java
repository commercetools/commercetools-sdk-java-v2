
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSearchAnyValueQueryBuilderDsl {
    public OrderSearchAnyValueQueryBuilderDsl() {
    }

    public static OrderSearchAnyValueQueryBuilderDsl of() {
        return new OrderSearchAnyValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchAnyValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchAnyValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchAnyValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchAnyValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchAnyValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchAnyValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchAnyValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchAnyValueQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<OrderSearchAnyValueQueryBuilderDsl> caseInsensitive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("caseInsensitive")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchAnyValueQueryBuilderDsl::of));
    }
}

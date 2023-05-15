
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSearchStringValueQueryBuilderDsl {
    public OrderSearchStringValueQueryBuilderDsl() {
    }

    public static OrderSearchStringValueQueryBuilderDsl of() {
        return new OrderSearchStringValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchStringValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchStringValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchStringValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchStringValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchStringValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchStringValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchStringValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchStringValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchStringValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchStringValueQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<OrderSearchStringValueQueryBuilderDsl> caseInsensitive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("caseInsensitive")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchStringValueQueryBuilderDsl::of));
    }
}

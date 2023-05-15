
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSearchFullTextValueQueryBuilderDsl {
    public OrderSearchFullTextValueQueryBuilderDsl() {
    }

    public static OrderSearchFullTextValueQueryBuilderDsl of() {
        return new OrderSearchFullTextValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchFullTextValueQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchFullTextValueQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderSearchFullTextValueQueryBuilderDsl> boost() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("boost")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchFullTextValueQueryBuilderDsl> customType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customType")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchFullTextValueQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchFullTextValueQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchFullTextValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSearchFullTextValueQueryBuilderDsl> mustMatch() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mustMatch")),
            p -> new CombinationQueryPredicate<>(p, OrderSearchFullTextValueQueryBuilderDsl::of));
    }
}

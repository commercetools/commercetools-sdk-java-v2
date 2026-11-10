
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CountOnLineItemUnitsQueryBuilderDsl {
    public CountOnLineItemUnitsQueryBuilderDsl() {
    }

    public static CountOnLineItemUnitsQueryBuilderDsl of() {
        return new CountOnLineItemUnitsQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CountOnLineItemUnitsQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CountOnLineItemUnitsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CountOnLineItemUnitsQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, CountOnLineItemUnitsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CountOnLineItemUnitsQueryBuilderDsl> minCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minCount")),
            p -> new CombinationQueryPredicate<>(p, CountOnLineItemUnitsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CountOnLineItemUnitsQueryBuilderDsl> maxCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxCount")),
            p -> new CombinationQueryPredicate<>(p, CountOnLineItemUnitsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CountOnLineItemUnitsQueryBuilderDsl> excludeCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("excludeCount")),
            p -> new CombinationQueryPredicate<>(p, CountOnLineItemUnitsQueryBuilderDsl::of));
    }

}

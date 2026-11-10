
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CountOnCustomLineItemUnitsQueryBuilderDsl {
    public CountOnCustomLineItemUnitsQueryBuilderDsl() {
    }

    public static CountOnCustomLineItemUnitsQueryBuilderDsl of() {
        return new CountOnCustomLineItemUnitsQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CountOnCustomLineItemUnitsQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CountOnCustomLineItemUnitsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CountOnCustomLineItemUnitsQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, CountOnCustomLineItemUnitsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CountOnCustomLineItemUnitsQueryBuilderDsl> minCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minCount")),
            p -> new CombinationQueryPredicate<>(p, CountOnCustomLineItemUnitsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CountOnCustomLineItemUnitsQueryBuilderDsl> maxCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxCount")),
            p -> new CombinationQueryPredicate<>(p, CountOnCustomLineItemUnitsQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CountOnCustomLineItemUnitsQueryBuilderDsl> excludeCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("excludeCount")),
            p -> new CombinationQueryPredicate<>(p, CountOnCustomLineItemUnitsQueryBuilderDsl::of));
    }

}

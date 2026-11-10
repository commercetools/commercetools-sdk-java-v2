
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class RelativeAllocationQueryBuilderDsl {
    public RelativeAllocationQueryBuilderDsl() {
    }

    public static RelativeAllocationQueryBuilderDsl of() {
        return new RelativeAllocationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RelativeAllocationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RelativeAllocationQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RelativeAllocationQueryBuilderDsl> percentage() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("percentage")),
            p -> new CombinationQueryPredicate<>(p, RelativeAllocationQueryBuilderDsl::of));
    }

}


package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class RelativeAllocationDraftQueryBuilderDsl {
    public RelativeAllocationDraftQueryBuilderDsl() {
    }

    public static RelativeAllocationDraftQueryBuilderDsl of() {
        return new RelativeAllocationDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RelativeAllocationDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RelativeAllocationDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RelativeAllocationDraftQueryBuilderDsl> percentage() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("percentage")),
            p -> new CombinationQueryPredicate<>(p, RelativeAllocationDraftQueryBuilderDsl::of));
    }

}

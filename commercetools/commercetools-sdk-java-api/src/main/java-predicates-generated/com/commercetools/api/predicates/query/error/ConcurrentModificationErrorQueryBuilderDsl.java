
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ConcurrentModificationErrorQueryBuilderDsl {
    public ConcurrentModificationErrorQueryBuilderDsl() {
    }

    public static ConcurrentModificationErrorQueryBuilderDsl of() {
        return new ConcurrentModificationErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ConcurrentModificationErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ConcurrentModificationErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ConcurrentModificationErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ConcurrentModificationErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ConcurrentModificationErrorQueryBuilderDsl> currentVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currentVersion")),
            p -> new CombinationQueryPredicate<>(p, ConcurrentModificationErrorQueryBuilderDsl::of));
    }

}

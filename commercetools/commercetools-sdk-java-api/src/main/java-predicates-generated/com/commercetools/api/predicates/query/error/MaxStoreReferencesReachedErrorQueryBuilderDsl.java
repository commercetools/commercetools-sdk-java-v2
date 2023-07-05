
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class MaxStoreReferencesReachedErrorQueryBuilderDsl {
    public MaxStoreReferencesReachedErrorQueryBuilderDsl() {
    }

    public static MaxStoreReferencesReachedErrorQueryBuilderDsl of() {
        return new MaxStoreReferencesReachedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MaxStoreReferencesReachedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MaxStoreReferencesReachedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MaxStoreReferencesReachedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MaxStoreReferencesReachedErrorQueryBuilderDsl::of));
    }

}

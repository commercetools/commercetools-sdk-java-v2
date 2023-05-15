
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class FeatureRemovedErrorQueryBuilderDsl {
    public FeatureRemovedErrorQueryBuilderDsl() {
    }

    public static FeatureRemovedErrorQueryBuilderDsl of() {
        return new FeatureRemovedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FeatureRemovedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, FeatureRemovedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<FeatureRemovedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, FeatureRemovedErrorQueryBuilderDsl::of));
    }
}

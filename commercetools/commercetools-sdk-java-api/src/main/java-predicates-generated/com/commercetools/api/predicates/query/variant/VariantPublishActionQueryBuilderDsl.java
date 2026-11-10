
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantPublishActionQueryBuilderDsl {
    public VariantPublishActionQueryBuilderDsl() {
    }

    public static VariantPublishActionQueryBuilderDsl of() {
        return new VariantPublishActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantPublishActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantPublishActionQueryBuilderDsl::of));
    }

}

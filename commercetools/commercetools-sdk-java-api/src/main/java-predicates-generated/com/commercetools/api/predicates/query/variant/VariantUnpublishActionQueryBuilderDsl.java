
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantUnpublishActionQueryBuilderDsl {
    public VariantUnpublishActionQueryBuilderDsl() {
    }

    public static VariantUnpublishActionQueryBuilderDsl of() {
        return new VariantUnpublishActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantUnpublishActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantUnpublishActionQueryBuilderDsl::of));
    }

}

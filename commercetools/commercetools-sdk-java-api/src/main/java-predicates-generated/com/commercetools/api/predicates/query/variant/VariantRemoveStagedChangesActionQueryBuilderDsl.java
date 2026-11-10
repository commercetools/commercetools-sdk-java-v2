
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantRemoveStagedChangesActionQueryBuilderDsl {
    public VariantRemoveStagedChangesActionQueryBuilderDsl() {
    }

    public static VariantRemoveStagedChangesActionQueryBuilderDsl of() {
        return new VariantRemoveStagedChangesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantRemoveStagedChangesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveStagedChangesActionQueryBuilderDsl::of));
    }

}

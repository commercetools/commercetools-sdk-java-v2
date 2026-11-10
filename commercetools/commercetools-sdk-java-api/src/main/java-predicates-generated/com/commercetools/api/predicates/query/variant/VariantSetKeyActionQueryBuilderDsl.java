
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantSetKeyActionQueryBuilderDsl {
    public VariantSetKeyActionQueryBuilderDsl() {
    }

    public static VariantSetKeyActionQueryBuilderDsl of() {
        return new VariantSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantSetKeyActionQueryBuilderDsl::of));
    }

}


package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantRemoveImageActionQueryBuilderDsl {
    public VariantRemoveImageActionQueryBuilderDsl() {
    }

    public static VariantRemoveImageActionQueryBuilderDsl of() {
        return new VariantRemoveImageActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantRemoveImageActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveImageActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantRemoveImageActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveImageActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantRemoveImageActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantRemoveImageActionQueryBuilderDsl::of));
    }

}

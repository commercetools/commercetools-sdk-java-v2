
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantUpdateQueryBuilderDsl {
    public VariantUpdateQueryBuilderDsl() {
    }

    public static VariantUpdateQueryBuilderDsl of() {
        return new VariantUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<VariantUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.variant.VariantUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.variant.VariantUpdateActionQueryBuilderDsl.of())),
            VariantUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, VariantUpdateQueryBuilderDsl::of));
    }

}

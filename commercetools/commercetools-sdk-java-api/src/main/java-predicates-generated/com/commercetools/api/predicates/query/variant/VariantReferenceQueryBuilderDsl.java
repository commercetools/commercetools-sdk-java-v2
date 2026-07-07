
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantReferenceQueryBuilderDsl {
    public VariantReferenceQueryBuilderDsl() {
    }

    public static VariantReferenceQueryBuilderDsl of() {
        return new VariantReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, VariantReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.variant.VariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.variant.VariantQueryBuilderDsl.of())),
            VariantReferenceQueryBuilderDsl::of);
    }

}

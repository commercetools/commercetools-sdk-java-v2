
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantAddExternalImageActionQueryBuilderDsl {
    public VariantAddExternalImageActionQueryBuilderDsl() {
    }

    public static VariantAddExternalImageActionQueryBuilderDsl of() {
        return new VariantAddExternalImageActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantAddExternalImageActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantAddExternalImageActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAddExternalImageActionQueryBuilderDsl> image(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("image"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantAddExternalImageActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<VariantAddExternalImageActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantAddExternalImageActionQueryBuilderDsl::of));
    }

}

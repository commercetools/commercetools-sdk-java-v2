
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSetImagesActionQueryBuilderDsl {
    public VariantSetImagesActionQueryBuilderDsl() {
    }

    public static VariantSetImagesActionQueryBuilderDsl of() {
        return new VariantSetImagesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetImagesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImagesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSetImagesActionQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantSetImagesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantSetImagesActionQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImagesActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetImagesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetImagesActionQueryBuilderDsl::of));
    }

}

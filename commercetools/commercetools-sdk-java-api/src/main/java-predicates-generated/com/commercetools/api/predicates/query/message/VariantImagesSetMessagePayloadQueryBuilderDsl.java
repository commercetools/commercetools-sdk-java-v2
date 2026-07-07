
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantImagesSetMessagePayloadQueryBuilderDsl {
    public VariantImagesSetMessagePayloadQueryBuilderDsl() {
    }

    public static VariantImagesSetMessagePayloadQueryBuilderDsl of() {
        return new VariantImagesSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantImagesSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImagesSetMessagePayloadQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantImagesSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantImagesSetMessagePayloadQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImagesSetMessagePayloadQueryBuilderDsl> oldImages(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldImages"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantImagesSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantImagesSetMessagePayloadQueryBuilderDsl> oldImages() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldImages")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantImagesSetMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessagePayloadQueryBuilderDsl::of));
    }

}

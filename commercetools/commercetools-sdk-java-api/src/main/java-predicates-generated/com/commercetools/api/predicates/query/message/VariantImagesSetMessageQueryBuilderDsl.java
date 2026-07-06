
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantImagesSetMessageQueryBuilderDsl {
    public VariantImagesSetMessageQueryBuilderDsl() {
    }

    public static VariantImagesSetMessageQueryBuilderDsl of() {
        return new VariantImagesSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImagesSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            VariantImagesSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantImagesSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            VariantImagesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImagesSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            VariantImagesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImagesSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            VariantImagesSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantImagesSetMessageQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantImagesSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantImagesSetMessageQueryBuilderDsl> oldImages(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldImages"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            VariantImagesSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> oldImages() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldImages")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantImagesSetMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantImagesSetMessageQueryBuilderDsl::of));
    }

}

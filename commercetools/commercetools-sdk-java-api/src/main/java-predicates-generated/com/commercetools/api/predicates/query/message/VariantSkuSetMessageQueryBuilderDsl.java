
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSkuSetMessageQueryBuilderDsl {
    public VariantSkuSetMessageQueryBuilderDsl() {
    }

    public static VariantSkuSetMessageQueryBuilderDsl of() {
        return new VariantSkuSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSkuSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            VariantSkuSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantSkuSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            VariantSkuSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSkuSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            VariantSkuSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSkuSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            VariantSkuSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> oldSku() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldSku")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSkuSetMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessageQueryBuilderDsl::of));
    }

}

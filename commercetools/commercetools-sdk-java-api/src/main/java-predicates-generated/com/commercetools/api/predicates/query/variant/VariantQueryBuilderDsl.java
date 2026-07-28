
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantQueryBuilderDsl {
    public VariantQueryBuilderDsl() {
    }

    public static VariantQueryBuilderDsl of() {
        return new VariantQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<VariantQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            VariantQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            VariantQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<VariantQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            VariantQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<VariantQueryBuilderDsl> published() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("published")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantQueryBuilderDsl> current(
            Function<com.commercetools.api.predicates.query.variant.VariantDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("current"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.variant.VariantDataQueryBuilderDsl.of())),
            VariantQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantQueryBuilderDsl> staged(
            Function<com.commercetools.api.predicates.query.variant.VariantDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("staged"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.variant.VariantDataQueryBuilderDsl.of())),
            VariantQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantQueryBuilderDsl> warnings(
            Function<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("warnings"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl.of())),
            VariantQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantQueryBuilderDsl> warnings() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("warnings")),
            p -> new CombinationQueryPredicate<>(p, VariantQueryBuilderDsl::of));
    }

}

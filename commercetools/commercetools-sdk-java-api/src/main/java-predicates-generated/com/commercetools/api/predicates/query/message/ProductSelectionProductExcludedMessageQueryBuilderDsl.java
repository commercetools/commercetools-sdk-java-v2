
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionProductExcludedMessageQueryBuilderDsl {
    public ProductSelectionProductExcludedMessageQueryBuilderDsl() {
    }

    public static ProductSelectionProductExcludedMessageQueryBuilderDsl of() {
        return new ProductSelectionProductExcludedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductSelectionProductExcludedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductSelectionProductExcludedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductSelectionProductExcludedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionProductExcludedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductSelectionProductExcludedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessageQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionProductExcludedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessageQueryBuilderDsl> variantExclusion(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl
                            .of())),
            ProductSelectionProductExcludedMessageQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl {
    public ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl() {
    }

    public static ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl of() {
        return new ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> oldVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldVariantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl> newVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("newVariantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl::of);
    }

}

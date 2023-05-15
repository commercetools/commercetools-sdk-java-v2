
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductAddedToCategoryMessageQueryBuilderDsl {
    public ProductAddedToCategoryMessageQueryBuilderDsl() {
    }

    public static ProductAddedToCategoryMessageQueryBuilderDsl of() {
        return new ProductAddedToCategoryMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddedToCategoryMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductAddedToCategoryMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductAddedToCategoryMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductAddedToCategoryMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddedToCategoryMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductAddedToCategoryMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddedToCategoryMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductAddedToCategoryMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductAddedToCategoryMessageQueryBuilderDsl> category(
            Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("category"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            ProductAddedToCategoryMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductAddedToCategoryMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessageQueryBuilderDsl::of));
    }
}

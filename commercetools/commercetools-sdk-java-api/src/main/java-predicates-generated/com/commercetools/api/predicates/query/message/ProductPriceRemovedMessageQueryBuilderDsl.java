
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceRemovedMessageQueryBuilderDsl {
    public ProductPriceRemovedMessageQueryBuilderDsl() {
    }

    public static ProductPriceRemovedMessageQueryBuilderDsl of() {
        return new ProductPriceRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPriceRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPriceRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPriceRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPriceRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceRemovedMessageQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductPriceRemovedMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductPriceRemovedMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceRemovedMessageQueryBuilderDsl::of));
    }

}

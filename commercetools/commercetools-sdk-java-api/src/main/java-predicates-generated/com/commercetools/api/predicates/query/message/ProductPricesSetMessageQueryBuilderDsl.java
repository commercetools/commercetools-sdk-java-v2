
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPricesSetMessageQueryBuilderDsl {
    public ProductPricesSetMessageQueryBuilderDsl() {
    }

    public static ProductPricesSetMessageQueryBuilderDsl of() {
        return new ProductPricesSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPricesSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPricesSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPricesSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPricesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPricesSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPricesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPricesSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPricesSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPricesSetMessageQueryBuilderDsl> prices(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prices"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductPricesSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductPricesSetMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessageQueryBuilderDsl::of));
    }

}

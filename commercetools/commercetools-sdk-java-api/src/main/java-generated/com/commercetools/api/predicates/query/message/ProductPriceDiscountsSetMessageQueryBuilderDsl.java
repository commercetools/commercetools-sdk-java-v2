
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceDiscountsSetMessageQueryBuilderDsl {
    public ProductPriceDiscountsSetMessageQueryBuilderDsl() {
    }

    public static ProductPriceDiscountsSetMessageQueryBuilderDsl of() {
        return new ProductPriceDiscountsSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPriceDiscountsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPriceDiscountsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPriceDiscountsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPriceDiscountsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetMessageQueryBuilderDsl> updatedPrices(
            Function<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("updatedPrices"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl
                            .of())),
            ProductPriceDiscountsSetMessageQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductPriceDiscountsSetMessageQueryBuilderDsl> updatedPrices() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updatedPrices")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessageQueryBuilderDsl::of));
    }
}

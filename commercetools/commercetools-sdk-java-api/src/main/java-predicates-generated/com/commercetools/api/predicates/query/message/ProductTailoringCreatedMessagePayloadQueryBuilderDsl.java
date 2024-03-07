
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringCreatedMessagePayloadQueryBuilderDsl {
    public ProductTailoringCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductTailoringCreatedMessagePayloadQueryBuilderDsl of() {
        return new ProductTailoringCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringCreatedMessagePayloadQueryBuilderDsl> published() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("published")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringCreatedMessagePayloadQueryBuilderDsl::of));
    }

}

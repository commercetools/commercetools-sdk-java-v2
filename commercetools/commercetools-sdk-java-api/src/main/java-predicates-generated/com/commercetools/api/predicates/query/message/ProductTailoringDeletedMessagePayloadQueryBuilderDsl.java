
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringDeletedMessagePayloadQueryBuilderDsl {
    public ProductTailoringDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductTailoringDeletedMessagePayloadQueryBuilderDsl of() {
        return new ProductTailoringDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringDeletedMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductTailoringDeletedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTailoringDeletedMessagePayloadQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringDeletedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductTailoringDeletedMessagePayloadQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl {
    public ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl of() {
        return new ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl::of);
    }

}

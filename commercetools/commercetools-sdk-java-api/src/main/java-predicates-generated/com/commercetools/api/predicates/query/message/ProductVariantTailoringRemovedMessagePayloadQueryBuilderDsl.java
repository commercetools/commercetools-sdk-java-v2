
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl {
    public ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl of() {
        return new ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variant"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl
                            .of())),
            ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl::of);
    }

}

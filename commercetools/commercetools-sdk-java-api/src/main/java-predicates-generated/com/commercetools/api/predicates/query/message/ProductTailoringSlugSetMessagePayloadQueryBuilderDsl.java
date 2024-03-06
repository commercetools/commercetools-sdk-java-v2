
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSlugSetMessagePayloadQueryBuilderDsl {
    public ProductTailoringSlugSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductTailoringSlugSetMessagePayloadQueryBuilderDsl of() {
        return new ProductTailoringSlugSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSlugSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSlugSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSlugSetMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductTailoringSlugSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTailoringSlugSetMessagePayloadQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSlugSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSlugSetMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductTailoringSlugSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringSlugSetMessagePayloadQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSlugSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringSlugSetMessagePayloadQueryBuilderDsl> oldSlug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldSlug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSlugSetMessagePayloadQueryBuilderDsl::of);
    }

}

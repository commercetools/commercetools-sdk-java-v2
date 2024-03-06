
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringNameSetMessagePayloadQueryBuilderDsl {
    public ProductTailoringNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductTailoringNameSetMessagePayloadQueryBuilderDsl of() {
        return new ProductTailoringNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringNameSetMessagePayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductTailoringNameSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTailoringNameSetMessagePayloadQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringNameSetMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductTailoringNameSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringNameSetMessagePayloadQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringNameSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringNameSetMessagePayloadQueryBuilderDsl> oldName(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldName"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringNameSetMessagePayloadQueryBuilderDsl::of);
    }

}

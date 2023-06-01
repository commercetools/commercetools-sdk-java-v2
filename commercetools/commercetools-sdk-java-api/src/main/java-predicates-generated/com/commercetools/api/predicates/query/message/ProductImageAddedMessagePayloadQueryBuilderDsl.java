package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductImageAddedMessagePayloadQueryBuilderDsl  {
    public ProductImageAddedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductImageAddedMessagePayloadQueryBuilderDsl of() {
        return new ProductImageAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductImageAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductImageAddedMessagePayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductImageAddedMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductImageAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductImageAddedMessagePayloadQueryBuilderDsl> image(
        Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("image"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductImageAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductImageAddedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductImageAddedMessagePayloadQueryBuilderDsl::of));
    }
    
}

package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl  {
    public ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> variantKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantKey")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> discounted(
        Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discounted"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }
    
}

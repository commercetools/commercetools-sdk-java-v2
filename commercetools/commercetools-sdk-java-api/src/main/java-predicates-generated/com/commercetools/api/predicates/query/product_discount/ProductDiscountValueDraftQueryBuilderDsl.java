package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDiscountValueDraftQueryBuilderDsl  {
    public ProductDiscountValueDraftQueryBuilderDsl() {
    }

    public static ProductDiscountValueDraftQueryBuilderDsl of() {
        return new ProductDiscountValueDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountValueDraftQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ProductDiscountValueDraftQueryBuilderDsl> asAbsolute(
        Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueAbsoluteDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueAbsoluteDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_discount.ProductDiscountValueAbsoluteDraftQueryBuilderDsl.of()),
            ProductDiscountValueDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductDiscountValueDraftQueryBuilderDsl> asExternal(
        Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueExternalDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueExternalDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_discount.ProductDiscountValueExternalDraftQueryBuilderDsl.of()),
            ProductDiscountValueDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ProductDiscountValueDraftQueryBuilderDsl> asRelative(
        Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueRelativeDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueRelativeDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.product_discount.ProductDiscountValueRelativeDraftQueryBuilderDsl.of()),
            ProductDiscountValueDraftQueryBuilderDsl::of);
    }
}

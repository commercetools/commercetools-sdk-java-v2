package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDiscountDraftQueryBuilderDsl  {
    public ProductDiscountDraftQueryBuilderDsl() {
    }

    public static ProductDiscountDraftQueryBuilderDsl of() {
        return new ProductDiscountDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductDiscountDraftQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDiscountDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ProductDiscountDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductDiscountDraftQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDiscountDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDiscountDraftQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_discount.ProductDiscountValueDraftQueryBuilderDsl.of())),
            ProductDiscountDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ProductDiscountDraftQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductDiscountDraftQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductDiscountDraftQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountDraftQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductDiscountDraftQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountDraftQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductDiscountDraftQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountDraftQueryBuilderDsl::of));
    }
    
}

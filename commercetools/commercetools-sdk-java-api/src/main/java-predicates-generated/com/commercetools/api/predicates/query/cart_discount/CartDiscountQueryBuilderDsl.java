package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountQueryBuilderDsl  {
    public CartDiscountQueryBuilderDsl() {
    }

    public static CartDiscountQueryBuilderDsl of() {
        return new CartDiscountQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountValueQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> cartPredicate() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartPredicate")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> target(
        Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("target"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> requiresDiscountCode() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requiresDiscountCode")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> references(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("references"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CartDiscountQueryBuilderDsl> references() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("references")),
                p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartDiscountQueryBuilderDsl> stackingMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stackingMode")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartDiscountQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CartDiscountQueryBuilderDsl::of);
    }
    
    
}

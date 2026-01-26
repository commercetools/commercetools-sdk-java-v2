
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountDraftQueryBuilderDsl {
    public CartDiscountDraftQueryBuilderDsl() {
    }

    public static CartDiscountDraftQueryBuilderDsl of() {
        return new CartDiscountDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("value"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountValueDraftQueryBuilderDsl.of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> cartPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartPredicate")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> target(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("target"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart_discount.CartDiscountTargetQueryBuilderDsl.of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartDiscountDraftQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> requiresDiscountCode() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requiresDiscountCode")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountDraftQueryBuilderDsl> stackingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stackingMode")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> discountGroup(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountDraftQueryBuilderDsl> recurringOrderScope(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderScopeDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderScopeDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurringOrderScope"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.RecurringOrderScopeDraftQueryBuilderDsl
                            .of())),
            CartDiscountDraftQueryBuilderDsl::of);
    }

}

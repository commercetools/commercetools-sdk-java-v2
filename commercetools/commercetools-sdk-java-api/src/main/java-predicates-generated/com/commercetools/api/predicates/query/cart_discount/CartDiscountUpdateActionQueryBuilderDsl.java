
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountUpdateActionQueryBuilderDsl {
    public CartDiscountUpdateActionQueryBuilderDsl() {
    }

    public static CartDiscountUpdateActionQueryBuilderDsl of() {
        return new CartDiscountUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asAddStore(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountAddStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountAddStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountAddStoreActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeCartPredicate(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeCartPredicateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeCartPredicateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeCartPredicateActionQueryBuilderDsl
                    .of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeIsActive(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeIsActiveActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeIsActiveActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeIsActiveActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeNameActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeRequiresDiscountCode(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeRequiresDiscountCodeActionQueryBuilderDsl
                    .of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeSortOrder(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeSortOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeSortOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeSortOrderActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeStackingMode(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeStackingModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeStackingModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeStackingModeActionQueryBuilderDsl
                    .of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeTarget(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeTargetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeTargetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeTargetActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asChangeValue(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountChangeValueActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asRemoveStore(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountRemoveStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountRemoveStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountRemoveStoreActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountSetCustomFieldActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountSetCustomTypeActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountSetDescriptionActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.cart_discount.CartDiscountSetKeyActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetStores(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetStoresActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetStoresActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.cart_discount.CartDiscountSetStoresActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetValidFrom(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidFromActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidFromActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidFromActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetValidFromAndUntil(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidFromAndUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidFromAndUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidFromAndUntilActionQueryBuilderDsl
                    .of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountUpdateActionQueryBuilderDsl> asSetValidUntil(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.cart_discount.CartDiscountSetValidUntilActionQueryBuilderDsl.of()),
            CartDiscountUpdateActionQueryBuilderDsl::of);
    }
}

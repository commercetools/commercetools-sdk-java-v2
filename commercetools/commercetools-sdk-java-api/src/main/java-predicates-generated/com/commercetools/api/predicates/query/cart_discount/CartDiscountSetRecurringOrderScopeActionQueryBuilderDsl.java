
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl {
    public CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl() {
    }

    public static CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl of() {
        return new CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl> recurringOrderScope(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderScopeDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderScopeDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurringOrderScope"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.RecurringOrderScopeDraftQueryBuilderDsl
                            .of())),
            CartDiscountSetRecurringOrderScopeActionQueryBuilderDsl::of);
    }

}

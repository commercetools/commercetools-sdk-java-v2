
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemRecurrenceInfoActionQueryBuilderDsl {
    public CartSetLineItemRecurrenceInfoActionQueryBuilderDsl() {
    }

    public static CartSetLineItemRecurrenceInfoActionQueryBuilderDsl of() {
        return new CartSetLineItemRecurrenceInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemRecurrenceInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemRecurrenceInfoActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemRecurrenceInfoActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetLineItemRecurrenceInfoActionQueryBuilderDsl> recurrenceInfo(
            Function<com.commercetools.api.predicates.query.recurring_order.LineItemRecurrenceInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.LineItemRecurrenceInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrenceInfo"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.LineItemRecurrenceInfoDraftQueryBuilderDsl
                            .of())),
            CartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of);
    }

}

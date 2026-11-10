
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl {
    public CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl() {
    }

    public static CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl of() {
        return new CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> recurrenceInfo(
            Function<com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrenceInfo"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl
                            .of())),
            CartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of);
    }

}

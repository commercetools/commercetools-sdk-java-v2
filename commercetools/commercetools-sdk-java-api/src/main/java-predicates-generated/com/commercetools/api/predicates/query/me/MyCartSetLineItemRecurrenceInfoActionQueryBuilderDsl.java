
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl {
    public MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl() {
    }

    public static MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl of() {
        return new MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl> recurrenceInfo(
            Function<com.commercetools.api.predicates.query.recurring_order.LineItemRecurrenceInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.LineItemRecurrenceInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrenceInfo"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.LineItemRecurrenceInfoDraftQueryBuilderDsl
                            .of())),
            MyCartSetLineItemRecurrenceInfoActionQueryBuilderDsl::of);
    }

}

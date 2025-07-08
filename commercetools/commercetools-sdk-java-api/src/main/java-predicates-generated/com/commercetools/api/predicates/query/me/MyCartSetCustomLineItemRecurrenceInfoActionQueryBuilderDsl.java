
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl {
    public MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl() {
    }

    public static MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl of() {
        return new MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl> recurrenceInfo(
            Function<com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrenceInfo"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl
                            .of())),
            MyCartSetCustomLineItemRecurrenceInfoActionQueryBuilderDsl::of);
    }

}

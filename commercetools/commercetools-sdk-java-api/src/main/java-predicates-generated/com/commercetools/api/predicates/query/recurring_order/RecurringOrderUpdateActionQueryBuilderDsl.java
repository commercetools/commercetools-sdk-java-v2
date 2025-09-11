
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderUpdateActionQueryBuilderDsl {
    public RecurringOrderUpdateActionQueryBuilderDsl() {
    }

    public static RecurringOrderUpdateActionQueryBuilderDsl of() {
        return new RecurringOrderUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetCustomFieldActionQueryBuilderDsl
                    .of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetCustomTypeActionQueryBuilderDsl
                    .of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetExpiresAt(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetExpiresAtActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetExpiresAtActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetExpiresAtActionQueryBuilderDsl
                    .of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetKeyActionQueryBuilderDsl.of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetOrderSkipConfiguration(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetOrderSkipConfigurationActionQueryBuilderDsl
                    .of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetSchedule(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetScheduleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetScheduleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetScheduleActionQueryBuilderDsl.of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetStartsAt(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetStartsAtActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetStartsAtActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetStartsAtActionQueryBuilderDsl.of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asSetRecurringOrderState(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderSetStateActionQueryBuilderDsl.of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.RecurringOrderTransitionStateActionQueryBuilderDsl
                    .of()),
            RecurringOrderUpdateActionQueryBuilderDsl::of);
    }
}

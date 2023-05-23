
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEditUpdateActionQueryBuilderDsl {
    public OrderEditUpdateActionQueryBuilderDsl() {
    }

    public static OrderEditUpdateActionQueryBuilderDsl of() {
        return new OrderEditUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderEditUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEditUpdateActionQueryBuilderDsl> asAddStagedAction(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditAddStagedActionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditAddStagedActionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.OrderEditAddStagedActionActionQueryBuilderDsl.of()),
            OrderEditUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditUpdateActionQueryBuilderDsl> asSetComment(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditSetCommentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditSetCommentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditSetCommentActionQueryBuilderDsl.of()),
            OrderEditUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.OrderEditSetCustomFieldActionQueryBuilderDsl.of()),
            OrderEditUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.OrderEditSetCustomTypeActionQueryBuilderDsl.of()),
            OrderEditUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditSetKeyActionQueryBuilderDsl.of()),
            OrderEditUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditUpdateActionQueryBuilderDsl> asSetStagedActions(
            Function<com.commercetools.api.predicates.query.order_edit.OrderEditSetStagedActionsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditSetStagedActionsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.order_edit.OrderEditSetStagedActionsActionQueryBuilderDsl.of()),
            OrderEditUpdateActionQueryBuilderDsl::of);
    }
}

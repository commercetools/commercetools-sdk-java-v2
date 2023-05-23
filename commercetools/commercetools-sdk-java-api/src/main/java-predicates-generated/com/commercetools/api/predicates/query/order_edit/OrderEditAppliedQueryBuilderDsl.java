
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderEditAppliedQueryBuilderDsl {
    public OrderEditAppliedQueryBuilderDsl() {
    }

    public static OrderEditAppliedQueryBuilderDsl of() {
        return new OrderEditAppliedQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditAppliedQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderEditAppliedQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderEditAppliedQueryBuilderDsl> appliedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("appliedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderEditAppliedQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderEditAppliedQueryBuilderDsl> excerptBeforeEdit(
            Function<com.commercetools.api.predicates.query.order_edit.OrderExcerptQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderExcerptQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("excerptBeforeEdit"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderExcerptQueryBuilderDsl.of())),
            OrderEditAppliedQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderEditAppliedQueryBuilderDsl> excerptAfterEdit(
            Function<com.commercetools.api.predicates.query.order_edit.OrderExcerptQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderExcerptQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("excerptAfterEdit"))
                .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderExcerptQueryBuilderDsl.of())),
            OrderEditAppliedQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl {
    public OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl of() {
        return new OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl> recurringOrderRef(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurringOrderRef"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.RecurringOrderReferenceQueryBuilderDsl
                            .of())),
            OrderCreatedFromRecurringOrderMessagePayloadQueryBuilderDsl::of);
    }

}

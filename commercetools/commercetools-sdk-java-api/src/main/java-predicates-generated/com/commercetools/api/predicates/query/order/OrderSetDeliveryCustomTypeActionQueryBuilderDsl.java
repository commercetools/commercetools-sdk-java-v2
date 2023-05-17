
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetDeliveryCustomTypeActionQueryBuilderDsl {
    public OrderSetDeliveryCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderSetDeliveryCustomTypeActionQueryBuilderDsl of() {
        return new OrderSetDeliveryCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomTypeActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomTypeActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetDeliveryCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderSetDeliveryCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSetDeliveryCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderSetDeliveryCustomTypeActionQueryBuilderDsl::of);
    }

}

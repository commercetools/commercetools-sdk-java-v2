
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl {
    public OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl of() {
        return new OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of);
    }

}

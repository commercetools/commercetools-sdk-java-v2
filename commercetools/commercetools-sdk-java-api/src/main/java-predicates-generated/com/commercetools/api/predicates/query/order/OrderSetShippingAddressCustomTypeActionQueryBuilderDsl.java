
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetShippingAddressCustomTypeActionQueryBuilderDsl {
    public OrderSetShippingAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderSetShippingAddressCustomTypeActionQueryBuilderDsl of() {
        return new OrderSetShippingAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetShippingAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetShippingAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderSetShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderSetShippingAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderSetShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }

}

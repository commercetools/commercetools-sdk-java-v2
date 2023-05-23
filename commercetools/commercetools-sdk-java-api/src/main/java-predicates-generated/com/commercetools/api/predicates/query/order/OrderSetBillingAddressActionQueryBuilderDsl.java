
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetBillingAddressActionQueryBuilderDsl {
    public OrderSetBillingAddressActionQueryBuilderDsl() {
    }

    public static OrderSetBillingAddressActionQueryBuilderDsl of() {
        return new OrderSetBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetBillingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetBillingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderSetBillingAddressActionQueryBuilderDsl::of);
    }

}

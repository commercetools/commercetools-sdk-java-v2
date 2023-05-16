
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderRemoveItemShippingAddressActionQueryBuilderDsl {
    public OrderRemoveItemShippingAddressActionQueryBuilderDsl() {
    }

    public static OrderRemoveItemShippingAddressActionQueryBuilderDsl of() {
        return new OrderRemoveItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderRemoveItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderRemoveItemShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, OrderRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }

}


package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderShippingAddressSetMessagePayloadQueryBuilderDsl {
    public OrderShippingAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderShippingAddressSetMessagePayloadQueryBuilderDsl of() {
        return new OrderShippingAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShippingAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShippingAddressSetMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderShippingAddressSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderShippingAddressSetMessagePayloadQueryBuilderDsl> oldAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderShippingAddressSetMessagePayloadQueryBuilderDsl::of);
    }

}

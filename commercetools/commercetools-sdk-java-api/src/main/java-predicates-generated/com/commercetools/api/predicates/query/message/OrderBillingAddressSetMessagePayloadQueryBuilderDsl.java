package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderBillingAddressSetMessagePayloadQueryBuilderDsl  {
    public OrderBillingAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderBillingAddressSetMessagePayloadQueryBuilderDsl of() {
        return new OrderBillingAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderBillingAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderBillingAddressSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderBillingAddressSetMessagePayloadQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderBillingAddressSetMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderBillingAddressSetMessagePayloadQueryBuilderDsl> oldAddress(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            OrderBillingAddressSetMessagePayloadQueryBuilderDsl::of);
    }
    
    
}

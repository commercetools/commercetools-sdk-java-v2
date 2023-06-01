package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetDeliveryAddressActionQueryBuilderDsl  {
    public StagedOrderSetDeliveryAddressActionQueryBuilderDsl() {
    }

    public static StagedOrderSetDeliveryAddressActionQueryBuilderDsl of() {
        return new StagedOrderSetDeliveryAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryAddressActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryAddressActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetDeliveryAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderSetDeliveryAddressActionQueryBuilderDsl::of);
    }
    
    
}

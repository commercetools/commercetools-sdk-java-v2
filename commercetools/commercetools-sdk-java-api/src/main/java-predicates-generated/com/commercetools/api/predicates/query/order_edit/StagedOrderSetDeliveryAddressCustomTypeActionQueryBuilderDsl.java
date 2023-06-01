package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl  {
    public StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl of() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StagedOrderSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}

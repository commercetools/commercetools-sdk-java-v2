package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl  {
    public StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}

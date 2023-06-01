package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetBillingAddressActionQueryBuilderDsl  {
    public StagedOrderSetBillingAddressActionQueryBuilderDsl() {
    }

    public static StagedOrderSetBillingAddressActionQueryBuilderDsl of() {
        return new StagedOrderSetBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetBillingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetBillingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderSetBillingAddressActionQueryBuilderDsl::of);
    }
    
    
}

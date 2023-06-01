package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartSetBillingAddressActionQueryBuilderDsl  {
    public MyCartSetBillingAddressActionQueryBuilderDsl() {
    }

    public static MyCartSetBillingAddressActionQueryBuilderDsl of() {
        return new MyCartSetBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetBillingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartSetBillingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartSetBillingAddressActionQueryBuilderDsl::of);
    }
    
    
}

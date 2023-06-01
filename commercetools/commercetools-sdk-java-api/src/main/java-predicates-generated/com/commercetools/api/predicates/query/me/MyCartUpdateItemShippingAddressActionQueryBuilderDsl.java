package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartUpdateItemShippingAddressActionQueryBuilderDsl  {
    public MyCartUpdateItemShippingAddressActionQueryBuilderDsl() {
    }

    public static MyCartUpdateItemShippingAddressActionQueryBuilderDsl of() {
        return new MyCartUpdateItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartUpdateItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartUpdateItemShippingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartUpdateItemShippingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartUpdateItemShippingAddressActionQueryBuilderDsl::of);
    }
    
    
}

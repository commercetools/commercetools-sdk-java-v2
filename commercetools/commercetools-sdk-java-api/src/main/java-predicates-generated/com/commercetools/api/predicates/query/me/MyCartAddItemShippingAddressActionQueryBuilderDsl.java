package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartAddItemShippingAddressActionQueryBuilderDsl  {
    public MyCartAddItemShippingAddressActionQueryBuilderDsl() {
    }

    public static MyCartAddItemShippingAddressActionQueryBuilderDsl of() {
        return new MyCartAddItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartAddItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddItemShippingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartAddItemShippingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartAddItemShippingAddressActionQueryBuilderDsl::of);
    }
    
    
}

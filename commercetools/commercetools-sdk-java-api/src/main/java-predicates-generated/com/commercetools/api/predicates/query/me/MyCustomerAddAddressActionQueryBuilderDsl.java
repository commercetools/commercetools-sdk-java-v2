package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerAddAddressActionQueryBuilderDsl  {
    public MyCustomerAddAddressActionQueryBuilderDsl() {
    }

    public static MyCustomerAddAddressActionQueryBuilderDsl of() {
        return new MyCustomerAddAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerAddAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerAddAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCustomerAddAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCustomerAddAddressActionQueryBuilderDsl::of);
    }
    
    
}

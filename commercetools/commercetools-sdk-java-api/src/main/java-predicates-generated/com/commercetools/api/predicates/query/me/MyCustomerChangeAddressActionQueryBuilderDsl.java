package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerChangeAddressActionQueryBuilderDsl  {
    public MyCustomerChangeAddressActionQueryBuilderDsl() {
    }

    public static MyCustomerChangeAddressActionQueryBuilderDsl of() {
        return new MyCustomerChangeAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerChangeAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerChangeAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerChangeAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerChangeAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerChangeAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerChangeAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCustomerChangeAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCustomerChangeAddressActionQueryBuilderDsl::of);
    }
    
    
}

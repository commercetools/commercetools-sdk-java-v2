package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitChangeAddressActionQueryBuilderDsl  {
    public MyBusinessUnitChangeAddressActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitChangeAddressActionQueryBuilderDsl of() {
        return new MyBusinessUnitChangeAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitChangeAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitChangeAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitChangeAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyBusinessUnitChangeAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyBusinessUnitChangeAddressActionQueryBuilderDsl::of);
    }
    
    
}

package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl  {
    public MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl of() {
        return new MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl::of));
    }
    
}

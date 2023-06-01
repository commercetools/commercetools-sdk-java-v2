package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl  {
    public MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl of() {
        return new MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
    
}

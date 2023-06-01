package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl  {
    public MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl of() {
        return new MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl::of));
    }
    
}

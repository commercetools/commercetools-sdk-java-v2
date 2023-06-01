package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl  {
    public MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl of() {
        return new MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    
}

package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl  {
    public MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl() {
    }

    public static MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl of() {
        return new MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    
}

package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerRemoveBillingAddressIdActionQueryBuilderDsl  {
    public CustomerRemoveBillingAddressIdActionQueryBuilderDsl() {
    }

    public static CustomerRemoveBillingAddressIdActionQueryBuilderDsl of() {
        return new CustomerRemoveBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerRemoveBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerRemoveBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, CustomerRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerRemoveBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, CustomerRemoveBillingAddressIdActionQueryBuilderDsl::of));
    }
    
}

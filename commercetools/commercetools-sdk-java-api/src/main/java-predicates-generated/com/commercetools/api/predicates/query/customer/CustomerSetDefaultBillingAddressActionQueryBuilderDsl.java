package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetDefaultBillingAddressActionQueryBuilderDsl  {
    public CustomerSetDefaultBillingAddressActionQueryBuilderDsl() {
    }

    public static CustomerSetDefaultBillingAddressActionQueryBuilderDsl of() {
        return new CustomerSetDefaultBillingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetDefaultBillingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetDefaultBillingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetDefaultBillingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetDefaultBillingAddressActionQueryBuilderDsl::of));
    }
    
}

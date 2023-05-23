
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerAddBillingAddressIdActionQueryBuilderDsl {
    public CustomerAddBillingAddressIdActionQueryBuilderDsl() {
    }

    public static CustomerAddBillingAddressIdActionQueryBuilderDsl of() {
        return new CustomerAddBillingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddBillingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddBillingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddBillingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddBillingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddBillingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddBillingAddressIdActionQueryBuilderDsl::of));
    }

}

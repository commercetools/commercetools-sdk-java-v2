
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerAddShippingAddressIdActionQueryBuilderDsl {
    public CustomerAddShippingAddressIdActionQueryBuilderDsl() {
    }

    public static CustomerAddShippingAddressIdActionQueryBuilderDsl of() {
        return new CustomerAddShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddShippingAddressIdActionQueryBuilderDsl::of));
    }
}

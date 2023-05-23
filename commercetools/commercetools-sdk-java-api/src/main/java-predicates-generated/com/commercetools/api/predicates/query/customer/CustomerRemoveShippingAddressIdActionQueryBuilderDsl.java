
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerRemoveShippingAddressIdActionQueryBuilderDsl {
    public CustomerRemoveShippingAddressIdActionQueryBuilderDsl() {
    }

    public static CustomerRemoveShippingAddressIdActionQueryBuilderDsl of() {
        return new CustomerRemoveShippingAddressIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerRemoveShippingAddressIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerRemoveShippingAddressIdActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerRemoveShippingAddressIdActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveShippingAddressIdActionQueryBuilderDsl::of));
    }

}

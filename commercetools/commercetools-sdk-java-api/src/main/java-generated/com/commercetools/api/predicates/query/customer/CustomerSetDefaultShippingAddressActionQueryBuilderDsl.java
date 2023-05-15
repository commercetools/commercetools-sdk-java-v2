
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetDefaultShippingAddressActionQueryBuilderDsl {
    public CustomerSetDefaultShippingAddressActionQueryBuilderDsl() {
    }

    public static CustomerSetDefaultShippingAddressActionQueryBuilderDsl of() {
        return new CustomerSetDefaultShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetDefaultShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetDefaultShippingAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetDefaultShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetDefaultShippingAddressActionQueryBuilderDsl::of));
    }
}

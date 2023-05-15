
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerRemoveAddressActionQueryBuilderDsl {
    public CustomerRemoveAddressActionQueryBuilderDsl() {
    }

    public static CustomerRemoveAddressActionQueryBuilderDsl of() {
        return new CustomerRemoveAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerRemoveAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerRemoveAddressActionQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerRemoveAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CustomerRemoveAddressActionQueryBuilderDsl::of));
    }
}

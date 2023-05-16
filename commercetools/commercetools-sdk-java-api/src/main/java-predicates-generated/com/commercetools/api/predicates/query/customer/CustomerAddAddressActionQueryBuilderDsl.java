
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerAddAddressActionQueryBuilderDsl {
    public CustomerAddAddressActionQueryBuilderDsl() {
    }

    public static CustomerAddAddressActionQueryBuilderDsl of() {
        return new CustomerAddAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CustomerAddAddressActionQueryBuilderDsl::of);
    }

}

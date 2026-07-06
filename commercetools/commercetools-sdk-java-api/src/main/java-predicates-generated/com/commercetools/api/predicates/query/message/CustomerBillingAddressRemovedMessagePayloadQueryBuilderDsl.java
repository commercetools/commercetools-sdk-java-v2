
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl {
    public CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerBillingAddressRemovedMessagePayloadQueryBuilderDsl::of);
    }

}

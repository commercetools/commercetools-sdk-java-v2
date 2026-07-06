
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl {
    public CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl of() {
        return new CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerBillingAddressAddedMessagePayloadQueryBuilderDsl::of);
    }

}

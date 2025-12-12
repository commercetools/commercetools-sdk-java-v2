
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl {
    public CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerShippingAddressRemovedMessagePayloadQueryBuilderDsl::of);
    }

}

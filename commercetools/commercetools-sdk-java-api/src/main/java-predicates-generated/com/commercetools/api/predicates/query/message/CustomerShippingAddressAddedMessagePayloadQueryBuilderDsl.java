
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl {
    public CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl of() {
        return new CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerShippingAddressAddedMessagePayloadQueryBuilderDsl::of);
    }

}

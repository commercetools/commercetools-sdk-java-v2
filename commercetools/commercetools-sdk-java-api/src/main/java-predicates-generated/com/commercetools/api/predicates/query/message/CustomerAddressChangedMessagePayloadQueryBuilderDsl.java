
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerAddressChangedMessagePayloadQueryBuilderDsl {
    public CustomerAddressChangedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerAddressChangedMessagePayloadQueryBuilderDsl of() {
        return new CustomerAddressChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddressChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddressChangedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerAddressChangedMessagePayloadQueryBuilderDsl::of);
    }

}

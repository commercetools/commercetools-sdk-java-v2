
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerAddressRemovedMessagePayloadQueryBuilderDsl {
    public CustomerAddressRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerAddressRemovedMessagePayloadQueryBuilderDsl of() {
        return new CustomerAddressRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddressRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddressRemovedMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerAddressRemovedMessagePayloadQueryBuilderDsl::of);
    }

}

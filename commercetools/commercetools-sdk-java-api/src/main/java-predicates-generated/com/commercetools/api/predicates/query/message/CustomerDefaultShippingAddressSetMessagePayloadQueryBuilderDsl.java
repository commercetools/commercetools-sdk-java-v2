
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl {
    public CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerDefaultShippingAddressSetMessagePayloadQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl {
    public CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl of() {
        return new CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerDefaultBillingAddressSetMessagePayloadQueryBuilderDsl::of);
    }

}

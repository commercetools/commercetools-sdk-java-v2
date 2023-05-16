
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl {
    public BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl::of);
    }

}

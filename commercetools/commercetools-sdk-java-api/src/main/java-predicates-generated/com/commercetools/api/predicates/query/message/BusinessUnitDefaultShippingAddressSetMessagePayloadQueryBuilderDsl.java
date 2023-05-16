
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl {
    public BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl::of);
    }

}

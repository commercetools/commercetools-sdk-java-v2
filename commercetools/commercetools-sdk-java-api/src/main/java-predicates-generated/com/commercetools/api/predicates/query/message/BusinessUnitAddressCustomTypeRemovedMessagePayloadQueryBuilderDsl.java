
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}

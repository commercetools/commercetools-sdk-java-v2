
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}

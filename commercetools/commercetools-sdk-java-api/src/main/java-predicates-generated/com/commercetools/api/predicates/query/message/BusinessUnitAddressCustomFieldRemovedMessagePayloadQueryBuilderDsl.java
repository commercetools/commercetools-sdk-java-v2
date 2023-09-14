
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}

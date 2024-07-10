
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

}

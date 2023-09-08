
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl> oldValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldValue")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

}

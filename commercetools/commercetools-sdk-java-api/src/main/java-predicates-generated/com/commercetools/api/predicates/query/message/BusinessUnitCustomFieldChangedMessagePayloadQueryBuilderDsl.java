
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl> oldValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldValue")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

}

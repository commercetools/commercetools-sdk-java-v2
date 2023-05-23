
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl> active() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl::of));
    }

}

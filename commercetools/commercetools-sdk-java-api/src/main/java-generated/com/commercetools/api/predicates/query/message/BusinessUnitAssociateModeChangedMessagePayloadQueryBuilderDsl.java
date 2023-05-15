
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl> oldAssociateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldAssociateMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl::of));
    }
}


package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitChangeAssociateModeActionQueryBuilderDsl {
    public BusinessUnitChangeAssociateModeActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeAssociateModeActionQueryBuilderDsl of() {
        return new BusinessUnitChangeAssociateModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeAssociateModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeAssociateModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeAssociateModeActionQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeAssociateModeActionQueryBuilderDsl::of));
    }

}

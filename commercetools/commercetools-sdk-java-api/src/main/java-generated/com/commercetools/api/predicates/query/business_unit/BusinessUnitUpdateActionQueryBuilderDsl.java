
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitUpdateActionQueryBuilderDsl {
    public BusinessUnitUpdateActionQueryBuilderDsl() {
    }

    public static BusinessUnitUpdateActionQueryBuilderDsl of() {
        return new BusinessUnitUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitUpdateActionQueryBuilderDsl::of));
    }
}

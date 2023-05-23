
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetContactEmailActionQueryBuilderDsl {
    public BusinessUnitSetContactEmailActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetContactEmailActionQueryBuilderDsl of() {
        return new BusinessUnitSetContactEmailActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetContactEmailActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetContactEmailActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetContactEmailActionQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetContactEmailActionQueryBuilderDsl::of));
    }

}

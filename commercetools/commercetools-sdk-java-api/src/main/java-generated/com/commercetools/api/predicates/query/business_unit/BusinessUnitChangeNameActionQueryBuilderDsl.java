
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitChangeNameActionQueryBuilderDsl {
    public BusinessUnitChangeNameActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeNameActionQueryBuilderDsl of() {
        return new BusinessUnitChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeNameActionQueryBuilderDsl::of));
    }
}

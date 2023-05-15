
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetCustomFieldActionQueryBuilderDsl {
    public BusinessUnitSetCustomFieldActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetCustomFieldActionQueryBuilderDsl of() {
        return new BusinessUnitSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetCustomFieldActionQueryBuilderDsl::of));
    }
}


package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetUnitTypeActionQueryBuilderDsl {
    public BusinessUnitSetUnitTypeActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetUnitTypeActionQueryBuilderDsl of() {
        return new BusinessUnitSetUnitTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetUnitTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetUnitTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetUnitTypeActionQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetUnitTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitSetUnitTypeActionQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            BusinessUnitSetUnitTypeActionQueryBuilderDsl::of);
    }

}

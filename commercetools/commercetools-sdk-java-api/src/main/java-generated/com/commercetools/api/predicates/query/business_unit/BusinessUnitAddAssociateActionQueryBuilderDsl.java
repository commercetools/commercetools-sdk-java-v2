
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddAssociateActionQueryBuilderDsl {
    public BusinessUnitAddAssociateActionQueryBuilderDsl() {
    }

    public static BusinessUnitAddAssociateActionQueryBuilderDsl of() {
        return new BusinessUnitAddAssociateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddAssociateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddAssociateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddAssociateActionQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            BusinessUnitAddAssociateActionQueryBuilderDsl::of);
    }

}

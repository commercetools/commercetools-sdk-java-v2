
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitChangeAssociateActionQueryBuilderDsl {
    public BusinessUnitChangeAssociateActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeAssociateActionQueryBuilderDsl of() {
        return new BusinessUnitChangeAssociateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeAssociateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeAssociateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitChangeAssociateActionQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            BusinessUnitChangeAssociateActionQueryBuilderDsl::of);
    }

}

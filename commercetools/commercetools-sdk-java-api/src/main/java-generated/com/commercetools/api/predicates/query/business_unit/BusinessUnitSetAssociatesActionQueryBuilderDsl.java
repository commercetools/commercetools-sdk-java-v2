
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitSetAssociatesActionQueryBuilderDsl {
    public BusinessUnitSetAssociatesActionQueryBuilderDsl() {
    }

    public static BusinessUnitSetAssociatesActionQueryBuilderDsl of() {
        return new BusinessUnitSetAssociatesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitSetAssociatesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAssociatesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitSetAssociatesActionQueryBuilderDsl> associates(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            BusinessUnitSetAssociatesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitSetAssociatesActionQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitSetAssociatesActionQueryBuilderDsl::of));
    }
}

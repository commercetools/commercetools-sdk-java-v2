
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitChangeAssociateActionQueryBuilderDsl {
    public MyBusinessUnitChangeAssociateActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitChangeAssociateActionQueryBuilderDsl of() {
        return new MyBusinessUnitChangeAssociateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitChangeAssociateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeAssociateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitChangeAssociateActionQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            MyBusinessUnitChangeAssociateActionQueryBuilderDsl::of);
    }

}

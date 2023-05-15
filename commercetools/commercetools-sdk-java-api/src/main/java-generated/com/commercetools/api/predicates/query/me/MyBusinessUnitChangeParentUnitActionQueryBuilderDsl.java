
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitChangeParentUnitActionQueryBuilderDsl {
    public MyBusinessUnitChangeParentUnitActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitChangeParentUnitActionQueryBuilderDsl of() {
        return new MyBusinessUnitChangeParentUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitChangeParentUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitChangeParentUnitActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitChangeParentUnitActionQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            MyBusinessUnitChangeParentUnitActionQueryBuilderDsl::of);
    }

}

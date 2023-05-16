
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetBusinessUnitActionQueryBuilderDsl {
    public MyCartSetBusinessUnitActionQueryBuilderDsl() {
    }

    public static MyCartSetBusinessUnitActionQueryBuilderDsl of() {
        return new MyCartSetBusinessUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetBusinessUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetBusinessUnitActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetBusinessUnitActionQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            MyCartSetBusinessUnitActionQueryBuilderDsl::of);
    }

}

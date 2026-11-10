
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetBusinessUnitActionQueryBuilderDsl {
    public StagedOrderSetBusinessUnitActionQueryBuilderDsl() {
    }

    public static StagedOrderSetBusinessUnitActionQueryBuilderDsl of() {
        return new StagedOrderSetBusinessUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetBusinessUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetBusinessUnitActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetBusinessUnitActionQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            StagedOrderSetBusinessUnitActionQueryBuilderDsl::of);
    }

}

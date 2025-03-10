
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetBusinessUnitActionQueryBuilderDsl {
    public OrderSetBusinessUnitActionQueryBuilderDsl() {
    }

    public static OrderSetBusinessUnitActionQueryBuilderDsl of() {
        return new OrderSetBusinessUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetBusinessUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetBusinessUnitActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetBusinessUnitActionQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            OrderSetBusinessUnitActionQueryBuilderDsl::of);
    }

}

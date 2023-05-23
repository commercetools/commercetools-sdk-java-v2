
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetBusinessUnitActionQueryBuilderDsl {
    public CartSetBusinessUnitActionQueryBuilderDsl() {
    }

    public static CartSetBusinessUnitActionQueryBuilderDsl of() {
        return new CartSetBusinessUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetBusinessUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetBusinessUnitActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetBusinessUnitActionQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            CartSetBusinessUnitActionQueryBuilderDsl::of);
    }

}

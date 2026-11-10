
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetBusinessUnitActionQueryBuilderDsl {
    public ShoppingListSetBusinessUnitActionQueryBuilderDsl() {
    }

    public static ShoppingListSetBusinessUnitActionQueryBuilderDsl of() {
        return new ShoppingListSetBusinessUnitActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetBusinessUnitActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetBusinessUnitActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListSetBusinessUnitActionQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            ShoppingListSetBusinessUnitActionQueryBuilderDsl::of);
    }

}

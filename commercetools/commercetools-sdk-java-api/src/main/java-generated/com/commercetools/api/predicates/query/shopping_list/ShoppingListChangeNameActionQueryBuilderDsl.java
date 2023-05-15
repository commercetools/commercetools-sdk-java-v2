
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListChangeNameActionQueryBuilderDsl {
    public ShoppingListChangeNameActionQueryBuilderDsl() {
    }

    public static ShoppingListChangeNameActionQueryBuilderDsl of() {
        return new ShoppingListChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListChangeNameActionQueryBuilderDsl::of);
    }

}

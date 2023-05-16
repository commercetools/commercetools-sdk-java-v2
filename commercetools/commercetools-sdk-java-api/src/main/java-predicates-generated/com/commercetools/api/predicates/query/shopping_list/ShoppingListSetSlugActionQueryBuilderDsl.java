
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetSlugActionQueryBuilderDsl {
    public ShoppingListSetSlugActionQueryBuilderDsl() {
    }

    public static ShoppingListSetSlugActionQueryBuilderDsl of() {
        return new ShoppingListSetSlugActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetSlugActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetSlugActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListSetSlugActionQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListSetSlugActionQueryBuilderDsl::of);
    }

}

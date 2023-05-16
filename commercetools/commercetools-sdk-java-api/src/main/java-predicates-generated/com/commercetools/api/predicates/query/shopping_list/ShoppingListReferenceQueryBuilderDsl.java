
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListReferenceQueryBuilderDsl {
    public ShoppingListReferenceQueryBuilderDsl() {
    }

    public static ShoppingListReferenceQueryBuilderDsl of() {
        return new ShoppingListReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl.of())),
            ShoppingListReferenceQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListUpdateQueryBuilderDsl {
    public MyShoppingListUpdateQueryBuilderDsl() {
    }

    public static MyShoppingListUpdateQueryBuilderDsl of() {
        return new MyShoppingListUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MyShoppingListUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.me.MyShoppingListUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.me.MyShoppingListUpdateActionQueryBuilderDsl.of())),
            MyShoppingListUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyShoppingListUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListUpdateQueryBuilderDsl::of));
    }

}

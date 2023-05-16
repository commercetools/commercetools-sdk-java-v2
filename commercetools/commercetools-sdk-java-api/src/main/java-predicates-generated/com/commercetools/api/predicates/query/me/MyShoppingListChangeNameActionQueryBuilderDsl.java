
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListChangeNameActionQueryBuilderDsl {
    public MyShoppingListChangeNameActionQueryBuilderDsl() {
    }

    public static MyShoppingListChangeNameActionQueryBuilderDsl of() {
        return new MyShoppingListChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyShoppingListChangeNameActionQueryBuilderDsl::of);
    }

}

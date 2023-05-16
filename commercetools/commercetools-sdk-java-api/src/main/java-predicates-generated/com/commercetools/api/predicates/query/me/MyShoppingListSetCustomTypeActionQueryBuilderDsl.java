
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListSetCustomTypeActionQueryBuilderDsl {
    public MyShoppingListSetCustomTypeActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetCustomTypeActionQueryBuilderDsl of() {
        return new MyShoppingListSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyShoppingListSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyShoppingListSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyShoppingListSetCustomTypeActionQueryBuilderDsl::of);
    }

}

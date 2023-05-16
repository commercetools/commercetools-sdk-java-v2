
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl {
    public MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl of() {
        return new MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }

}

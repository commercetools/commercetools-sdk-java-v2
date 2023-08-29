
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl {
    public MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl of() {
        return new MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> textLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of);
    }

}

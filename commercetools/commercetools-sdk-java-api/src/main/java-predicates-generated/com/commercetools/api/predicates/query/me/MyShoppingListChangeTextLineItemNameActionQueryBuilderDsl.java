
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl {
    public MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl() {
    }

    public static MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl of() {
        return new MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl> textLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of);
    }

}

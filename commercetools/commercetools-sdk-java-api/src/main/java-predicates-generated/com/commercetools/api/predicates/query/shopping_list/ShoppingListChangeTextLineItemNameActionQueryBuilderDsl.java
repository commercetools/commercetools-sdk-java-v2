
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListChangeTextLineItemNameActionQueryBuilderDsl {
    public ShoppingListChangeTextLineItemNameActionQueryBuilderDsl() {
    }

    public static ShoppingListChangeTextLineItemNameActionQueryBuilderDsl of() {
        return new ShoppingListChangeTextLineItemNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeTextLineItemNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeTextLineItemNameActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListChangeTextLineItemNameActionQueryBuilderDsl> textLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListChangeTextLineItemNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListChangeTextLineItemNameActionQueryBuilderDsl::of);
    }

}

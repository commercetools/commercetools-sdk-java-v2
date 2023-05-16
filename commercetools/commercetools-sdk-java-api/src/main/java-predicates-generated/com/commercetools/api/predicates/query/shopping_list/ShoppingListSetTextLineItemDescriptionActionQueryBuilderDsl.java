
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl {
    public ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl() {
    }

    public static ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl of() {
        return new ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl {
    public ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl of() {
        return new ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl> lineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItem"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl.of())),
            ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl::of);
    }

}

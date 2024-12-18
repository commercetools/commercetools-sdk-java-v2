
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListMessagePayloadQueryBuilderDsl {
    public ShoppingListMessagePayloadQueryBuilderDsl() {
    }

    public static ShoppingListMessagePayloadQueryBuilderDsl of() {
        return new ShoppingListMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListMessagePayloadQueryBuilderDsl> asShoppingListLineItemAdded(
            Function<com.commercetools.api.predicates.query.message.ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl.of()),
            ShoppingListMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListMessagePayloadQueryBuilderDsl> asShoppingListLineItemRemoved(
            Function<com.commercetools.api.predicates.query.message.ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ShoppingListLineItemRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            ShoppingListMessagePayloadQueryBuilderDsl::of);
    }
}

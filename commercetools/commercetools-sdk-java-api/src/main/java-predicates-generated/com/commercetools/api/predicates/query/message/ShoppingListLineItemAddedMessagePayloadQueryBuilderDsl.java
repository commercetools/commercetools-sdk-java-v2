
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl {
    public ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl() {
    }

    public static ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl of() {
        return new ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl> lineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItem"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl.of())),
            ShoppingListLineItemAddedMessagePayloadQueryBuilderDsl::of);
    }

}

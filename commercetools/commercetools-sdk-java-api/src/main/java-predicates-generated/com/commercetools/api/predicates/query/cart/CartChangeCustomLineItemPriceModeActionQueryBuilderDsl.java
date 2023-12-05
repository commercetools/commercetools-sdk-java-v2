
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartChangeCustomLineItemPriceModeActionQueryBuilderDsl {
    public CartChangeCustomLineItemPriceModeActionQueryBuilderDsl() {
    }

    public static CartChangeCustomLineItemPriceModeActionQueryBuilderDsl of() {
        return new CartChangeCustomLineItemPriceModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemPriceModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemPriceModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemPriceModeActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemPriceModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemPriceModeActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemPriceModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemPriceModeActionQueryBuilderDsl> mode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mode")),
            p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemPriceModeActionQueryBuilderDsl::of));
    }

}

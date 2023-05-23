
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartRemoveCustomLineItemActionQueryBuilderDsl {
    public CartRemoveCustomLineItemActionQueryBuilderDsl() {
    }

    public static CartRemoveCustomLineItemActionQueryBuilderDsl of() {
        return new CartRemoveCustomLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemoveCustomLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveCustomLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartRemoveCustomLineItemActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveCustomLineItemActionQueryBuilderDsl::of));
    }

}

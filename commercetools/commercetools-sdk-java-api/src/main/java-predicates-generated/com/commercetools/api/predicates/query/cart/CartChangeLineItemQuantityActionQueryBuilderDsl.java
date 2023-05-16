
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartChangeLineItemQuantityActionQueryBuilderDsl {
    public CartChangeLineItemQuantityActionQueryBuilderDsl() {
    }

    public static CartChangeLineItemQuantityActionQueryBuilderDsl of() {
        return new CartChangeLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeLineItemQuantityActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartChangeLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartChangeLineItemQuantityActionQueryBuilderDsl> externalPrice(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartChangeLineItemQuantityActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartChangeLineItemQuantityActionQueryBuilderDsl> externalTotalPrice(
            Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            CartChangeLineItemQuantityActionQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetLineItemPriceActionQueryBuilderDsl {
    public CartSetLineItemPriceActionQueryBuilderDsl() {
    }

    public static CartSetLineItemPriceActionQueryBuilderDsl of() {
        return new CartSetLineItemPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemPriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetLineItemPriceActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetLineItemPriceActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetLineItemPriceActionQueryBuilderDsl> externalPrice(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartSetLineItemPriceActionQueryBuilderDsl::of);
    }

}

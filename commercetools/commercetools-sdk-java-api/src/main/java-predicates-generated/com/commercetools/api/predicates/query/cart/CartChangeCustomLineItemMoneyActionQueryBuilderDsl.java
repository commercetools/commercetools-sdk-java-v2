
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartChangeCustomLineItemMoneyActionQueryBuilderDsl {
    public CartChangeCustomLineItemMoneyActionQueryBuilderDsl() {
    }

    public static CartChangeCustomLineItemMoneyActionQueryBuilderDsl of() {
        return new CartChangeCustomLineItemMoneyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemMoneyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemMoneyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartChangeCustomLineItemMoneyActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartChangeCustomLineItemMoneyActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartChangeCustomLineItemMoneyActionQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartChangeCustomLineItemMoneyActionQueryBuilderDsl::of);
    }

}

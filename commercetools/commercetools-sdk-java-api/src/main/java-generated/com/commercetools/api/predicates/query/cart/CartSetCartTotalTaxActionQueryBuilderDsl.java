
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetCartTotalTaxActionQueryBuilderDsl {
    public CartSetCartTotalTaxActionQueryBuilderDsl() {
    }

    public static CartSetCartTotalTaxActionQueryBuilderDsl of() {
        return new CartSetCartTotalTaxActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCartTotalTaxActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCartTotalTaxActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetCartTotalTaxActionQueryBuilderDsl> externalTotalGross(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTotalGross"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartSetCartTotalTaxActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartSetCartTotalTaxActionQueryBuilderDsl> externalTaxPortions(
            Function<com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxPortions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl.of())),
            CartSetCartTotalTaxActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartSetCartTotalTaxActionQueryBuilderDsl> externalTaxPortions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalTaxPortions")),
            p -> new CombinationQueryPredicate<>(p, CartSetCartTotalTaxActionQueryBuilderDsl::of));
    }
}

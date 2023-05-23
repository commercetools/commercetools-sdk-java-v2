
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetCustomLineItemCustomTypeActionQueryBuilderDsl {
    public CartSetCustomLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static CartSetCustomLineItemCustomTypeActionQueryBuilderDsl of() {
        return new CartSetCustomLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomLineItemCustomTypeActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetCustomLineItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CartSetCustomLineItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartSetCustomLineItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CartSetCustomLineItemCustomTypeActionQueryBuilderDsl::of);
    }

}

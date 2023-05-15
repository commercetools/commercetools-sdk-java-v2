
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl {
    public CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl of() {
        return new CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CartSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }

}

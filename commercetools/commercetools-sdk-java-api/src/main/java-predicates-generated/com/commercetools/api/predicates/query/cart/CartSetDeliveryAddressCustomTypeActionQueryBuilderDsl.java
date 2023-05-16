
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl {
    public CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl of() {
        return new CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CartSetDeliveryAddressCustomTypeActionQueryBuilderDsl::of);
    }

}

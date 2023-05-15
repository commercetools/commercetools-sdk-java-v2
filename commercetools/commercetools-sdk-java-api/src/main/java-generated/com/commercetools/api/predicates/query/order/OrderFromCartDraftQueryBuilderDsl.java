
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderFromCartDraftQueryBuilderDsl {
    public OrderFromCartDraftQueryBuilderDsl() {
    }

    public static OrderFromCartDraftQueryBuilderDsl of() {
        return new OrderFromCartDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderFromCartDraftQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of())),
            OrderFromCartDraftQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderFromCartDraftQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
            p -> new CombinationQueryPredicate<>(p, OrderFromCartDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderFromCartDraftQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            OrderFromCartDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderFromCartDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            OrderFromCartDraftQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl {
    public OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            OrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of);
    }

}

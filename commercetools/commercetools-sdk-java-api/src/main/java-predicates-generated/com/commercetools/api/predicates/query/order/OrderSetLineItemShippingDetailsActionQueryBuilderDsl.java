package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetLineItemShippingDetailsActionQueryBuilderDsl  {
    public OrderSetLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static OrderSetLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new OrderSetLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetLineItemShippingDetailsActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, OrderSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            OrderSetLineItemShippingDetailsActionQueryBuilderDsl::of);
    }
    
    
}

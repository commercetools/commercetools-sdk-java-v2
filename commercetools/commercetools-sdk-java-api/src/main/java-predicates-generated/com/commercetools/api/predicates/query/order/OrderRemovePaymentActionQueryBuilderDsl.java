
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderRemovePaymentActionQueryBuilderDsl {
    public OrderRemovePaymentActionQueryBuilderDsl() {
    }

    public static OrderRemovePaymentActionQueryBuilderDsl of() {
        return new OrderRemovePaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderRemovePaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderRemovePaymentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderRemovePaymentActionQueryBuilderDsl> payment(
            Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("payment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            OrderRemovePaymentActionQueryBuilderDsl::of);
    }

}

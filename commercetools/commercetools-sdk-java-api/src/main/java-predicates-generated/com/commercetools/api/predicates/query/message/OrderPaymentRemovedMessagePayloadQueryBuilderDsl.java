
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderPaymentRemovedMessagePayloadQueryBuilderDsl {
    public OrderPaymentRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderPaymentRemovedMessagePayloadQueryBuilderDsl of() {
        return new OrderPaymentRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPaymentRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderPaymentRemovedMessagePayloadQueryBuilderDsl> paymentRef(
            Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentRef"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of())),
            OrderPaymentRemovedMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<OrderPaymentRemovedMessagePayloadQueryBuilderDsl> removedPaymentInfo() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedPaymentInfo")),
            p -> new CombinationQueryPredicate<>(p, OrderPaymentRemovedMessagePayloadQueryBuilderDsl::of));
    }

}

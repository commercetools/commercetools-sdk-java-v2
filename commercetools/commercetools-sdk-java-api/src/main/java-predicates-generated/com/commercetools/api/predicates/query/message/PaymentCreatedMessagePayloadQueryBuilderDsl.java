
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentCreatedMessagePayloadQueryBuilderDsl {
    public PaymentCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentCreatedMessagePayloadQueryBuilderDsl of() {
        return new PaymentCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentCreatedMessagePayloadQueryBuilderDsl> payment(
            Function<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("payment"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl.of())),
            PaymentCreatedMessagePayloadQueryBuilderDsl::of);
    }

}

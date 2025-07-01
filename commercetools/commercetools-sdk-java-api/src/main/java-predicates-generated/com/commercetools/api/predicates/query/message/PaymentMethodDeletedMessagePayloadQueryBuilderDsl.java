
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodDeletedMessagePayloadQueryBuilderDsl {
    public PaymentMethodDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodDeletedMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDeletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodDeletedMessagePayloadQueryBuilderDsl> paymentMethod(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentMethod"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl.of())),
            PaymentMethodDeletedMessagePayloadQueryBuilderDsl::of);
    }

}

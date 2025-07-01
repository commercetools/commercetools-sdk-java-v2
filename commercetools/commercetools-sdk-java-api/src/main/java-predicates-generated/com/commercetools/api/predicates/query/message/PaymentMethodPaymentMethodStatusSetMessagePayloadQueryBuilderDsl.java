
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p,
                PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl> oldStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStatus")),
            p -> new CombinationQueryPredicate<>(p,
                PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl::of));
    }

}

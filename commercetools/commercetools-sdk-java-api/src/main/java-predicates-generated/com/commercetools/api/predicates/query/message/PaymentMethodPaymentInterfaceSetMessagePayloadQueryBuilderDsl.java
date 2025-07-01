
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl> oldPaymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPaymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl::of));
    }

}

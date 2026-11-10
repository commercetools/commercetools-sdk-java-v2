
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl {
    public PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl of() {
        return new PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl> paymentMethodStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentMethodStatus")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl::of));
    }

}

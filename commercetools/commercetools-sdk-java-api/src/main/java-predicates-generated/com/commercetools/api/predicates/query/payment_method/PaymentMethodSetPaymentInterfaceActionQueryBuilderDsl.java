
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl {
    public PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl of() {
        return new PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl::of));
    }

}

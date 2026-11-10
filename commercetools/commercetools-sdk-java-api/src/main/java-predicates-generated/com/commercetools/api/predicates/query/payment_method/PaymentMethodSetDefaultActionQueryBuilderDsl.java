
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetDefaultActionQueryBuilderDsl {
    public PaymentMethodSetDefaultActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetDefaultActionQueryBuilderDsl of() {
        return new PaymentMethodSetDefaultActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetDefaultActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetDefaultActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<PaymentMethodSetDefaultActionQueryBuilderDsl> _default() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("default")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetDefaultActionQueryBuilderDsl::of));
    }

}

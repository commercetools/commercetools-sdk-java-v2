
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetMethodActionQueryBuilderDsl {
    public PaymentMethodSetMethodActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetMethodActionQueryBuilderDsl of() {
        return new PaymentMethodSetMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetMethodActionQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetMethodActionQueryBuilderDsl::of));
    }

}

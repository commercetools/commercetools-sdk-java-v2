
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentUpdateActionQueryBuilderDsl {
    public PaymentUpdateActionQueryBuilderDsl() {
    }

    public static PaymentUpdateActionQueryBuilderDsl of() {
        return new PaymentUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentUpdateActionQueryBuilderDsl::of));
    }
}

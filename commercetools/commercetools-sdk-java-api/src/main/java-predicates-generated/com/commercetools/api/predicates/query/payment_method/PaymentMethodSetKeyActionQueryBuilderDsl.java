
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetKeyActionQueryBuilderDsl {
    public PaymentMethodSetKeyActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetKeyActionQueryBuilderDsl of() {
        return new PaymentMethodSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetKeyActionQueryBuilderDsl::of));
    }

}

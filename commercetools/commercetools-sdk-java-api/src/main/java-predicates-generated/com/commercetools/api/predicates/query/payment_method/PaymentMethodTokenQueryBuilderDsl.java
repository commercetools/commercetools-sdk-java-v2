
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodTokenQueryBuilderDsl {
    public PaymentMethodTokenQueryBuilderDsl() {
    }

    public static PaymentMethodTokenQueryBuilderDsl of() {
        return new PaymentMethodTokenQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodTokenQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodTokenQueryBuilderDsl::of));
    }

}

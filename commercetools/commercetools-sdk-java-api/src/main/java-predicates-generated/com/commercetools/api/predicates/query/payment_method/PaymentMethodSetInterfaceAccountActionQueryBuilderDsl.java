
package com.commercetools.api.predicates.query.payment_method;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetInterfaceAccountActionQueryBuilderDsl {
    public PaymentMethodSetInterfaceAccountActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetInterfaceAccountActionQueryBuilderDsl of() {
        return new PaymentMethodSetInterfaceAccountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetInterfaceAccountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetInterfaceAccountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetInterfaceAccountActionQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetInterfaceAccountActionQueryBuilderDsl::of));
    }

}

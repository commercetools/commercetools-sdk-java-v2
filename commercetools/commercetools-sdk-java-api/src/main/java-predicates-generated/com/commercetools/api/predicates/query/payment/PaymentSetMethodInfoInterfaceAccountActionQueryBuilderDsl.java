
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl {
    public PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl::of));
    }

}


package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetMethodInfoInterfaceActionQueryBuilderDsl {
    public PaymentSetMethodInfoInterfaceActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoInterfaceActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoInterfaceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoInterfaceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoInterfaceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoInterfaceActionQueryBuilderDsl> _interface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interface")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoInterfaceActionQueryBuilderDsl::of));
    }

}

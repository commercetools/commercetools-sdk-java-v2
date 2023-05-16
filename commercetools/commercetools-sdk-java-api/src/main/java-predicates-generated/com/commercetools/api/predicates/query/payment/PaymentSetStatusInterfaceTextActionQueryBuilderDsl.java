
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetStatusInterfaceTextActionQueryBuilderDsl {
    public PaymentSetStatusInterfaceTextActionQueryBuilderDsl() {
    }

    public static PaymentSetStatusInterfaceTextActionQueryBuilderDsl of() {
        return new PaymentSetStatusInterfaceTextActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetStatusInterfaceTextActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetStatusInterfaceTextActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetStatusInterfaceTextActionQueryBuilderDsl> interfaceText() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceText")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetStatusInterfaceTextActionQueryBuilderDsl::of));
    }

}

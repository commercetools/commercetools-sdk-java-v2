
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetStatusInterfaceCodeActionQueryBuilderDsl {
    public PaymentSetStatusInterfaceCodeActionQueryBuilderDsl() {
    }

    public static PaymentSetStatusInterfaceCodeActionQueryBuilderDsl of() {
        return new PaymentSetStatusInterfaceCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetStatusInterfaceCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetStatusInterfaceCodeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetStatusInterfaceCodeActionQueryBuilderDsl> interfaceCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceCode")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetStatusInterfaceCodeActionQueryBuilderDsl::of));
    }
}

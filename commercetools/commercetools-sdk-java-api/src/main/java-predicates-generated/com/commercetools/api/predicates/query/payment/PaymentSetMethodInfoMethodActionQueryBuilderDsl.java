
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetMethodInfoMethodActionQueryBuilderDsl {
    public PaymentSetMethodInfoMethodActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoMethodActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoMethodActionQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoMethodActionQueryBuilderDsl::of));
    }

}

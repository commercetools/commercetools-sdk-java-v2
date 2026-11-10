
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentSetMethodInfoTokenActionQueryBuilderDsl {
    public PaymentSetMethodInfoTokenActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoTokenActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoTokenActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoTokenActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoTokenActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentSetMethodInfoTokenActionQueryBuilderDsl> token(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("token"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl.of())),
            PaymentSetMethodInfoTokenActionQueryBuilderDsl::of);
    }

}

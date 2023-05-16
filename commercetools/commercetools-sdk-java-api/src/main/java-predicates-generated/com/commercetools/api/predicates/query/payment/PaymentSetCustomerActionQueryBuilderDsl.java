
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentSetCustomerActionQueryBuilderDsl {
    public PaymentSetCustomerActionQueryBuilderDsl() {
    }

    public static PaymentSetCustomerActionQueryBuilderDsl of() {
        return new PaymentSetCustomerActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetCustomerActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetCustomerActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentSetCustomerActionQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            PaymentSetCustomerActionQueryBuilderDsl::of);
    }

}

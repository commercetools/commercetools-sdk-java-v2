
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentUpdateQueryBuilderDsl {
    public PaymentUpdateQueryBuilderDsl() {
    }

    public static PaymentUpdateQueryBuilderDsl of() {
        return new PaymentUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PaymentUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.payment.PaymentUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment.PaymentUpdateActionQueryBuilderDsl.of())),
            PaymentUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<PaymentUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, PaymentUpdateQueryBuilderDsl::of));
    }
}

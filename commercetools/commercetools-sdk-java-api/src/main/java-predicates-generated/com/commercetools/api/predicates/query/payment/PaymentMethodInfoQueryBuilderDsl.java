
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoQueryBuilderDsl {
    public PaymentMethodInfoQueryBuilderDsl() {
    }

    public static PaymentMethodInfoQueryBuilderDsl of() {
        return new PaymentMethodInfoQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodInfoQueryBuilderDsl::of);
    }

}

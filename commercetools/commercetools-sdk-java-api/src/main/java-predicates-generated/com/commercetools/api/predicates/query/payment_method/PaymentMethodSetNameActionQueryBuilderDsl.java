
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetNameActionQueryBuilderDsl {
    public PaymentMethodSetNameActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetNameActionQueryBuilderDsl of() {
        return new PaymentMethodSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodSetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodSetNameActionQueryBuilderDsl::of);
    }

}

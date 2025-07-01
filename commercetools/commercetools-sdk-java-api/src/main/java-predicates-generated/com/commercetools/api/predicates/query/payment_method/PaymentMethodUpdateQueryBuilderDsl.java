
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodUpdateQueryBuilderDsl {
    public PaymentMethodUpdateQueryBuilderDsl() {
    }

    public static PaymentMethodUpdateQueryBuilderDsl of() {
        return new PaymentMethodUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PaymentMethodUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.payment_method.PaymentMethodUpdateActionQueryBuilderDsl
                            .of())),
            PaymentMethodUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<PaymentMethodUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodUpdateQueryBuilderDsl::of));
    }

}

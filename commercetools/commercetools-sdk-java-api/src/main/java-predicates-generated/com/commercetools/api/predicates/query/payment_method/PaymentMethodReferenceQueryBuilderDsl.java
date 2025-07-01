
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodReferenceQueryBuilderDsl {
    public PaymentMethodReferenceQueryBuilderDsl() {
    }

    public static PaymentMethodReferenceQueryBuilderDsl of() {
        return new PaymentMethodReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodQueryBuilderDsl.of())),
            PaymentMethodReferenceQueryBuilderDsl::of);
    }

}

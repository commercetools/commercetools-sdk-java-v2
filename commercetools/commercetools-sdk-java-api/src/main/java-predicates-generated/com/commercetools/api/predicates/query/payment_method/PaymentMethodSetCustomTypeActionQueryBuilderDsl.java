
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodSetCustomTypeActionQueryBuilderDsl {
    public PaymentMethodSetCustomTypeActionQueryBuilderDsl() {
    }

    public static PaymentMethodSetCustomTypeActionQueryBuilderDsl of() {
        return new PaymentMethodSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            PaymentMethodSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            PaymentMethodSetCustomTypeActionQueryBuilderDsl::of);
    }

}

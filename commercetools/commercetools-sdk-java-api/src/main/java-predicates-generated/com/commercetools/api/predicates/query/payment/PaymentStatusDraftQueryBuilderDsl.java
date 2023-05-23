
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentStatusDraftQueryBuilderDsl {
    public PaymentStatusDraftQueryBuilderDsl() {
    }

    public static PaymentStatusDraftQueryBuilderDsl of() {
        return new PaymentStatusDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentStatusDraftQueryBuilderDsl> interfaceCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceCode")),
            p -> new CombinationQueryPredicate<>(p, PaymentStatusDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentStatusDraftQueryBuilderDsl> interfaceText() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceText")),
            p -> new CombinationQueryPredicate<>(p, PaymentStatusDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentStatusDraftQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            PaymentStatusDraftQueryBuilderDsl::of);
    }

}

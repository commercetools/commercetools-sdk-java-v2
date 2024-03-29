
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentSetTransactionCustomTypeActionQueryBuilderDsl {
    public PaymentSetTransactionCustomTypeActionQueryBuilderDsl() {
    }

    public static PaymentSetTransactionCustomTypeActionQueryBuilderDsl of() {
        return new PaymentSetTransactionCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetTransactionCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetTransactionCustomTypeActionQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentSetTransactionCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            PaymentSetTransactionCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentSetTransactionCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            PaymentSetTransactionCustomTypeActionQueryBuilderDsl::of);
    }

}

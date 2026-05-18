
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentSetTransactionInterfaceIdActionQueryBuilderDsl {
    public PaymentSetTransactionInterfaceIdActionQueryBuilderDsl() {
    }

    public static PaymentSetTransactionInterfaceIdActionQueryBuilderDsl of() {
        return new PaymentSetTransactionInterfaceIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetTransactionInterfaceIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionInterfaceIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetTransactionInterfaceIdActionQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionInterfaceIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetTransactionInterfaceIdActionQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionInterfaceIdActionQueryBuilderDsl::of));
    }

}

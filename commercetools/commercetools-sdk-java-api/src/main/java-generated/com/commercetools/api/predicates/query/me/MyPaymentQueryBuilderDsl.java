
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyPaymentQueryBuilderDsl {
    public MyPaymentQueryBuilderDsl() {
    }

    public static MyPaymentQueryBuilderDsl of() {
        return new MyPaymentQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyPaymentQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            MyPaymentQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<MyPaymentQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentQueryBuilderDsl> amountPlanned(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("amountPlanned"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            MyPaymentQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentQueryBuilderDsl> paymentMethodInfo(
            Function<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentMethodInfo"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl.of())),
            MyPaymentQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentQueryBuilderDsl> transactions(
            Function<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("transactions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl.of())),
            MyPaymentQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyPaymentQueryBuilderDsl> transactions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactions")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            MyPaymentQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyPaymentDraftQueryBuilderDsl {
    public MyPaymentDraftQueryBuilderDsl() {
    }

    public static MyPaymentDraftQueryBuilderDsl of() {
        return new MyPaymentDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<MyPaymentDraftQueryBuilderDsl> amountPlanned(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("amountPlanned"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            MyPaymentDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentDraftQueryBuilderDsl> paymentMethodInfo(
            Function<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentMethodInfo"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentMethodInfoQueryBuilderDsl.of())),
            MyPaymentDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyPaymentDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentDraftQueryBuilderDsl> transaction(
            Function<com.commercetools.api.predicates.query.me.MyTransactionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyTransactionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("transaction"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.me.MyTransactionDraftQueryBuilderDsl.of())),
            MyPaymentDraftQueryBuilderDsl::of);
    }

}

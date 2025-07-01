
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoDraftQueryBuilderDsl {
    public PaymentMethodInfoDraftQueryBuilderDsl() {
    }

    public static PaymentMethodInfoDraftQueryBuilderDsl of() {
        return new PaymentMethodInfoDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoDraftQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoDraftQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodInfoDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodInfoDraftQueryBuilderDsl> token(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("token"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl.of())),
            PaymentMethodInfoDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoDraftQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            PaymentMethodInfoDraftQueryBuilderDsl::of);
    }

}

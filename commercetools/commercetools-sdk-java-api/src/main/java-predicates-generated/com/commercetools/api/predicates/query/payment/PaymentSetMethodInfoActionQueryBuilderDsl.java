
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentSetMethodInfoActionQueryBuilderDsl {
    public PaymentSetMethodInfoActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoActionQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoActionQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentSetMethodInfoActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentSetMethodInfoActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentSetMethodInfoActionQueryBuilderDsl> token(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("token"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl.of())),
            PaymentSetMethodInfoActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoActionQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentSetMethodInfoActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            PaymentSetMethodInfoActionQueryBuilderDsl::of);
    }

}


package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodUpdateActionQueryBuilderDsl {
    public PaymentMethodUpdateActionQueryBuilderDsl() {
    }

    public static PaymentMethodUpdateActionQueryBuilderDsl of() {
        return new PaymentMethodUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment_method.PaymentMethodSetCustomFieldActionQueryBuilderDsl
                    .of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment_method.PaymentMethodSetCustomTypeActionQueryBuilderDsl.of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetDefault(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetDefaultActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetDefaultActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment_method.PaymentMethodSetDefaultActionQueryBuilderDsl.of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetInterfaceAccount(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetInterfaceAccountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetInterfaceAccountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment_method.PaymentMethodSetInterfaceAccountActionQueryBuilderDsl
                    .of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment_method.PaymentMethodSetKeyActionQueryBuilderDsl.of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetMethod(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment_method.PaymentMethodSetMethodActionQueryBuilderDsl.of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment_method.PaymentMethodSetNameActionQueryBuilderDsl.of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetPaymentInterface(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment_method.PaymentMethodSetPaymentInterfaceActionQueryBuilderDsl
                    .of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodUpdateActionQueryBuilderDsl> asSetPaymentMethodStatus(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment_method.PaymentMethodSetPaymentMethodStatusActionQueryBuilderDsl
                    .of()),
            PaymentMethodUpdateActionQueryBuilderDsl::of);
    }
}

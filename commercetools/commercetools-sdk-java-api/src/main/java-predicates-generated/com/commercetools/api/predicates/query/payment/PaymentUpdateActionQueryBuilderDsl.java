
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentUpdateActionQueryBuilderDsl {
    public PaymentUpdateActionQueryBuilderDsl() {
    }

    public static PaymentUpdateActionQueryBuilderDsl of() {
        return new PaymentUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asAddInterfaceInteraction(
            Function<com.commercetools.api.predicates.query.payment.PaymentAddInterfaceInteractionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentAddInterfaceInteractionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment.PaymentAddInterfaceInteractionActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asAddTransaction(
            Function<com.commercetools.api.predicates.query.payment.PaymentAddTransactionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentAddTransactionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentAddTransactionActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asChangeAmountPlanned(
            Function<com.commercetools.api.predicates.query.payment.PaymentChangeAmountPlannedActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentChangeAmountPlannedActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment.PaymentChangeAmountPlannedActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asChangeTransactionInteractionId(
            Function<com.commercetools.api.predicates.query.payment.PaymentChangeTransactionInteractionIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentChangeTransactionInteractionIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment.PaymentChangeTransactionInteractionIdActionQueryBuilderDsl
                    .of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asChangeTransactionState(
            Function<com.commercetools.api.predicates.query.payment.PaymentChangeTransactionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentChangeTransactionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment.PaymentChangeTransactionStateActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asChangeTransactionTimestamp(
            Function<com.commercetools.api.predicates.query.payment.PaymentChangeTransactionTimestampActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentChangeTransactionTimestampActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment.PaymentChangeTransactionTimestampActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetAnonymousId(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetAnonymousIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetAnonymousIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetAnonymousIdActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetCustomFieldActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetCustomTypeActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetCustomer(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetCustomerActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetCustomerActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetCustomerActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetInterfaceId(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetInterfaceIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetInterfaceIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetInterfaceIdActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetKeyActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetMethodInfoInterface(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoInterfaceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoInterfaceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoInterfaceActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetMethodInfoMethod(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoMethodActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetMethodInfoName(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentSetMethodInfoNameActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetStatusInterfaceCode(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetStatusInterfaceCodeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetStatusInterfaceCodeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment.PaymentSetStatusInterfaceCodeActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetStatusInterfaceText(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetStatusInterfaceTextActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetStatusInterfaceTextActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.payment.PaymentSetStatusInterfaceTextActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetTransactionCustomField(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetTransactionCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetTransactionCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment.PaymentSetTransactionCustomFieldActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asSetTransactionCustomType(
            Function<com.commercetools.api.predicates.query.payment.PaymentSetTransactionCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentSetTransactionCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.payment.PaymentSetTransactionCustomTypeActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.payment.PaymentTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.payment.PaymentTransitionStateActionQueryBuilderDsl.of()),
            PaymentUpdateActionQueryBuilderDsl::of);
    }
}

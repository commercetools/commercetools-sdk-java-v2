
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyPaymentUpdateActionQueryBuilderDsl {
    public MyPaymentUpdateActionQueryBuilderDsl() {
    }

    public static MyPaymentUpdateActionQueryBuilderDsl of() {
        return new MyPaymentUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyPaymentUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asAddTransaction(
            Function<com.commercetools.api.predicates.query.me.MyPaymentAddTransactionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentAddTransactionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyPaymentAddTransactionActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asChangeAmountPlanned(
            Function<com.commercetools.api.predicates.query.me.MyPaymentChangeAmountPlannedActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentChangeAmountPlannedActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyPaymentChangeAmountPlannedActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyPaymentSetCustomFieldActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetMethodInfoCustomField(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoCustomFieldActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetMethodInfoCustomType(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoCustomTypeActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetMethodInfoInterfaceAccount(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoInterfaceAccountActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetMethodInfoInterface(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoInterfaceActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetMethodInfoMethod(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoMethodActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoMethodActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoMethodActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetMethodInfoName(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyPaymentSetMethodInfoNameActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyPaymentUpdateActionQueryBuilderDsl> asSetTransactionCustomField(
            Function<com.commercetools.api.predicates.query.me.MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyPaymentSetTransactionCustomFieldActionQueryBuilderDsl.of()),
            MyPaymentUpdateActionQueryBuilderDsl::of);
    }
}

package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCustomerUpdateActionQueryBuilderDsl  {
    public MyCustomerUpdateActionQueryBuilderDsl() {
    }

    public static MyCustomerUpdateActionQueryBuilderDsl of() {
        return new MyCustomerUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCustomerUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asAddAddress(
        Function<com.commercetools.api.predicates.query.me.MyCustomerAddAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerAddAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerAddAddressActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asAddBillingAddressId(
        Function<com.commercetools.api.predicates.query.me.MyCustomerAddBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerAddBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerAddBillingAddressIdActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asAddShippingAddressId(
        Function<com.commercetools.api.predicates.query.me.MyCustomerAddShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerAddShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerAddShippingAddressIdActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asChangeAddress(
        Function<com.commercetools.api.predicates.query.me.MyCustomerChangeAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerChangeAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerChangeAddressActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asChangeEmail(
        Function<com.commercetools.api.predicates.query.me.MyCustomerChangeEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerChangeEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerChangeEmailActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asRemoveAddress(
        Function<com.commercetools.api.predicates.query.me.MyCustomerRemoveAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerRemoveAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerRemoveAddressActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asRemoveBillingAddressId(
        Function<com.commercetools.api.predicates.query.me.MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerRemoveBillingAddressIdActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asRemoveShippingAddressId(
        Function<com.commercetools.api.predicates.query.me.MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerRemoveShippingAddressIdActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetCompanyName(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetCompanyNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetCompanyNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetCompanyNameActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetCustomFieldActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetCustomTypeActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetDateOfBirth(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetDateOfBirthActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetDateOfBirthActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetDateOfBirthActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetDefaultBillingAddress(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetDefaultBillingAddressActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetDefaultShippingAddress(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetDefaultShippingAddressActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetFirstName(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetFirstNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetFirstNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetFirstNameActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetLastName(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetLastNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetLastNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetLastNameActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetLocale(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetLocaleActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetMiddleName(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetMiddleNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetMiddleNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetMiddleNameActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetSalutation(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetSalutationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetSalutationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetSalutationActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetTitle(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetTitleActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyCustomerUpdateActionQueryBuilderDsl> asSetVatId(
        Function<com.commercetools.api.predicates.query.me.MyCustomerSetVatIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCustomerSetVatIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCustomerSetVatIdActionQueryBuilderDsl.of()),
            MyCustomerUpdateActionQueryBuilderDsl::of);
    }
}

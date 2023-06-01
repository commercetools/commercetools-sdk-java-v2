package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerUpdateActionQueryBuilderDsl  {
    public CustomerUpdateActionQueryBuilderDsl() {
    }

    public static CustomerUpdateActionQueryBuilderDsl of() {
        return new CustomerUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asAddAddress(
        Function<com.commercetools.api.predicates.query.customer.CustomerAddAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerAddAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerAddAddressActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asAddBillingAddressId(
        Function<com.commercetools.api.predicates.query.customer.CustomerAddBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerAddBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerAddBillingAddressIdActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asAddShippingAddressId(
        Function<com.commercetools.api.predicates.query.customer.CustomerAddShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerAddShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerAddShippingAddressIdActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asAddStore(
        Function<com.commercetools.api.predicates.query.customer.CustomerAddStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerAddStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerAddStoreActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asChangeAddress(
        Function<com.commercetools.api.predicates.query.customer.CustomerChangeAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerChangeAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerChangeAddressActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asChangeEmail(
        Function<com.commercetools.api.predicates.query.customer.CustomerChangeEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerChangeEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerChangeEmailActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asRemoveAddress(
        Function<com.commercetools.api.predicates.query.customer.CustomerRemoveAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerRemoveAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerRemoveAddressActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asRemoveBillingAddressId(
        Function<com.commercetools.api.predicates.query.customer.CustomerRemoveBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerRemoveBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerRemoveBillingAddressIdActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asRemoveShippingAddressId(
        Function<com.commercetools.api.predicates.query.customer.CustomerRemoveShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerRemoveShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerRemoveShippingAddressIdActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asRemoveStore(
        Function<com.commercetools.api.predicates.query.customer.CustomerRemoveStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerRemoveStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerRemoveStoreActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetAddressCustomField(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetAddressCustomFieldActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetAddressCustomType(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetAddressCustomTypeActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetAuthenticationMode(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetAuthenticationModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetAuthenticationModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetAuthenticationModeActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetCompanyName(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetCompanyNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetCompanyNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetCompanyNameActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetCustomFieldActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetCustomTypeActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetCustomerGroup(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetCustomerGroupActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetCustomerGroupActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetCustomerGroupActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetCustomerNumber(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetCustomerNumberActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetCustomerNumberActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetCustomerNumberActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetDateOfBirth(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetDateOfBirthActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetDateOfBirthActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetDateOfBirthActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetDefaultBillingAddress(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetDefaultBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetDefaultBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetDefaultBillingAddressActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetDefaultShippingAddress(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetDefaultShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetDefaultShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetDefaultShippingAddressActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetExternalId(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetExternalIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetExternalIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetExternalIdActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetFirstName(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetFirstNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetFirstNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetFirstNameActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetKeyActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetLastName(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetLastNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetLastNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetLastNameActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetLocale(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetLocaleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetLocaleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetLocaleActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetMiddleName(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetMiddleNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetMiddleNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetMiddleNameActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetSalutation(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetSalutationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetSalutationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetSalutationActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetStores(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetStoresActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetStoresActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetStoresActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetTitle(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetTitleActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CustomerUpdateActionQueryBuilderDsl> asSetVatId(
        Function<com.commercetools.api.predicates.query.customer.CustomerSetVatIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerSetVatIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.customer.CustomerSetVatIdActionQueryBuilderDsl.of()),
            CustomerUpdateActionQueryBuilderDsl::of);
    }
}

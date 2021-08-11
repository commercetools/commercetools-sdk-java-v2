
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerDraftBuilder implements Builder<CustomerDraft> {

    @Nullable
    private String customerNumber;

    private String email;

    private String password;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String middleName;

    @Nullable
    private String title;

    @Deprecated
    @Nullable
    private String anonymousCartId;

    @Nullable
    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    @Nullable
    private String anonymousId;

    @Nullable
    private java.time.LocalDate dateOfBirth;

    @Nullable
    private String companyName;

    @Nullable
    private String vatId;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    @Nullable
    private Long defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private Long defaultBillingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Boolean isEmailVerified;

    @Nullable
    private String externalId;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String locale;

    @Nullable
    private String salutation;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    public CustomerDraftBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public CustomerDraftBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public CustomerDraftBuilder password(final String password) {
        this.password = password;
        return this;
    }

    public CustomerDraftBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDraftBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDraftBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    public CustomerDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    @Deprecated
    public CustomerDraftBuilder anonymousCartId(@Nullable final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
        return this;
    }

    public CustomerDraftBuilder anonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public CustomerDraftBuilder anonymousCart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
        return this;
    }

    public CustomerDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    public CustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public CustomerDraftBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    public CustomerDraftBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    public CustomerDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    public CustomerDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public CustomerDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public CustomerDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public CustomerDraftBuilder defaultShippingAddress(@Nullable final Long defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    public CustomerDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    public CustomerDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    public CustomerDraftBuilder defaultBillingAddress(@Nullable final Long defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    public CustomerDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    public CustomerDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    public CustomerDraftBuilder isEmailVerified(@Nullable final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    public CustomerDraftBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public CustomerDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public CustomerDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public CustomerDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public CustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public CustomerDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public CustomerDraftBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    public CustomerDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public CustomerDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    public CustomerDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    public CustomerDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    public CustomerDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Deprecated
    @Nullable
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public Long getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    @Nullable
    public Long getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    @Nullable
    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public CustomerDraft build() {
        Objects.requireNonNull(email, CustomerDraft.class + ": email is missing");
        Objects.requireNonNull(password, CustomerDraft.class + ": password is missing");
        return new CustomerDraftImpl(customerNumber, email, password, firstName, lastName, middleName, title,
            anonymousCartId, anonymousCart, anonymousId, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddress, shippingAddresses, defaultBillingAddress, billingAddresses, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores);
    }

    /**
     * builds CustomerDraft without checking for non null required values
     */
    public CustomerDraft buildUnchecked() {
        return new CustomerDraftImpl(customerNumber, email, password, firstName, lastName, middleName, title,
            anonymousCartId, anonymousCart, anonymousId, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddress, shippingAddresses, defaultBillingAddress, billingAddresses, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores);
    }

    public static CustomerDraftBuilder of() {
        return new CustomerDraftBuilder();
    }

    public static CustomerDraftBuilder of(final CustomerDraft template) {
        CustomerDraftBuilder builder = new CustomerDraftBuilder();
        builder.customerNumber = template.getCustomerNumber();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.middleName = template.getMiddleName();
        builder.title = template.getTitle();
        builder.anonymousCartId = template.getAnonymousCartId();
        builder.anonymousCart = template.getAnonymousCart();
        builder.anonymousId = template.getAnonymousId();
        builder.dateOfBirth = template.getDateOfBirth();
        builder.companyName = template.getCompanyName();
        builder.vatId = template.getVatId();
        builder.addresses = template.getAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.isEmailVerified = template.getIsEmailVerified();
        builder.externalId = template.getExternalId();
        builder.customerGroup = template.getCustomerGroup();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.salutation = template.getSalutation();
        builder.key = template.getKey();
        builder.stores = template.getStores();
        return builder;
    }

}

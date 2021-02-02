
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerBuilder {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

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

    @Nullable
    private java.time.LocalDate dateOfBirth;

    @Nullable
    private String companyName;

    @Nullable
    private String vatId;

    private java.util.List<com.commercetools.api.models.common.Address> addresses;

    @Nullable
    private String defaultShippingAddressId;

    @Nullable
    private java.util.List<String> shippingAddressIds;

    @Nullable
    private String defaultBillingAddressId;

    @Nullable
    private java.util.List<String> billingAddressIds;

    private Boolean isEmailVerified;

    @Nullable
    private String externalId;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private String locale;

    @Nullable
    private String salutation;

    @Nullable
    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    public CustomerBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CustomerBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public CustomerBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public CustomerBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public CustomerBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public CustomerBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public CustomerBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder password(final String password) {
        this.password = password;
        return this;
    }

    public CustomerBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    public CustomerBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    public CustomerBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public CustomerBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    public CustomerBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    public CustomerBuilder addresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    public CustomerBuilder addresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public CustomerBuilder defaultShippingAddressId(@Nullable final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
        return this;
    }

    public CustomerBuilder shippingAddressIds(@Nullable final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
        return this;
    }

    public CustomerBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
        return this;
    }

    public CustomerBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
        return this;
    }

    public CustomerBuilder billingAddressIds(@Nullable final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
        return this;
    }

    public CustomerBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
        return this;
    }

    public CustomerBuilder isEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    public CustomerBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public CustomerBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public CustomerBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public CustomerBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public CustomerBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    public CustomerBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public CustomerBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    public CustomerBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
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

    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public String getDefaultShippingAddressId() {
        return this.defaultShippingAddressId;
    }

    @Nullable
    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    @Nullable
    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    @Nullable
    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
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
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    public Customer build() {
        return new CustomerImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customerNumber,
            email, password, firstName, lastName, middleName, title, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddressId, shippingAddressIds, defaultBillingAddressId, billingAddressIds, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores);
    }

    public static CustomerBuilder of() {
        return new CustomerBuilder();
    }

    public static CustomerBuilder of(final Customer template) {
        CustomerBuilder builder = new CustomerBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.customerNumber = template.getCustomerNumber();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.middleName = template.getMiddleName();
        builder.title = template.getTitle();
        builder.dateOfBirth = template.getDateOfBirth();
        builder.companyName = template.getCompanyName();
        builder.vatId = template.getVatId();
        builder.addresses = template.getAddresses();
        builder.defaultShippingAddressId = template.getDefaultShippingAddressId();
        builder.shippingAddressIds = template.getShippingAddressIds();
        builder.defaultBillingAddressId = template.getDefaultBillingAddressId();
        builder.billingAddressIds = template.getBillingAddressIds();
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

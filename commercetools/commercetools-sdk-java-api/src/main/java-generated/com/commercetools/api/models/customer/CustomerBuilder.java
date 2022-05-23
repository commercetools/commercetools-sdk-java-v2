
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Customer customer = Customer.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .email("{email}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .isEmailVerified(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerBuilder implements Builder<Customer> {

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

    @Nullable
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

    @Nullable
    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    /**
     <*  <p>Platform-generated unique identifier of the Customer.</p>>
     */

    public CustomerBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>The current version of the customer.</p>>
     */

    public CustomerBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public CustomerBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public CustomerBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public CustomerBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>>
     */

    public CustomerBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     <*  <p>The customer number can be used to create a more human-readable (in contrast to ID) identifier for the customer. It should be unique across a project. Once the field was set it cannot be changed anymore.</p>>
     */

    public CustomerBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     <*  <p>The customer's email address and the main identifier of uniqueness for a customer account. Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project. For more information, see Email uniquenes.</p>>
     */

    public CustomerBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     <*  <p>Only present with the default <code>authenticationMode</code>, <code>Password</code>.</p>>
     */

    public CustomerBuilder password(@Nullable final String password) {
        this.password = password;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     <*  <p>The addresses have unique IDs in the addresses list</p>>
     */

    public CustomerBuilder addresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     <*  <p>The addresses have unique IDs in the addresses list</p>>
     */

    public CustomerBuilder addresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     <*  <p>The addresses have unique IDs in the addresses list</p>>
     */

    public CustomerBuilder plusAddresses(final com.commercetools.api.models.common.Address... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     <*  <p>The addresses have unique IDs in the addresses list</p>>
     */

    public CustomerBuilder plusAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>The addresses have unique IDs in the addresses list</p>>
     */

    public CustomerBuilder withAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>The address ID in the addresses list</p>>
     */

    public CustomerBuilder defaultShippingAddressId(@Nullable final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
        return this;
    }

    /**
     <*  <p>The IDs from the addresses list which are used as shipping addresses</p>>
     */

    public CustomerBuilder shippingAddressIds(@Nullable final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     <*  <p>The IDs from the addresses list which are used as shipping addresses</p>>
     */

    public CustomerBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
        return this;
    }

    /**
     <*  <p>The IDs from the addresses list which are used as shipping addresses</p>>
     */

    public CustomerBuilder plusShippingAddressIds(@Nullable final String... shippingAddressIds) {
        if (this.shippingAddressIds == null) {
            this.shippingAddressIds = new ArrayList<>();
        }
        this.shippingAddressIds.addAll(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     <*  <p>The address ID in the addresses list</p>>
     */

    public CustomerBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
        return this;
    }

    /**
     <*  <p>The IDs from the addresses list which are used as billing addresses</p>>
     */

    public CustomerBuilder billingAddressIds(@Nullable final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     <*  <p>The IDs from the addresses list which are used as billing addresses</p>>
     */

    public CustomerBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
        return this;
    }

    /**
     <*  <p>The IDs from the addresses list which are used as billing addresses</p>>
     */

    public CustomerBuilder plusBillingAddressIds(@Nullable final String... billingAddressIds) {
        if (this.billingAddressIds == null) {
            this.billingAddressIds = new ArrayList<>();
        }
        this.billingAddressIds.addAll(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder isEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     <>
     */

    public CustomerBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the Customer.</p>>
     */

    public CustomerBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     <*  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>>
     */

    public CustomerBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     <*  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>>
     */

    public CustomerBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     <*  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>>
     */

    public CustomerBuilder plusStores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     <*  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>>
     */

    public CustomerBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>>
     */

    public CustomerBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     <*  <p>Defines whether a Customer has a password.</p>>
     */

    public CustomerBuilder authenticationMode(
            @Nullable final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
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

    @Nullable
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

    @Nullable
    public com.commercetools.api.models.customer.AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public Customer build() {
        Objects.requireNonNull(id, Customer.class + ": id is missing");
        Objects.requireNonNull(version, Customer.class + ": version is missing");
        Objects.requireNonNull(createdAt, Customer.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Customer.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(email, Customer.class + ": email is missing");
        Objects.requireNonNull(addresses, Customer.class + ": addresses is missing");
        Objects.requireNonNull(isEmailVerified, Customer.class + ": isEmailVerified is missing");
        return new CustomerImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customerNumber,
            email, password, firstName, lastName, middleName, title, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddressId, shippingAddressIds, defaultBillingAddressId, billingAddressIds, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores, authenticationMode);
    }

    /**
     * builds Customer without checking for non null required values
     */
    public Customer buildUnchecked() {
        return new CustomerImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customerNumber,
            email, password, firstName, lastName, middleName, title, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddressId, shippingAddressIds, defaultBillingAddressId, billingAddressIds, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores, authenticationMode);
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
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}

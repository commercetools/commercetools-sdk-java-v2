
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
 *             .authenticationMode(AuthenticationMode.PASSWORD)
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
    private String key;

    @Nullable
    private String customerNumber;

    @Nullable
    private String externalId;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

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
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private String locale;

    @Nullable
    private String salutation;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    /**
     *  <p>Unique identifier of the Customer.</p>
     */

    public CustomerBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Customer.</p>
     */

    public CustomerBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Customer was initially created.</p>
     */

    public CustomerBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Customer was last updated.</p>
     */

    public CustomerBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     */

    public CustomerBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     */

    public CustomerBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Optional identifier for use in external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     */

    public CustomerBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomerBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomerBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomerBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CustomerBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */

    public CustomerBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Present only when <code>authenticationMode</code> is set to <code>Password</code>.</p>
     */

    public CustomerBuilder password(@Nullable final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     */

    public CustomerBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     */

    public CustomerBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     */

    public CustomerBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     */

    public CustomerBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     */

    public CustomerBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     *  <p>Company name of the Customer.</p>
     */

    public CustomerBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Unique VAT ID of the Customer.</p>
     */

    public CustomerBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Addresses used by the Customer.</p>
     */

    public CustomerBuilder addresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Customer.</p>
     */

    public CustomerBuilder addresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Customer.</p>
     */

    public CustomerBuilder plusAddresses(final com.commercetools.api.models.common.Address... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Customer.</p>
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
     *  <p>Addresses used by the Customer.</p>
     */

    public CustomerBuilder withAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default shipping address.</p>
     */

    public CustomerBuilder defaultShippingAddressId(@Nullable final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
        return this;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     */

    public CustomerBuilder shippingAddressIds(@Nullable final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     */

    public CustomerBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
        return this;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     */

    public CustomerBuilder plusShippingAddressIds(@Nullable final String... shippingAddressIds) {
        if (this.shippingAddressIds == null) {
            this.shippingAddressIds = new ArrayList<>();
        }
        this.shippingAddressIds.addAll(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default billing address.</p>
     */

    public CustomerBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
        return this;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     */

    public CustomerBuilder billingAddressIds(@Nullable final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     */

    public CustomerBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
        return this;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     */

    public CustomerBuilder plusBillingAddressIds(@Nullable final String... billingAddressIds) {
        if (this.billingAddressIds == null) {
            this.billingAddressIds = new ArrayList<>();
        }
        this.billingAddressIds.addAll(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>Indicates whether the email address of the Customer is verified.</p>
     */

    public CustomerBuilder isEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    /**
     *  <p>CustomerGroup to which the Customer belongs.</p>
     */

    public CustomerBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>CustomerGroup to which the Customer belongs.</p>
     */

    public CustomerBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public CustomerBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public CustomerBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Preferred language of the Customer.</p>
     */

    public CustomerBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    public CustomerBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Stores to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     */

    public CustomerBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     */

    public CustomerBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     */

    public CustomerBuilder plusStores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
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
     *  <p>Stores to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     */

    public CustomerBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Indicates whether the <code>password</code> is required for the Customer.</p>
     */

    public CustomerBuilder authenticationMode(
            final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
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
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
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
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

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
        Objects.requireNonNull(authenticationMode, Customer.class + ": authenticationMode is missing");
        return new CustomerImpl(id, version, createdAt, lastModifiedAt, key, customerNumber, externalId, lastModifiedBy,
            createdBy, email, password, firstName, lastName, middleName, title, dateOfBirth, companyName, vatId,
            addresses, defaultShippingAddressId, shippingAddressIds, defaultBillingAddressId, billingAddressIds,
            isEmailVerified, customerGroup, custom, locale, salutation, stores, authenticationMode);
    }

    /**
     * builds Customer without checking for non null required values
     */
    public Customer buildUnchecked() {
        return new CustomerImpl(id, version, createdAt, lastModifiedAt, key, customerNumber, externalId, lastModifiedBy,
            createdBy, email, password, firstName, lastName, middleName, title, dateOfBirth, companyName, vatId,
            addresses, defaultShippingAddressId, shippingAddressIds, defaultBillingAddressId, billingAddressIds,
            isEmailVerified, customerGroup, custom, locale, salutation, stores, authenticationMode);
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
        builder.key = template.getKey();
        builder.customerNumber = template.getCustomerNumber();
        builder.externalId = template.getExternalId();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
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
        builder.customerGroup = template.getCustomerGroup();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.salutation = template.getSalutation();
        builder.stores = template.getStores();
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}

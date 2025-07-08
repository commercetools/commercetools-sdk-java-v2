
package com.commercetools.importapi.models.customers;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerImport customerImport = CustomerImport.builder()
 *             .key("{key}")
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerImportBuilder implements Builder<CustomerImport> {

    private String key;

    @Nullable
    private String customerNumber;

    private String email;

    @Nullable
    private String password;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String middleName;

    @Nullable
    private String title;

    @Nullable
    private String salutation;

    @Nullable
    private String externalId;

    @Nullable
    private java.time.LocalDate dateOfBirth;

    @Nullable
    private String companyName;

    @Nullable
    private String vatId;

    @Nullable
    private Boolean isEmailVerified;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private String locale;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    @Nullable
    private com.commercetools.importapi.models.customers.AuthenticationMode authenticationMode;

    /**
     *  <p>User-defined unique identifier. If a Customer with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomerImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.customerNumber</code>.</p>
     * @param customerNumber value to be set
     * @return Builder
     */

    public CustomerImportBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.email</code>.</p>
     * @param email value to be set
     * @return Builder
     */

    public CustomerImportBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.password</code>. Required when <code>authenticationMode</code> is set to <code>Password</code>.</p>
     * @param password value to be set
     * @return Builder
     */

    public CustomerImportBuilder password(@Nullable final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerImportBuilder stores(
            @Nullable final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerImportBuilder stores(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerImportBuilder plusStores(
            @Nullable final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerImportBuilder plusStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerImportBuilder withStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerImportBuilder addStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerImportBuilder setStores(
            Function<com.commercetools.importapi.models.common.StoreKeyReferenceBuilder, com.commercetools.importapi.models.common.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.importapi.models.common.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Customer.firstName</code>.</p>
     * @param firstName value to be set
     * @return Builder
     */

    public CustomerImportBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.lastName</code>.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public CustomerImportBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.middleName</code>.</p>
     * @param middleName value to be set
     * @return Builder
     */

    public CustomerImportBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.title</code>.</p>
     * @param title value to be set
     * @return Builder
     */

    public CustomerImportBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.salutation</code>.</p>
     * @param salutation value to be set
     * @return Builder
     */

    public CustomerImportBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.externalId</code>.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public CustomerImportBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
     * @param dateOfBirth value to be set
     * @return Builder
     */

    public CustomerImportBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.companyName</code>.</p>
     * @param companyName value to be set
     * @return Builder
     */

    public CustomerImportBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.vatId</code>.</p>
     * @param vatId value to be set
     * @return Builder
     */

    public CustomerImportBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
     * @param isEmailVerified value to be set
     * @return Builder
     */

    public CustomerImportBuilder isEmailVerified(@Nullable final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerImportBuilder customerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerImportBuilder withCustomerGroup(
            Function<com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerGroupKeyReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.importapi.models.common.CustomerGroupKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CustomerImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder addresses(
            @Nullable final com.commercetools.importapi.models.customers.CustomerAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder addresses(
            @Nullable final java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder plusAddresses(
            @Nullable final com.commercetools.importapi.models.customers.CustomerAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CustomerImportBuilder plusAddresses(
            Function<com.commercetools.importapi.models.customers.CustomerAddressBuilder, com.commercetools.importapi.models.customers.CustomerAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses
                .add(builder.apply(com.commercetools.importapi.models.customers.CustomerAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CustomerImportBuilder withAddresses(
            Function<com.commercetools.importapi.models.customers.CustomerAddressBuilder, com.commercetools.importapi.models.customers.CustomerAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses
                .add(builder.apply(com.commercetools.importapi.models.customers.CustomerAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CustomerImportBuilder addAddresses(
            Function<com.commercetools.importapi.models.customers.CustomerAddressBuilder, com.commercetools.importapi.models.customers.CustomerAddress> builder) {
        return plusAddresses(builder.apply(com.commercetools.importapi.models.customers.CustomerAddressBuilder.of()));
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CustomerImportBuilder setAddresses(
            Function<com.commercetools.importapi.models.customers.CustomerAddressBuilder, com.commercetools.importapi.models.customers.CustomerAddress> builder) {
        return addresses(builder.apply(com.commercetools.importapi.models.customers.CustomerAddressBuilder.of()));
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultBillingAddress value to be set
     * @return Builder
     */

    public CustomerImportBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>The index of the address in the <code>addresses</code> array. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultShippingAddress value to be set
     * @return Builder
     */

    public CustomerImportBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CustomerImportBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.locale</code>.</p>
     * @param locale value to be set
     * @return Builder
     */

    public CustomerImportBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerImportBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Customer.custom</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomerImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     * @param authenticationMode value to be set
     * @return Builder
     */

    public CustomerImportBuilder authenticationMode(
            @Nullable final com.commercetools.importapi.models.customers.AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     *  <p>User-defined unique identifier. If a Customer with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>Customer.customerNumber</code>.</p>
     * @return customerNumber
     */

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     *  <p>Maps to <code>Customer.email</code>.</p>
     * @return email
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Maps to <code>Customer.password</code>. Required when <code>authenticationMode</code> is set to <code>Password</code>.</p>
     * @return password
     */

    @Nullable
    public String getPassword() {
        return this.password;
    }

    /**
     *  <p>Maps to <code>Customer.stores</code>. If the referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Stores are created.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Maps to <code>Customer.firstName</code>.</p>
     * @return firstName
     */

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *  <p>Maps to <code>Customer.lastName</code>.</p>
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     *  <p>Maps to <code>Customer.middleName</code>.</p>
     * @return middleName
     */

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     *  <p>Maps to <code>Customer.title</code>.</p>
     * @return title
     */

    @Nullable
    public String getTitle() {
        return this.title;
    }

    /**
     *  <p>Maps to <code>Customer.salutation</code>.</p>
     * @return salutation
     */

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    /**
     *  <p>Maps to <code>Customer.externalId</code>.</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
     * @return dateOfBirth
     */

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     *  <p>Maps to <code>Customer.companyName</code>.</p>
     * @return companyName
     */

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     *  <p>Maps to <code>Customer.vatId</code>.</p>
     * @return vatId
     */

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    /**
     *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
     * @return isEmailVerified
     */

    @Nullable
    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    /**
     *  <p>Maps to <code>Customer.customerGroup</code>. If the referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CustomerGroup is created.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @return addresses
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @return defaultBillingAddress
     */

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @return billingAddresses
     */

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>The index of the address in the <code>addresses</code> array. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @return defaultShippingAddress
     */

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the <code>id</code> of these addresses.</p>
     * @return shippingAddresses
     */

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>Maps to <code>Customer.locale</code>.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Maps to <code>Customer.custom</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     * @return authenticationMode
     */

    @Nullable
    public com.commercetools.importapi.models.customers.AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * builds CustomerImport with checking for non-null required values
     * @return CustomerImport
     */
    public CustomerImport build() {
        Objects.requireNonNull(key, CustomerImport.class + ": key is missing");
        Objects.requireNonNull(email, CustomerImport.class + ": email is missing");
        return new CustomerImportImpl(key, customerNumber, email, password, stores, firstName, lastName, middleName,
            title, salutation, externalId, dateOfBirth, companyName, vatId, isEmailVerified, customerGroup, addresses,
            defaultBillingAddress, billingAddresses, defaultShippingAddress, shippingAddresses, locale, custom,
            authenticationMode);
    }

    /**
     * builds CustomerImport without checking for non-null required values
     * @return CustomerImport
     */
    public CustomerImport buildUnchecked() {
        return new CustomerImportImpl(key, customerNumber, email, password, stores, firstName, lastName, middleName,
            title, salutation, externalId, dateOfBirth, companyName, vatId, isEmailVerified, customerGroup, addresses,
            defaultBillingAddress, billingAddresses, defaultShippingAddress, shippingAddresses, locale, custom,
            authenticationMode);
    }

    /**
     * factory method for an instance of CustomerImportBuilder
     * @return builder
     */
    public static CustomerImportBuilder of() {
        return new CustomerImportBuilder();
    }

    /**
     * create builder for CustomerImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerImportBuilder of(final CustomerImport template) {
        CustomerImportBuilder builder = new CustomerImportBuilder();
        builder.key = template.getKey();
        builder.customerNumber = template.getCustomerNumber();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.stores = template.getStores();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.middleName = template.getMiddleName();
        builder.title = template.getTitle();
        builder.salutation = template.getSalutation();
        builder.externalId = template.getExternalId();
        builder.dateOfBirth = template.getDateOfBirth();
        builder.companyName = template.getCompanyName();
        builder.vatId = template.getVatId();
        builder.isEmailVerified = template.getIsEmailVerified();
        builder.customerGroup = template.getCustomerGroup();
        builder.addresses = template.getAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.locale = template.getLocale();
        builder.custom = template.getCustom();
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}

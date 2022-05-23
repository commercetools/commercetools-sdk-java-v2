
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerDraft customerDraft = CustomerDraft.builder()
           .email("{email}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDraftBuilder implements Builder<CustomerDraft> {

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
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

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

    @Nullable
    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    /**
     *  <p>String that uniquely identifies a customer. It can be used to create more human-readable (in contrast to ID) identifier for the customer. It should be <strong>unique</strong> across a project. Once it's set it cannot be changed.</p>
     */

    public CustomerDraftBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>The customer's email address and the main identifier of uniqueness for a customer account. Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project, and are case insensitive. For more information, see Email uniquenes.</p>
     */

    public CustomerDraftBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Only optional with <code>authenticationMode</code> set to <code>ExternalAuth</code>.</p>
     */

    public CustomerDraftBuilder password(@Nullable final String password) {
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

    /**
     *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
     */
    @Deprecated
    public CustomerDraftBuilder anonymousCartId(@Nullable final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
        return this;
    }

    /**
     *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
     */

    public CustomerDraftBuilder anonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
     */

    public CustomerDraftBuilder anonymousCart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
        return this;
    }

    /**
     *  <p>Identifies carts and orders belonging to an anonymous session that will be assigned to the new customer account.</p>
     */

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

    /**
     *  <p>Sets the ID of each address to be unique in the addresses list.</p>
     */

    public CustomerDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Sets the ID of each address to be unique in the addresses list.</p>
     */

    public CustomerDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Sets the ID of each address to be unique in the addresses list.</p>
     */

    public CustomerDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Sets the ID of each address to be unique in the addresses list.</p>
     */

    public CustomerDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the ID of each address to be unique in the addresses list.</p>
     */

    public CustomerDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
     */

    public CustomerDraftBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
     */

    public CustomerDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
     */

    public CustomerDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
     */

    public CustomerDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
     */

    public CustomerDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     */

    public CustomerDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
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

    /**
     *  <p>The custom fields.</p>
     */

    public CustomerDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public CustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Must be one of the languages supported for this project</p>
     */

    public CustomerDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public CustomerDraftBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Customer.</p>
     */

    public CustomerDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
     */

    public CustomerDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
     */

    public CustomerDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
     */

    public CustomerDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
     */

    public CustomerDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to the stores the customer account is associated with. If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers. If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
     */

    public CustomerDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines whether a password is required for the Customer that is used for platform-internal authentication.</p>
     */

    public CustomerDraftBuilder authenticationMode(
            @Nullable final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
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
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    @Nullable
    public Integer getDefaultBillingAddress() {
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

    @Nullable
    public com.commercetools.api.models.customer.AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public CustomerDraft build() {
        Objects.requireNonNull(email, CustomerDraft.class + ": email is missing");
        return new CustomerDraftImpl(customerNumber, email, password, firstName, lastName, middleName, title,
            anonymousCartId, anonymousCart, anonymousId, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddress, shippingAddresses, defaultBillingAddress, billingAddresses, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores, authenticationMode);
    }

    /**
     * builds CustomerDraft without checking for non null required values
     */
    public CustomerDraft buildUnchecked() {
        return new CustomerDraftImpl(customerNumber, email, password, firstName, lastName, middleName, title,
            anonymousCartId, anonymousCart, anonymousId, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddress, shippingAddresses, defaultBillingAddress, billingAddresses, isEmailVerified,
            externalId, customerGroup, custom, locale, salutation, key, stores, authenticationMode);
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
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}

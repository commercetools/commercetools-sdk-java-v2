
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerDraft myCustomerDraft = MyCustomerDraft.builder()
 *             .email("{email}")
 *             .password("{password}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerDraftBuilder implements Builder<MyCustomerDraft> {

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
    private String salutation;

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
    private Long defaultBillingAddress;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String locale;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @param email value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Password of the Customer.</p>
     * @param password value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder password(final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @param firstName value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     * @param middleName value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     * @param title value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @param salutation value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     * @param dateOfBirth value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     *  <p>Company name of the Customer.</p>
     * @param companyName value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Individual VAT ID of the Customer.</p>
     * @param vatId value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public MyCustomerDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public MyCustomerDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public MyCustomerDraftBuilder addAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return plusAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public MyCustomerDraftBuilder setAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return addresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultShippingAddress value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder defaultShippingAddress(@Nullable final Long defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultBillingAddress value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder defaultBillingAddress(@Nullable final Long defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyCustomerDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyCustomerDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     * @param locale value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param stores value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param stores value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param stores value to be set
     * @return Builder
     */

    public MyCustomerDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public MyCustomerDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public MyCustomerDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public MyCustomerDraftBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public MyCustomerDraftBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @return email
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Password of the Customer.</p>
     * @return password
     */

    public String getPassword() {
        return this.password;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @return firstName
     */

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     * @return middleName
     */

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     * @return title
     */

    @Nullable
    public String getTitle() {
        return this.title;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @return salutation
     */

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     * @return dateOfBirth
     */

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     *  <p>Company name of the Customer.</p>
     * @return companyName
     */

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     *  <p>Individual VAT ID of the Customer.</p>
     * @return vatId
     */

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @return addresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @return defaultShippingAddress
     */

    @Nullable
    public Long getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @return defaultBillingAddress
     */

    @Nullable
    public Long getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds MyCustomerDraft with checking for non-null required values
     * @return MyCustomerDraft
     */
    public MyCustomerDraft build() {
        Objects.requireNonNull(email, MyCustomerDraft.class + ": email is missing");
        Objects.requireNonNull(password, MyCustomerDraft.class + ": password is missing");
        return new MyCustomerDraftImpl(email, password, firstName, lastName, middleName, title, salutation, dateOfBirth,
            companyName, vatId, addresses, defaultShippingAddress, defaultBillingAddress, custom, locale, stores);
    }

    /**
     * builds MyCustomerDraft without checking for non-null required values
     * @return MyCustomerDraft
     */
    public MyCustomerDraft buildUnchecked() {
        return new MyCustomerDraftImpl(email, password, firstName, lastName, middleName, title, salutation, dateOfBirth,
            companyName, vatId, addresses, defaultShippingAddress, defaultBillingAddress, custom, locale, stores);
    }

    /**
     * factory method for an instance of MyCustomerDraftBuilder
     * @return builder
     */
    public static MyCustomerDraftBuilder of() {
        return new MyCustomerDraftBuilder();
    }

    /**
     * create builder for MyCustomerDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerDraftBuilder of(final MyCustomerDraft template) {
        MyCustomerDraftBuilder builder = new MyCustomerDraftBuilder();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.middleName = template.getMiddleName();
        builder.title = template.getTitle();
        builder.salutation = template.getSalutation();
        builder.dateOfBirth = template.getDateOfBirth();
        builder.companyName = template.getCompanyName();
        builder.vatId = template.getVatId();
        builder.addresses = template.getAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.stores = template.getStores();
        return builder;
    }

}

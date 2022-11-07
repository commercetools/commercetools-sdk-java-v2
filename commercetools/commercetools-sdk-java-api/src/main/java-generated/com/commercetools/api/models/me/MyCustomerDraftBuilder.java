
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
     */

    public MyCustomerDraftBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Password of the Customer.</p>
     */

    public MyCustomerDraftBuilder password(final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     */

    public MyCustomerDraftBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     */

    public MyCustomerDraftBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     */

    public MyCustomerDraftBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     */

    public MyCustomerDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    public MyCustomerDraftBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     */

    public MyCustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     *  <p>Company name of the Customer.</p>
     */

    public MyCustomerDraftBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Unique VAT ID of the Customer.</p>
     */

    public MyCustomerDraftBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     */

    public MyCustomerDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     */

    public MyCustomerDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
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
     */

    public MyCustomerDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    public MyCustomerDraftBuilder defaultShippingAddress(@Nullable final Long defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    public MyCustomerDraftBuilder defaultBillingAddress(@Nullable final Long defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public MyCustomerDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public MyCustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     */

    public MyCustomerDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     */

    public MyCustomerDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     */

    public MyCustomerDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
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
     */

    public MyCustomerDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
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
    public String getSalutation() {
        return this.salutation;
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
    public Long getDefaultBillingAddress() {
        return this.defaultBillingAddress;
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
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public MyCustomerDraft build() {
        Objects.requireNonNull(email, MyCustomerDraft.class + ": email is missing");
        Objects.requireNonNull(password, MyCustomerDraft.class + ": password is missing");
        return new MyCustomerDraftImpl(email, password, firstName, lastName, middleName, title, salutation, dateOfBirth,
            companyName, vatId, addresses, defaultShippingAddress, defaultBillingAddress, custom, locale, stores);
    }

    /**
     * builds MyCustomerDraft without checking for non null required values
     */
    public MyCustomerDraft buildUnchecked() {
        return new MyCustomerDraftImpl(email, password, firstName, lastName, middleName, title, salutation, dateOfBirth,
            companyName, vatId, addresses, defaultShippingAddress, defaultBillingAddress, custom, locale, stores);
    }

    public static MyCustomerDraftBuilder of() {
        return new MyCustomerDraftBuilder();
    }

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


package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public MyCustomerDraftBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public MyCustomerDraftBuilder password(final String password) {
        this.password = password;
        return this;
    }

    public MyCustomerDraftBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public MyCustomerDraftBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public MyCustomerDraftBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    public MyCustomerDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    public MyCustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public MyCustomerDraftBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    public MyCustomerDraftBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    public MyCustomerDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    public MyCustomerDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public MyCustomerDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    public MyCustomerDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public MyCustomerDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public MyCustomerDraftBuilder defaultShippingAddress(@Nullable final Long defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    public MyCustomerDraftBuilder defaultBillingAddress(@Nullable final Long defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    public MyCustomerDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public MyCustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public MyCustomerDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public MyCustomerDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    public MyCustomerDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    public MyCustomerDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    public MyCustomerDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

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
        return new MyCustomerDraftImpl(email, password, firstName, lastName, middleName, title, dateOfBirth,
            companyName, vatId, addresses, defaultShippingAddress, defaultBillingAddress, custom, locale, stores);
    }

    /**
     * builds MyCustomerDraft without checking for non null required values
     */
    public MyCustomerDraft buildUnchecked() {
        return new MyCustomerDraftImpl(email, password, firstName, lastName, middleName, title, dateOfBirth,
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

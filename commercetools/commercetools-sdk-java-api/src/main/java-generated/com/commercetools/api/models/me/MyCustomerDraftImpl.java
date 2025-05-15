
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * MyCustomerDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerDraftImpl implements MyCustomerDraft, ModelBase {

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String middleName;

    private String title;

    private String salutation;

    private java.time.LocalDate dateOfBirth;

    private String companyName;

    private String vatId;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    private Long defaultShippingAddress;

    private Long defaultBillingAddress;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String locale;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerDraftImpl(@JsonProperty("email") final String email, @JsonProperty("password") final String password,
            @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName,
            @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title,
            @JsonProperty("salutation") final String salutation,
            @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth,
            @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses,
            @JsonProperty("defaultShippingAddress") final Long defaultShippingAddress,
            @JsonProperty("defaultBillingAddress") final Long defaultBillingAddress,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("locale") final String locale,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.salutation = salutation;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.addresses = addresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.defaultBillingAddress = defaultBillingAddress;
        this.custom = custom;
        this.locale = locale;
        this.stores = stores;
    }

    /**
     * create empty instance
     */
    public MyCustomerDraftImpl() {
    }

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Password of the Customer.</p>
     */

    public String getPassword() {
        return this.password;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     */

    public String getMiddleName() {
        return this.middleName;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     */

    public String getTitle() {
        return this.title;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    public String getSalutation() {
        return this.salutation;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     */

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     *  <p>Company name of the Customer.</p>
     */

    public String getCompanyName() {
        return this.companyName;
    }

    /**
     *  <p>Individual VAT ID of the Customer.</p>
     */

    public String getVatId() {
        return this.vatId;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    public Long getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    public Long getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public void setVatId(final String vatId) {
        this.vatId = vatId;
    }

    public void setAddresses(final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
    }

    public void setDefaultShippingAddress(final Long defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
    }

    public void setDefaultBillingAddress(final Long defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerDraftImpl that = (MyCustomerDraftImpl) o;

        return new EqualsBuilder().append(email, that.email)
                .append(password, that.password)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(salutation, that.salutation)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(addresses, that.addresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(stores, that.stores)
                .append(email, that.email)
                .append(password, that.password)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(salutation, that.salutation)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(addresses, that.addresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(email)
                .append(password)
                .append(firstName)
                .append(lastName)
                .append(middleName)
                .append(title)
                .append(salutation)
                .append(dateOfBirth)
                .append(companyName)
                .append(vatId)
                .append(addresses)
                .append(defaultShippingAddress)
                .append(defaultBillingAddress)
                .append(custom)
                .append(locale)
                .append(stores)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("email", email)
                .append("password", password)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("middleName", middleName)
                .append("title", title)
                .append("salutation", salutation)
                .append("dateOfBirth", dateOfBirth)
                .append("companyName", companyName)
                .append("vatId", vatId)
                .append("addresses", addresses)
                .append("defaultShippingAddress", defaultShippingAddress)
                .append("defaultBillingAddress", defaultBillingAddress)
                .append("custom", custom)
                .append("locale", locale)
                .append("stores", stores)
                .build();
    }

    @Override
    public MyCustomerDraft copyDeep() {
        return MyCustomerDraft.deepCopy(this);
    }
}

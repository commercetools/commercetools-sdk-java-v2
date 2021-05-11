
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerDraftImpl implements CustomerDraft {

    private String customerNumber;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String middleName;

    private String title;

    @Deprecated
    private String anonymousCartId;

    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    private String anonymousId;

    private java.time.LocalDate dateOfBirth;

    private String companyName;

    private String vatId;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    private Long defaultShippingAddress;

    private java.util.List<Integer> shippingAddresses;

    private Long defaultBillingAddress;

    private java.util.List<Integer> billingAddresses;

    private Boolean isEmailVerified;

    private String externalId;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String locale;

    private String salutation;

    private String key;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    @JsonCreator
    CustomerDraftImpl(@JsonProperty("customerNumber") final String customerNumber,
            @JsonProperty("email") final String email, @JsonProperty("password") final String password,
            @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName,
            @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title,
            @JsonProperty("anonymousCartId") final String anonymousCartId,
            @JsonProperty("anonymousCart") final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth,
            @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses,
            @JsonProperty("defaultShippingAddress") final Long defaultShippingAddress,
            @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses,
            @JsonProperty("defaultBillingAddress") final Long defaultBillingAddress,
            @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses,
            @JsonProperty("isEmailVerified") final Boolean isEmailVerified,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("locale") final String locale, @JsonProperty("salutation") final String salutation,
            @JsonProperty("key") final String key,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.customerNumber = customerNumber;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.anonymousCartId = anonymousCartId;
        this.anonymousCart = anonymousCart;
        this.anonymousId = anonymousId;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.addresses = addresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.shippingAddresses = shippingAddresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.billingAddresses = billingAddresses;
        this.isEmailVerified = isEmailVerified;
        this.externalId = externalId;
        this.customerGroup = customerGroup;
        this.custom = custom;
        this.locale = locale;
        this.salutation = salutation;
        this.key = key;
        this.stores = stores;
    }

    public CustomerDraftImpl() {
    }

    /**
    *  <p>String that uniquely identifies a customer.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the customer.
    *  It should be <strong>unique</strong> across a project.
    *  Once it's set it cannot be changed.</p>
    */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
    *  <p>The customer's email address and the main identifier of uniqueness for a customer account.
    *  Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project, and are case insensitive.
    *  For more information, see Email uniquenes.</p>
    */
    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getTitle() {
        return this.title;
    }

    /**
    *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
    */
    @Deprecated
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    /**
    *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
    */
    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    /**
    *  <p>Identifies carts and orders belonging to an anonymous session that will be assigned to the new customer account.</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getVatId() {
        return this.vatId;
    }

    /**
    *  <p>Sets the ID of each address to be unique in the addresses list.</p>
    */
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    public Long getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
    *  <p>The indices of the shipping addresses in the addresses array.
    *  The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
    */
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    public Long getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
    *  <p>The indices of the billing addresses in the addresses array.
    *  The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
    *  <p>Must be one of the languages supported for this project</p>
    */
    public String getLocale() {
        return this.locale;
    }

    public String getSalutation() {
        return this.salutation;
    }

    /**
    *  <p>User-specific unique identifier for a customer.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>References to the stores the customer account is associated with.
    *  If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers.
    *  If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
    */
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
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

    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
    }

    public void setAnonymousCart(final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
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

    public void setShippingAddresses(final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
    }

    public void setShippingAddresses(final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public void setDefaultBillingAddress(final Long defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public void setBillingAddresses(final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
    }

    public void setBillingAddresses(final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public void setIsEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    public void setKey(final String key) {
        this.key = key;
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

        CustomerDraftImpl that = (CustomerDraftImpl) o;

        return new EqualsBuilder().append(customerNumber, that.customerNumber)
                .append(email, that.email)
                .append(password, that.password)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(anonymousCartId, that.anonymousCartId)
                .append(anonymousCart, that.anonymousCart)
                .append(anonymousId, that.anonymousId)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(addresses, that.addresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(isEmailVerified, that.isEmailVerified)
                .append(externalId, that.externalId)
                .append(customerGroup, that.customerGroup)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(salutation, that.salutation)
                .append(key, that.key)
                .append(stores, that.stores)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customerNumber)
                .append(email)
                .append(password)
                .append(firstName)
                .append(lastName)
                .append(middleName)
                .append(title)
                .append(anonymousCartId)
                .append(anonymousCart)
                .append(anonymousId)
                .append(dateOfBirth)
                .append(companyName)
                .append(vatId)
                .append(addresses)
                .append(defaultShippingAddress)
                .append(shippingAddresses)
                .append(defaultBillingAddress)
                .append(billingAddresses)
                .append(isEmailVerified)
                .append(externalId)
                .append(customerGroup)
                .append(custom)
                .append(locale)
                .append(salutation)
                .append(key)
                .append(stores)
                .toHashCode();
    }

}

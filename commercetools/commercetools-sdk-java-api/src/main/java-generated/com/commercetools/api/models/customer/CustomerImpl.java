
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerImpl implements Customer, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String customerNumber;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String middleName;

    private String title;

    private java.time.LocalDate dateOfBirth;

    private String companyName;

    private String vatId;

    private java.util.List<com.commercetools.api.models.common.Address> addresses;

    private String defaultShippingAddressId;

    private java.util.List<String> shippingAddressIds;

    private String defaultBillingAddressId;

    private java.util.List<String> billingAddressIds;

    private Boolean isEmailVerified;

    private String externalId;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.type.CustomFields custom;

    private String locale;

    private String salutation;

    private String key;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    @JsonCreator
    CustomerImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("email") final String email,
            @JsonProperty("password") final String password, @JsonProperty("firstName") final String firstName,
            @JsonProperty("lastName") final String lastName, @JsonProperty("middleName") final String middleName,
            @JsonProperty("title") final String title,
            @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth,
            @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses,
            @JsonProperty("defaultShippingAddressId") final String defaultShippingAddressId,
            @JsonProperty("shippingAddressIds") final java.util.List<String> shippingAddressIds,
            @JsonProperty("defaultBillingAddressId") final String defaultBillingAddressId,
            @JsonProperty("billingAddressIds") final java.util.List<String> billingAddressIds,
            @JsonProperty("isEmailVerified") final Boolean isEmailVerified,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("locale") final String locale, @JsonProperty("salutation") final String salutation,
            @JsonProperty("key") final String key,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores,
            @JsonProperty("authenticationMode") final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.customerNumber = customerNumber;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.addresses = addresses;
        this.defaultShippingAddressId = defaultShippingAddressId;
        this.shippingAddressIds = shippingAddressIds;
        this.defaultBillingAddressId = defaultBillingAddressId;
        this.billingAddressIds = billingAddressIds;
        this.isEmailVerified = isEmailVerified;
        this.externalId = externalId;
        this.customerGroup = customerGroup;
        this.custom = custom;
        this.locale = locale;
        this.salutation = salutation;
        this.key = key;
        this.stores = stores;
        this.authenticationMode = authenticationMode;
    }

    public CustomerImpl() {
    }

    /**
    *  <p>The unique ID of the customer.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The current version of the customer.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>The customer number can be used to create a more human-readable (in contrast to ID) identifier for the customer.
    *  It should be unique across a project.
    *  Once the field was set it cannot be changed anymore.</p>
    */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
    *  <p>The customer's email address and the main identifier of uniqueness for a customer account.
    *  Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project.
    *  For more information, see Email uniquenes.</p>
    */
    public String getEmail() {
        return this.email;
    }

    /**
    *  <p>Only present with the default <code>authenticationMode</code>, <code>Password</code>.</p>
    */
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
    *  <p>The addresses have unique IDs in the addresses list</p>
    */
    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
    *  <p>The address ID in the addresses list</p>
    */
    public String getDefaultShippingAddressId() {
        return this.defaultShippingAddressId;
    }

    /**
    *  <p>The IDs from the addresses list which are used as shipping addresses</p>
    */
    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    /**
    *  <p>The address ID in the addresses list</p>
    */
    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    /**
    *  <p>The IDs from the addresses list which are used as billing addresses</p>
    */
    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

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
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
    *  <p>Defines whether a Customer has a password.</p>
    */
    public com.commercetools.api.models.customer.AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
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

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public void setVatId(final String vatId) {
        this.vatId = vatId;
    }

    public void setAddresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
    }

    public void setDefaultShippingAddressId(final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
    }

    public void setShippingAddressIds(final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
    }

    public void setShippingAddressIds(final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
    }

    public void setDefaultBillingAddressId(final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
    }

    public void setBillingAddressIds(final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
    }

    public void setBillingAddressIds(final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
    }

    public void setIsEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
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

    public void setStores(final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
    }

    public void setAuthenticationMode(
            final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerImpl that = (CustomerImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(customerNumber, that.customerNumber)
                .append(email, that.email)
                .append(password, that.password)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(addresses, that.addresses)
                .append(defaultShippingAddressId, that.defaultShippingAddressId)
                .append(shippingAddressIds, that.shippingAddressIds)
                .append(defaultBillingAddressId, that.defaultBillingAddressId)
                .append(billingAddressIds, that.billingAddressIds)
                .append(isEmailVerified, that.isEmailVerified)
                .append(externalId, that.externalId)
                .append(customerGroup, that.customerGroup)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(salutation, that.salutation)
                .append(key, that.key)
                .append(stores, that.stores)
                .append(authenticationMode, that.authenticationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(customerNumber)
                .append(email)
                .append(password)
                .append(firstName)
                .append(lastName)
                .append(middleName)
                .append(title)
                .append(dateOfBirth)
                .append(companyName)
                .append(vatId)
                .append(addresses)
                .append(defaultShippingAddressId)
                .append(shippingAddressIds)
                .append(defaultBillingAddressId)
                .append(billingAddressIds)
                .append(isEmailVerified)
                .append(externalId)
                .append(customerGroup)
                .append(custom)
                .append(locale)
                .append(salutation)
                .append(key)
                .append(stores)
                .append(authenticationMode)
                .toHashCode();
    }

}


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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>If <code>stores</code> is not empty, the Customer is specific to those Stores.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerImpl implements Customer, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private String customerNumber;

    private String externalId;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

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

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    private com.commercetools.api.models.type.CustomFields custom;

    private String locale;

    private String salutation;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key, @JsonProperty("customerNumber") final String customerNumber,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("email") final String email, @JsonProperty("password") final String password,
            @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName,
            @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title,
            @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth,
            @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses,
            @JsonProperty("defaultShippingAddressId") final String defaultShippingAddressId,
            @JsonProperty("shippingAddressIds") final java.util.List<String> shippingAddressIds,
            @JsonProperty("defaultBillingAddressId") final String defaultBillingAddressId,
            @JsonProperty("billingAddressIds") final java.util.List<String> billingAddressIds,
            @JsonProperty("isEmailVerified") final Boolean isEmailVerified,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("customerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("locale") final String locale, @JsonProperty("salutation") final String salutation,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores,
            @JsonProperty("authenticationMode") final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.customerNumber = customerNumber;
        this.externalId = externalId;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
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
        this.customerGroup = customerGroup;
        this.customerGroupAssignments = customerGroupAssignments;
        this.custom = custom;
        this.locale = locale;
        this.salutation = salutation;
        this.stores = stores;
        this.authenticationMode = authenticationMode;
    }

    /**
     * create empty instance
     */
    public CustomerImpl() {
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Customer.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Customer was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Customer was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     */

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     *  <p>Optional identifier for use in external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>IDs and references that last modified the Customer.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Customer.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Email address of the Customer that is <span>unique</span> for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Present only when <code>authenticationMode</code> is set to <code>Password</code>.</p>
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
     *  <p>Addresses used by the Customer.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default shipping address.</p>
     */

    public String getDefaultShippingAddressId() {
        return this.defaultShippingAddressId;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     */

    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default billing address.</p>
     */

    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     */

    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    /**
     *  <p>Indicates whether the email address of the Customer is <span>verified</span>.</p>
     */

    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> to which the Customer belongs.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Customer Groups that the Customer belongs to.</p>
     *  <p>Used for <span>Line Item price selection</span>.</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Preferred language of the Customer.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    public String getSalutation() {
        return this.salutation;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If <code>stores</code> is empty, the Customer is a global customer, and can log in using the <span>Password Flow for global Customers</span>.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the <span>Password Flow for Customers in a Store</span> for those specific Stores.</li>
     *  </ul>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Indicates whether the <code>password</code> is required for the Customer.</p>
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

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
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

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
    }

    public void setCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
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
                .append(key, that.key)
                .append(customerNumber, that.customerNumber)
                .append(externalId, that.externalId)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
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
                .append(customerGroup, that.customerGroup)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(salutation, that.salutation)
                .append(stores, that.stores)
                .append(authenticationMode, that.authenticationMode)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(customerNumber, that.customerNumber)
                .append(externalId, that.externalId)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
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
                .append(customerGroup, that.customerGroup)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(salutation, that.salutation)
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
                .append(key)
                .append(customerNumber)
                .append(externalId)
                .append(lastModifiedBy)
                .append(createdBy)
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
                .append(customerGroup)
                .append(customerGroupAssignments)
                .append(custom)
                .append(locale)
                .append(salutation)
                .append(stores)
                .append(authenticationMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("key", key)
                .append("customerNumber", customerNumber)
                .append("externalId", externalId)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("email", email)
                .append("password", password)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("middleName", middleName)
                .append("title", title)
                .append("dateOfBirth", dateOfBirth)
                .append("companyName", companyName)
                .append("vatId", vatId)
                .append("addresses", addresses)
                .append("defaultShippingAddressId", defaultShippingAddressId)
                .append("shippingAddressIds", shippingAddressIds)
                .append("defaultBillingAddressId", defaultBillingAddressId)
                .append("billingAddressIds", billingAddressIds)
                .append("isEmailVerified", isEmailVerified)
                .append("customerGroup", customerGroup)
                .append("customerGroupAssignments", customerGroupAssignments)
                .append("custom", custom)
                .append("locale", locale)
                .append("salutation", salutation)
                .append("stores", stores)
                .append("authenticationMode", authenticationMode)
                .build();
    }

    @Override
    public Customer copyDeep() {
        return Customer.deepCopy(this);
    }
}
